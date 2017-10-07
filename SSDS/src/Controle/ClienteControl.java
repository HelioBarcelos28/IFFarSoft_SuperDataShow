package Controle;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Controle.CriaConexao;
import Model.Clientes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ClienteControl {
    //Criando a conexão

private Connection conexao;  
//CLASSE PACOTE BANCODADOS
public ClienteControl() throws SQLException {       

	this.conexao=CriaConexao.getConexao();

 }

//Código para adicionar dados no banco de dados

//CLASSE PCT METODOS
public String adicionaCliente (Clientes X) { 

	String sql = "insert into Cliente  ( Estado , Cep , RazaoSocial , CNPJ , Email , Telefone , Rua , Cidade , NomeContato)  values (?,?,?,?,?,?,?,?,?) ";

        try {
               
              PreparedStatement stmt = conexao.prepareStatement(sql);
              stmt.setString(1,X.getEstado());
              stmt.setString(2,X.getCep());
              stmt.setString(3,X.getRazaoSocial());
              stmt.setString(4,X.getCNPJ());
              stmt.setString(5,X.getEmail());
              stmt.setString(6,X.getTelefone());
              stmt.setString(7,X.getRua());
              stmt.setString(8,X.getCidade());
              stmt.setString(9,X.getNomeContato());
               
               if (stmt.executeUpdate() > 0) {

                    return "Inclusão de novo Cliente realizada com sucesso.";
               } else {

                    return "Erro ao tentar incluir novo Cliente.";
               }
                   
          } catch (SQLException e) {
               
               return e.getMessage();
          }
     }

     public String AtualizarCliente(Clientes X, String cod){
         String sql = "update cliente set Estado =? , Cep =? , RazaoSocial =? , CNPJ =?, Email=? , Telefone=? , Rua=? , Cidade =? where  idCliente ='"+Integer.parseInt(cod)+"';"; 
         
         try {
             PreparedStatement stmt = conexao.prepareStatement(sql);
              stmt.setString(1,X.getEstado());
              stmt.setString(2,X.getCep());
              stmt.setString(3,X.getRazaoSocial());
              stmt.setString(4,X.getCNPJ());
              stmt.setString(5,X.getEmail());
              stmt.setString(6,X.getTelefone());
              stmt.setString(7,X.getRua());
              stmt.setString(8,X.getCidade());
              stmt.setString(9,X.getNomeContato());
               
               if (stmt.executeUpdate() > 0) {

                    return "Inclusão de novo Cliente realizada com sucesso.";
               } else {

                    return "Erro ao tentar incluir novo Cliente.";
               }
         } catch (Exception e) {
             return e.getMessage();
         }
         
     }
     
       public String ExcluirCliente(Clientes X, String cod) {
          
          String sql = "DELETE FROM cliente WHERE IdCliente = '"+
                  Integer.parseInt(cod)+"';";
           
          try {
               
               PreparedStatement stmt = conexao.prepareStatement(sql);
               
               
               if (stmt.executeUpdate() > 0) {

                    return "Exclusão de compra realizada com sucesso.";
               } else {

                    return "Erro ao tentar excluir compra."; 
               }
          } catch (SQLException e) {
               
               return e.getMessage();
          }
     }
       
     public List<Clientes> ListarTodosClientes(){
         String SQL = "SELECT * FROM cliente;"; 

        List<Clientes> lc = new ArrayList<Clientes>();
       try {

               PreparedStatement ps = conexao.prepareStatement(SQL);
               ResultSet rs = ps.executeQuery();

               if (rs != null) {

                    while (rs.next()) {

                         Clientes c = new Clientes();
                         
                         c.setCep(rs.getString("Cep"));
                         c.setRazaoSocial(rs.getString("RazaoSocial"));
                         c.setCNPJ(rs.getString("CNPJ"));
                         c.setEmail(rs.getString("Email"));
                         c.setTelefone(rs.getString("Telefone"));
                         c.setRua(rs.getString("Rua"));
                         c.setCidade(rs.getString("Cidade"));
                         c.setNomeContato(rs.getString("NomeContato"));
                         
                          
                        

                         lc.add(c);
                    }
               }

               return lc;

          } catch (SQLException e) {
               
               return null;
          }
     }
     
}