/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Model.Projetores;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Helio
 */
public class ProjetorControl{
    //Criando a conexão

private Connection conexao;  
//CLASSE PACOTE BANCODADOS
public ProjetorControl() throws SQLException {       

	this.conexao= CriaConexao.getConexao();

 }

public String adiciona (Projetores X) { 

	String sql = "insert into Cliente  ( Estado , Cep , RazaoSocial , CNPJ , Email , Telefone , Rua , Cidade , NomeContato)  values (?,?,?,?,?,?,?,?,?) ";

        try {
               
              PreparedStatement stmt = conexao.prepareStatement(sql);
              
              stmt.setString(1,X.getMarca());
              stmt.setString(2,X.getModelo());
              stmt.setString(3,X.getNumSerie());
              stmt.setString(4,X.getDataCompra());
              stmt.setString(5,X.getDataTrocaLampada());
              stmt.setString(6,X.getAnsilumens());
              stmt.setString(7,X.getEstado());
              stmt.setDouble(8,X.getPreco());
               
               if (stmt.executeUpdate() > 0) {

                    return "Inclusão de novo Projetor realizada com sucesso.";
               } else {

                    return "Erro ao tentar incluir novo Projetor.";
               }
                   
          } catch (SQLException e) {
               
               return e.getMessage();
          }
     }

     public String AtualizarCliente( Projetores X, String cod){
         String sql = "update Projetores set marca =? , modelo =?, numSerie =?, dataCompra =?, dataTrocaLampada =?, ansilumens =? , estado =?, preco=?  where  IdProjetores ='"+Integer.parseInt(cod)+"';"; 
         
         try {
             PreparedStatement stmt = conexao.prepareStatement(sql);
              stmt.setString(1,X.getMarca());
              stmt.setString(2,X.getModelo());
              stmt.setString(3,X.getNumSerie());
              stmt.setString(4,X.getDataCompra());
              stmt.setString(5,X.getDataTrocaLampada());
              stmt.setString(6,X.getAnsilumens());
              stmt.setString(7,X.getEstado());
              stmt.setDouble(8,X.getPreco());
               
               if (stmt.executeUpdate() > 0) {

                    return "Atualização de novo Projetor realizada com sucesso.";
               } else {

                    return "Erro ao tentar Atualizar novo Projetor.";
               }
         } catch (Exception e) {
             return e.getMessage();
         }
         
     }
     
       public String ExcluirCliente(Projetores X, String cod) {
          
          String sql = "DELETE FROM Projetores WHERE IdProjetores = '"+
                  Integer.parseInt(cod)+"';";
           
          try {
               
               PreparedStatement stmt = conexao.prepareStatement(sql);
               
               
               if (stmt.executeUpdate() > 0) {

                    return "Exclusão de Projetor realizada com sucesso.";
               } else {

                    return "Erro ao tentar excluir`Projetor.";
               }
          } catch (SQLException e) {
               
               return e.getMessage();
          }
     }
       
     public List<Projetores> ListarTodosClientes(){
         String SQL = "SELECT * FROM cliente;"; 

        List<Projetores> lc = new ArrayList<Projetores>();
       try {

               PreparedStatement ps = conexao.prepareStatement(SQL);
               ResultSet rs = ps.executeQuery();

               if (rs != null) {

                    while (rs.next()) {

                         Projetores p = new Projetores();
                         
                         p.setMarca(rs.getString("Marca"));
                         p.setModelo(rs.getString("Modelo"));
                         p.setNumSerie(rs.getString("NumSerie"));
                         p.setDataCompra(rs.getString("DataCompra"));
                         p.setDataTrocaLampada(rs.getString("DataTrocaLampada"));
                         p.setAnsilumens(rs.getString("Ansilumens"));
                         p.setEstado(rs.getString("Estado"));
                         p.setPreco(rs.getDouble("Preco"));
                         
              
                         lc.add(p);
                    }
               }

               return lc;

          } catch (SQLException e) {
               
               return null;
          }
     }


}