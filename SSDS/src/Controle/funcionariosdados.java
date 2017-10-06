package Controle;

import Model.funcionarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class funcionariosdados {
    //Criando a conexão

private Connection conexao;  
//CLASSE PACOTE BANCODADOS
public funcionariosdados() throws SQLException {       

	this.conexao=CriaConexao.getConexao();

 }

//Código para adicionar dados no banco de dados

//CLASSE PCT METODOS
public void adiciona (funcionarios X) throws SQLException { 

//ATENÇÃO: NOME_TABELA_MYSQL = nome da tabela do banco de dados MySQL Administrador

	String sql = "insert into funcionarios (nome,setor,cpf,datanasc,sexo,endereco,cidade,telefone,salario)  values (?,?,?,?,?,?,?,?,?)";


	PreparedStatement stmt = conexao.prepareStatement(sql);
	stmt.setString (1,X.getNome());
	stmt.setString (2,X.getSetor());
	stmt.setString (3,X.getCpf());
        stmt.setString (4,X.getDatanasc());
        stmt.setString (5,X.getSexo());
        stmt.setString (6,X.getEndereco());
        stmt.setString (7,X.getCidade());
        stmt.setString (8,X.getTelefone());
        stmt.setFloat (9,X.getSalario());
	
	stmt.execute();
	stmt.close();
   }

// Alterando dados no banco de dados
//CLASSE PCT METODOS
public void altera (funcionarios X) throws SQLException { 

//ATENÇÃO: NOME_TABELA_MYSQL = nome da tabela do banco de dados MySQL Administrador
	
String sql = "update funcionarios set nome=?,setor=?,cpf=?,datanasc=?,sexo=?,endereco=?,cidade=?,telefone=?,salario=?  where  idfuncionarios=?";


	PreparedStatement stmt = conexao.prepareStatement(sql);
	stmt.setString (1,X.getNome());
	stmt.setString (2,X.getSetor());
	stmt.setString (3,X.getCpf());
        stmt.setString (4,X.getDatanasc());
        stmt.setString (5,X.getSexo());
        stmt.setString (6,X.getEndereco());
        stmt.setString (7,X.getCidade());
        stmt.setString (8,X.getTelefone());
        stmt.setFloat (9,X.getSalario());  
	stmt.setInt (10,X.getIdfunionarios());
	

	stmt.execute();
	stmt.close();
}
 

//PESQUISAR

//CLASSE PCT METODOS
public List <funcionarios> getLista(String nome)throws SQLException { 


//ATENÇÃO: NOME_TABELA_MYSQL = nome da tabela do banco de dados MySQL Administrador

	String sql="select * from funcionarios where nome like ?";
	PreparedStatement stmt = this.conexao.prepareStatement(sql);
	stmt.setString (1,nome );

//atraves da linha acima ele vai filtar a pesquisa somente pelo que eu digitei na caixa de texto da pesquisa

	ResultSet rs=stmt.executeQuery();

// CLASSE PCT METODOS
	List <funcionarios> minhaLista = new ArrayList <funcionarios>(); 

	while (rs.next()){
	funcionarios X = new funcionarios ();
	X.setIdfunionarios(Integer.parseInt(rs.getString("idfuncionarios")));
	X.setNome(rs.getString("nome"));
	X.setSetor(rs.getString("setor"));
	X.setCpf(rs.getString("cpf"));
        X.setDatanasc(rs.getString("datanasc"));
        X.setSexo(rs.getString("sexo"));
        X.setEndereco(rs.getString("endereco"));
        X.setCidade(rs.getString("cidade"));
        X.setTelefone(rs.getString("telefone"));
        X.setSalario(rs.getFloat("salario"));
	minhaLista.add(X);
        
	}

	rs.close ();
	stmt.close();
	return minhaLista;
}

//EXCLUIR

//CLASSE PCT METODOS
public void remove (funcionarios X) throws SQLException { 

//ATENÇÃO: NOME_TABELA_MYSQL = nome da tabela do banco de dados MySQL Administrador

	String sql = "delete from funcionarios where (idfuncionarios=?)";
	PreparedStatement stmt = conexao.prepareStatement(sql);
	stmt.setInt (1,X.getIdfunionarios());

	stmt.execute();
	stmt.close();
    }





}
