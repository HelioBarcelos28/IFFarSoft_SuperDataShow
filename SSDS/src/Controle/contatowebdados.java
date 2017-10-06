package Controle;

import Model.contatoweb;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class contatowebdados {
    //Criando a conexão

private Connection conexao;  
//CLASSE PACOTE BANCODADOS
public contatowebdados() throws SQLException {       

	this.conexao=CriaConexao.getConexao();

 }

//Código para adicionar dados no banco de dados

//CLASSE PCT METODOS
public void adiciona (contatoweb X) throws SQLException { 

//ATENÇÃO: NOME_TABELA_MYSQL = nome da tabela do banco de dados MySQL Administrador

	String sql = "insert into contaweb (nome,rua,bairro,cidade,telefone,data,email,sexo)  values (?,?,?,?,?,?,?,?)";


	PreparedStatement stmt = conexao.prepareStatement(sql);
	stmt.setString (1,X.getNome());
	stmt.setString (2,X.getRua());
	stmt.setString (3,X.getBairro());
	stmt.setString(4,X.getCidade());
        stmt.setString(5,X.getTelefone());
        stmt.setString(6,X.getData());
        stmt.setString(7,X.getEmail());
        stmt.setString(8,X.getSexo());
       
	
	stmt.execute();
	stmt.close();
   }

// Alterando dados no banco de dados
//CLASSE PCT METODOS
public void altera (contatoweb X) throws SQLException { 

//ATENÇÃO: NOME_TABELA_MYSQL = nome da tabela do banco de dados MySQL Administrador
	
String sql = "update contatoweb set nome=?,rua=?,bairro=?,cidade=?,telefone=?,data=?,email=?,sexo=?  where  idcontatoweb=?";



	PreparedStatement stmt = conexao.prepareStatement(sql);
	stmt.setString (1,X.getNome());
	stmt.setString (2,X.getRua());
	stmt.setString (3,X.getBairro());
        stmt.setString (4,X.getCidade());
        stmt.setString (5,X.getTelefone());
        stmt.setString (6,X.getData());
        stmt.setString (7,X.getEmail());
        stmt.setString (8,X.getSexo());
       
	stmt.setInt (9,X.getIdcontatoweb());

	stmt.execute();
	stmt.close();
}
 

//PESQUISAR

//CLASSE PCT METODOS
public List <contatoweb> getLista(String nome)throws SQLException { 


//ATENÇÃO: NOME_TABELA_MYSQL = nome da tabela do banco de dados MySQL Administrador

	String sql="select * from contatoweb where nome like ?";
	PreparedStatement stmt = this.conexao.prepareStatement(sql);
	stmt.setString (1,nome);

//atraves da linha acima ele vai filtar a pesquisa somente pelo que eu digitei na caixa de texto da pesquisa

	ResultSet rs=stmt.executeQuery();

// CLASSE PCT METODOS
	List <contatoweb> minhaLista = new ArrayList <contatoweb>(); 

	while (rs.next()){
	contatoweb X = new contatoweb ();
	X.setIdcontatoweb(Integer.parseInt(rs.getString("idcontatoweb")));
	X.setNome(rs.getString("nome"));
	X.setRua(rs.getString("rua"));
	X.setBairro(rs.getString("bairro"));
        X.setCidade(rs.getString("cidade"));
        X.setTelefone(rs.getString("telefone"));
        X.setData(rs.getString("data"));
        X.setEmail(rs.getString("email"));
        X.setSexo(rs.getString("sexo"));
       
	minhaLista.add(X);
        
	}

	rs.close ();
	stmt.close();
	return minhaLista;
}

//EXCLUIR

//CLASSE PCT METODOS
public void remove (contatoweb X) throws SQLException { 

//ATENÇÃO: NOME_TABELA_MYSQL = nome da tabela do banco de dados MySQL Administrador

	String sql = "delete from contatoweb where (idcontatoweb=?)";
	PreparedStatement stmt = conexao.prepareStatement(sql);
	stmt.setInt (1,X.getIdcontatoweb());

	stmt.execute();
	stmt.close();
    }





}
