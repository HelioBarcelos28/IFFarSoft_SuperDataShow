package Controle;

import Model.servicos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class servicosdados {
    //Criando a conexão

private Connection conexao;  
//CLASSE PACOTE BANCODADOS
public servicosdados() throws SQLException {       

	this.conexao=CriaConexao.getConexao();

 }

//Código para adicionar dados no banco de dados

//CLASSE PCT METODOS
public void adiciona (servicos X) throws SQLException { 

//ATENÇÃO: NOME_TABELA_MYSQL = nome da tabela do banco de dados MySQL Administrador

	String sql = "insert into servicos (nomecliente,tiposervico,funcionario,setor,valorunitario,quantidade,valortotal,dataservico)  values (?,?,?,?,?,?,?,?)";


        PreparedStatement stmt = conexao.prepareStatement(sql);
	stmt.setString (1,X.getNomecliente());
	stmt.setString (2,X.getTiposervico());
        stmt.setString (3,X.getFuncionario());
	stmt.setString (4,X.getSetor());
        stmt.setFloat(5,X.getValorunitario());
        stmt.setInt (6,X.getQuantidade());
        stmt.setFloat(7,X.getValortotal());
        stmt.setString (8,X.getDataservico());
	stmt.execute();
	stmt.close();
   }

// Alterando dados no banco de dados
//CLASSE PCT METODOS
public void altera (servicos X) throws SQLException { 

//ATENÇÃO: NOME_TABELA_MYSQL = nome da tabela do banco de dados MySQL Administrador
	
String sql = "update servicos set nomecliente=?,tiposervico=?,funcionario=?,setor=?,valorunitario=?,quantidade=?,valortotal=?,dataservico=? where  idservicos=?";


	PreparedStatement stmt = conexao.prepareStatement(sql);
	stmt.setString (1,X.getNomecliente());
        stmt.setString (2,X.getTiposervico());
	stmt.setString (3,X.getFuncionario());
        stmt.setString (4,X.getSetor());
        stmt.setFloat(5,X.getValorunitario());
        stmt.setInt (6,X.getQuantidade());
        stmt.setFloat(7,X.getValortotal());
	stmt.setString (8,X.getDataservico());
        stmt.setInt (9,X.getIdservicos());

	stmt.execute();
	stmt.close();
}
 

//PESQUISAR

//CLASSE PCT METODOS
public List <servicos> getLista(String nomecliente)throws SQLException { 


//ATENÇÃO: NOME_TABELA_MYSQL = nome da tabela do banco de dados MySQL Administrador

	String sql="select * from servicos where nomecliente like ?";
	PreparedStatement stmt = this.conexao.prepareStatement(sql);
	stmt.setString (1,nomecliente);

//atraves da linha acima ele vai filtar a pesquisa somente pelo que eu digitei na caixa de texto da pesquisa

	ResultSet rs=stmt.executeQuery();

// CLASSE PCT METODOS
	List <servicos> minhaLista = new ArrayList <servicos>(); 

	while (rs.next()){
	servicos X = new servicos ();
	X.setIdservicos(Integer.parseInt(rs.getString("idservicos")));
	X.setNomecliente(rs.getString("nomecliente"));
	X.setTiposervico(rs.getString("tiposervico"));
        X.setFuncionario(rs.getString("funcionario"));
        X.setSetor(rs.getString("setor"));
        X.setValorunitario(Float.parseFloat(rs.getString("valorunitario")));
        X.setQuantidade(Integer.parseInt(rs.getString("quantidade")));
        X.setValortotal(Float.parseFloat(rs.getString("valortotal")));
	X.setDataservico(rs.getString("dataservico")); 
        minhaLista.add(X);
        
	}

	rs.close ();
	stmt.close();
	return minhaLista;
}

//EXCLUIR

//CLASSE PCT METODOS
public void remove (servicos X) throws SQLException { 

//ATENÇÃO: NOME_TABELA_MYSQL = nome da tabela do banco de dados MySQL Administrador

	String sql = "delete from servicos where (idservicos=?)";
	PreparedStatement stmt = conexao.prepareStatement(sql);
	stmt.setInt (1,X.getIdservicos());

	stmt.execute();
	stmt.close();
    }





}
