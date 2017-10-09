/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Guilherme
 */
public class CriaConexao {
   public static  Connection getConexao()throws SQLException{
	try {
	Class.forName("com.mysql.jdbc.Driver");
	System.out.println ("Conectando ao banco");

//NOME_BASE_DADOS = Nome da base de dados no MySQL
	return DriverManager.getConnection("jdbc:mysql://localhost/IFFarSoft_SuperDataShow/SSDS/Projetor","root","");

    } 	catch (ClassNotFoundException e ){
        	System.out.println("Problemas na conexão do banco !!!");
        	throw new SQLException(e.getMessage());

    }
    } 
   public static Connection AbrirConexao() {

        Connection con = null;

        try {

            Class.forName("org.postgresql.Driver").newInstance();
            
            
            String URL = "jdbc:postgresql://localhost:5432/Projetor";
            String usuario = "postgres";
            String senha = "ciet";
            
            con = DriverManager.getConnection(URL, usuario, senha);
            System.out.println("Conexão aberta");

        } catch (SQLException e) {
            System.out.println("Erro de Conexão" + e.getMessage());

        } catch (ClassNotFoundException e1) {
            System.out.println("Erro Classe" + e1.getMessage());
            
        } catch (Exception e2) {
            System.out.println("Erro Exception" + e2.getMessage());
        }

        return con;
    }
}
