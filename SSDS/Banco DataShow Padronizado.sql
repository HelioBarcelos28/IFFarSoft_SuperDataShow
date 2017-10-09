CREATE TABLE Cliente (

idCliente		SERIAL,
estado 			CHAR(2) NOT NULL,
cep 			CHAR(9) NOT NULL,
razaoSocial 		VARCHAR(30) NOT NULL,
cnpj 			CHAR(14) NOT NULL,
email 			VARCHAR(50) NOT NULL,
telefone 		CHAR(11) NOT NULL,
rua 			VARCHAR(100) NOT NULL, 
cidade 			VARCHAR(50) NOT NULL,
nomeContato 		VARCHAR(50) NOT NULL, 

CONSTRAINT pk_Cliente_idCliente PRIMARY KEY (idCliente));

INSERT INTO Cliente VALUES (DEFAULT, 'RS', 'cep1', 'razao1', 'cnpj1', 'email1', 'telefone1', 'rua1', 'cidade1', 'nomeContato1');
INSERT INTO Cliente VALUES (DEFAULT, 'SC', 'cep2', 'razao2', 'cnpj2', 'email2', 'telefone2', 'rua2', 'cidade2', 'nomeContato2');
INSERT INTO Cliente VALUES (DEFAULT, 'SC', 'cep2', 'razao3', 'cnpj3', 'email3', 'telefone3', 'rua3', 'cidade2', 'nomeContato3');
INSERT INTO Cliente VALUES (DEFAULT, 'SC', 'cep3', 'razao4', 'cnpj4', 'email4', 'telefone4', 'rua4', 'cidade3', 'nomeContato4');
INSERT INTO Cliente VALUES (DEFAULT, 'RS', 'cep1', 'razao5', 'cnpj5', 'email5', 'telefone5', 'rua5', 'cidade1', 'nomeContato5');


CREATE TABLE Projetor (

idProjetor		SERIAL,
marca 			VARCHAR(30),
modelo	 		VARCHAR(40),
numeroSerie 		VARCHAR(10),
dataCompra 		DATE,
ansiLumens 		VARCHAR(5),
estado 			CHAR(1),
preco 			NUMERIC(7, 2),
numeroHorasUso		INTEGER,

CONSTRAINT pk_Projetor_idProjetor PRIMARY KEY (idProjetor),
CONSTRAINT ck_Projetor_estado CHECK (estado IN ('L', 'M', 'D')));

INSERT INTO Projetor VALUES (DEFAULT, 'marca1', 'modelo1', 'numSerie1', '10-05-2017', '?', 'D', 50, 30);
INSERT INTO Projetor VALUES (DEFAULT, 'marca2', 'modelo2', 'numSerie2', '10-06-2017', '?', 'D', 40, 10);
INSERT INTO Projetor VALUES (DEFAULT, 'marca3', 'modelo3', 'numSerie3', '10-05-2017', '?', 'D', 40, 10);
INSERT INTO Projetor VALUES (DEFAULT, 'marca4', 'modelo4', 'numSerie4', '10-05-2017', '?', 'D', 50, 50);
INSERT INTO Projetor VALUES (DEFAULT, 'marca1', 'modelo1', 'numSerie5', '10-06-2017', '?', 'D', 50, 10);


CREATE TABLE Locacao (

idLocacao 		SERIAL,
valorLocacao 		NUMERIC(7, 2),
dataLocacao 		DATE,
dataDevolucaoPrevista   DATE,
dataDevolucao 		DATE,
horasUsadas		INTEGER,
idProjetor 		INTEGER,
idCliente 		INTEGER,
valorMulta 		NUMERIC(7, 2),

CONSTRAINT pk_Locacao_idLocacao PRIMARY KEY (idLocacao),
CONSTRAINT fk_Cliente_idCliente FOREIGN KEY (idCliente) REFERENCES Cliente(idCliente),
CONSTRAINT fk_Projetor_idProjetor FOREIGN KEY (idProjetor) REFERENCES Projetor(idProjetor));

INSERT INTO Locacao VALUES (DEFAULT, 50, CURRENT_DATE, CURRENT_DATE + 3, CURRENT_DATE + 5, 50, 1, 1, 0);
INSERT INTO Locacao VALUES (DEFAULT, 50, CURRENT_DATE, CURRENT_DATE + 3, CURRENT_DATE + 5, 50, 2, 1, 0);
INSERT INTO Locacao VALUES (DEFAULT, 50, CURRENT_DATE, CURRENT_DATE + 3, CURRENT_DATE + 1, 50, 3, 1, 0);
INSERT INTO Locacao VALUES (DEFAULT, 50, CURRENT_DATE, CURRENT_DATE + 3, CURRENT_DATE + 1, 50, 3, 1, 0);

SELECT * FROM Cliente;

SELECT * FROM Projetor;

SELECT * FROM Locacao;

SELECT C.razaoSocial, P.modelo, P.marca, P.numeroSerie, L.valorLocacao, L.dataLocacao, L.dataDevolucao
FROM Cliente C, Projetor P, Locacao L
WHERE C.idCliente = L.idCliente AND P.idProjetor = L.idProjetor


/*gatinhos*/

/*Indisponibiliza o Datashow para locação, seta a data de locação e calcula o preço da locação*/
CREATE TRIGGER trocaestado
AFTER INSERT ON locacao
FOR EACH ROW EXECUTE PROCEDURE troca_estado();

CREATE OR REPLACE FUNCTION troca_estado()
RETURNS TRIGGER AS $troca_estado$
DECLARE
	
BEGIN
	IF((SELECT ValorLocacao FROM Locacao WHERE idLocacao = new.idLocacao )IS NULL) THEN
		UPDATE projetor 
		SET estado = 'L' 
		WHERE idProjetor = new.idProjetor;
		/* Deixar os campos da tabela locação (valorlocacao, valormulta) desativados*/
		UPDATE locacao SET dataLocacao = 
		(SELECT CURRENT_DATE)
		WHERE idLocacao = new.idLocacao;
	
		UPDATE locacao
		SET valorLocacao = 
			(SELECT (preco*(dataDevolucaoPrevista - dataLocacao))
			FROM projetor
			WHERE idProjetor = new.idProjetor)
		WHERE idLocacao = new.idLocacao;
		
	END IF;
	RETURN NEW;
END;
$troca_estado$ LANGUAGE PLPGSQL;

/*Disponibiliza o DataShow para uma nova locação*/
CREATE TRIGGER disponds
AFTER UPDATE ON locacao
FOR EACH ROW EXECUTE PROCEDURE disponds();

CREATE OR REPLACE FUNCTION disponds()
RETURNS TRIGGER AS $disponds$
DECLARE
	
BEGIN
	IF((SELECT dataDevolucao FROM Locacao WHERE idLocacao = new.idLocacao) IS NOT NULL) THEN
	
		UPDATE projetor
		SET estado = 'D' 
		WHERE idProjetor = new.idProjetor;
		
	END IF;
	RETURN NEW;
END;
$disponds$ LANGUAGE PLPGSQL;

/*Valor Multa*/
CREATE TRIGGER SomaValorDaMulta
AFTER UPDATE OF dataDevolucao ON Locacao
FOR EACH ROW EXECUTE PROCEDURE SomaValorDaMulta();

	CREATE OR REPLACE FUNCTION SomaValorDaMulta()
	RETURNS TRIGGER AS $SomaValorDaMulta$

	BEGIN

		IF (NEW.dataDevolucaoPrevista < NEW.dataDevolucao) THEN

			UPDATE Locacao
			SET valorMulta =  (NEW.dataDevolucao - NEW.dataDevolucaoPrevista)* (SELECT preco FROM Projetor P
			WHERE P.idProjetor = NEW.idProjetor)
			WHERE idLocacao = NEW.idLocacao;
		END IF;
		RETURN NEW;
	END; $SomaValorDaMulta$ LANGUAGE PLPGSQL;

/* Numero de Horas Usados*/
CREATE TRIGGER HorasDeUso
AFTER UPDATE OF horasUsadas ON Locacao
FOR EACH ROW EXECUTE PROCEDURE HorasDeUso();

	CREATE OR REPLACE FUNCTION HorasDeUso()
	RETURNS TRIGGER AS $HorasDeUso$

	BEGIN

		IF (NEW.horasUsadas >= 0) THEN

			UPDATE Projetor
			SET numeroHorasUso =  numeroHorasUso + (OLD.horasUsadas - NEW.horasUsadas)
			WHERE idProjetor = NEW.idProjetor;
		END IF;
		RETURN NEW;
	END; $HorasDeUso$ LANGUAGE PLPGSQL;

/* Manutenção dos Projetores */
CREATE TRIGGER ManutencaoProjetores
AFTER UPDATE OF numeroHorasUso ON Projetor
FOR EACH ROW EXECUTE PROCEDURE ManutencaoProjetores();

	CREATE OR REPLACE FUNCTION ManutencaoProjetores()
	RETURNS TRIGGER AS $ManutencaoProjetores$

	BEGIN

		IF (NEW.numeroHorasUso <= 0) THEN

			UPDATE Projetor
			SET estado =  'M'
			WHERE idProjetor = NEW.idProjetor;
		END IF;
		RETURN NEW;
	END; $ManutencaoProjetores$ LANGUAGE PLPGSQL;


