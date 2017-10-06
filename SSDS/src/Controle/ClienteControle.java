package Controle;

import Model.cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ClienteControle {
    //Criando a conexão

private Connection conexao;  
//CLASSE PACOTE BANCODADOS
public ClienteControle() throws SQLException {       

	this.conexao=CriaConexao.getConexao();

 }

//Código para adicionar dados no banco de dados

//CLASSE PCT METODOS
public void adiciona (cliente X) throws SQLException { 

//ATENÇÃO: NOME_TABELA_MYSQL = nome da tabela do banco de dados MySQL Administrador

	String sql = "insert into cliente  (nome,tiposervico,cpf,sexo,datanasc,cidade,endereco,telefone)  values (?,?,?,?,?,?,?,?) ";


	PreparedStatement stmt = conexao.prepareStatement(sql);
	stmt.setString (1,X.getNome());
         stmt.setString (2,X.getTiposervico());
        stmt.setString (3,X.getCpf());
        stmt.setString(4,X.getSexo());
         stmt.setString(5,X.getDatanasc());
        
         stmt.setString(6,X.getCidade());
         stmt.setString(7,X.getEndereco());
          stmt.setString(8,X.getTelefone());
	
	
	stmt.execute();
	stmt.close();
   }

// Alterando dados no banco de dados
//CLASSE PCT METODOS
public void altera (cliente X) throws SQLException { 

//ATENÇÃO: NOME_TABELA_MYSQL = nome da tabela do banco de dados MySQL Administrador
	
String sql = "update cliente set nome=?,tiposervico=?,cpf=?,sexo=?,datanasc=?,cidade=?,endereco=?,telefone=?  where  idcliente=?";


	PreparedStatement stmt = conexao.prepareStatement(sql);
	
	stmt.setString (1,X.getNome());
        stmt.setString (2,X.getTiposervico());
        stmt.setString (3,X.getCpf());
        stmt.setString (4,X.getSexo());
        stmt.setString (5,X.getDatanasc());
       
        stmt.setString (6,X.getCidade());
        stmt.setString (7,X.getEndereco());
        stmt.setString(8,X.getTelefone());
        stmt.setInt(9,X.getIdcliente());
	stmt.execute();
	stmt.close();
}
 

//PESQUISAR

//CLASSE PCT METODOS
public List <cliente> getLista(String nome)throws SQLException { 


//ATENÇÃO: NOME_TABELA_MYSQL = nome da tabela do banco de dados MySQL Administrador

	String sql="select * from cliente where nome like ?";
	PreparedStatement stmt = this.conexao.prepareStatement(sql);
	stmt.setString (1,nome);

//atraves da linha acima ele vai filtar a pesquisa somente pelo que eu digitei na caixa de texto da pesquisa

	ResultSet rs=stmt.executeQuery();

// CLASSE PCT METODOS
	List <cliente> minhaLista = new ArrayList <cliente>(); 

	while (rs.next()){
	cliente X = new cliente ();
	X.setIdcliente(Integer.parseInt(rs.getString("idcliente")));
	
        X.setNome(rs.getString("nome"));
        X.setTiposervico(rs.getString("tiposervico"));
        X.setCpf(rs.getString("cpf"));
        X.setSexo(rs.getString("sexo"));
        X.setDatanasc(rs.getString("datanasc"));
        
        X.setCidade(rs.getString("cidade"));
        X.setEndereco(rs.getString("endereco"));
        X.setTelefone(rs.getString("telefone"));
	minhaLista.add(X);
        
	}

	rs.close ();
	stmt.close();
	return minhaLista;
}

//EXCLUIR

//CLASSE PCT METODOS
public void remove (cliente X) throws SQLException { 

//ATENÇÃO: NOME_TABELA_MYSQL = nome da tabela do banco de dados MySQL Administrador

	String sql = "delete from cliente where (idcliente=?)";
	PreparedStatement stmt = conexao.prepareStatement(sql);
	stmt.setInt (1,X.getIdcliente());

	stmt.execute();
	stmt.close();
    }





}
