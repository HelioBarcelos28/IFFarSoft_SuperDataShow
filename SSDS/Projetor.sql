CREATE TABLE Cliente(
  IdCliente  Serial,
  Estado CHAR(2) NOT NULL,
  Cep CHAR(9) NOT NULL,
  RazaoSocial VARCHAR(30) NOT NULL,
  CNPJ CHAR(14) NOT NULL,
  Email VARCHAR(50) NOT NULL,
  Telefone CHAR(11) NOT NULL,
  Rua VARCHAR(100) NOT NULL, 
  Cidade VARCHAR(50) NOT NULL,
  NomeContato VARCHAR(50) NOT NULL, 
CONSTRAINT pk_cliente PRIMARY KEY (IdCliente)
);

CREATE TABLE Projetores(
   IdProjetores  SERIAL,
   Marca VARCHAR(30),
   Modelos VARCHAR(40),
   NumSerie VARCHAR(10),
   DataCompra DATE,
   DataTrocaLampada DATE,
   Ansilumens VARCHAR(5),
   Estado CHAR(1),
   Preco NUMERIC(5,2),
CONSTRAINT pk_projetores PRIMARY KEY (IdProjetores),
CONSTRAINT ck_estado CHECK (estado IN ('L', 'M', 'D'))
);

CREATE TABLE Locacoes(
  IdLocacoes  SERIAL,
  ValorLocacao NUMERIC(5,2),
  DataLocacao DATE,
  DataDevolucao DATE,
  PrevistaDataDevolucao DATE,
  IdProjetor INTEGER,
  IdCliente INTEGER,
  ValorMulta NUMERIC(5,2),
CONSTRAINT pk_locacoes PRIMARY KEY (IdLocacoes),
CONSTRAINT fk_cliente_id FOREIGN KEY ( IdCliente) REFERENCES Cliente(IdCliente),
CONSTRAINT fk_projetores_id FOREIGN KEY (IdProjetor) REFERENCES Projetores(IdProjetores)
);

SELECT * FROM CLIENTE;

SELECT * FROM PROJETORES;

SELECT * FROM LOCACOES;

SELECT C.RAZAOSOCIAL, P.MODELOS, P.MARCA, P.NUMSERIE, L.VALORLOCACAO, L.DATALOCACAO, L.DATADEVOLUCAO
FROM CLIENTE C, PROJETORES P, LOCACOES L
WHERE C.ID = L.IDCLI AND P.ID = L.IDPROJ

CREATE TRIGGER TROCA_ESTADO
