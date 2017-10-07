/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Model.Locacoes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Helio
 */
public class LocacoesControl {
    private Connection conexao;  
//CLASSE PACOTE BANCODADOS
public LocacoesControl() throws SQLException {       

	this.conexao=CriaConexao.getConexao();

 }

public String adicionaLocacoes (Locacoes X) { 

	String sql = "insert into Locacoes  ( ValorLocacao, DataLocacao , DataDevolucao , PrevistaDataDevolucao , IdProjetor , IdClente , ValorMulta)  values (?,?,?,?,?,?,?) ";

        try {
               
              PreparedStatement stmt = conexao.prepareStatement(sql);
              stmt.setDouble(1,X.getValorLocacao());
              stmt.setString(2,X.getDataLocacao());
              stmt.setString(3,X.getDataDevolucao());
              stmt.setString(4,X.getPrevistaDataDevolucao());
              stmt.setInt(5,X.getIdProjetor());
              stmt.setInt(6,X.getIdCliente());
              stmt.setDouble(7,X.getValorMulta());
             
               
               if (stmt.executeUpdate() > 0) {

                    return "Inclusão de nova Locação realizada com sucesso.";
               } else {

                    return "Erro ao tentar incluir nova Locação.";
               }
                   
          } catch (SQLException e) {
               
               return e.getMessage();
          }
        
        public String AtualizarLocacoes(Locacoes X, String cod){
         String sql = "update cliente set ValorLocacao =?, DataLocacao =?, DataDevolucao =? , PrevistaDataDevolucao =?, IdProjetor =?, IdClente =?, ValorMulta=? where  idCliente ='"+Integer.parseInt(cod)+"';"; 
         
         try {
             PreparedStatement stmt = conexao.prepareStatement(sql);
              stmt.setDouble(1,X.getValorLocacao());
              stmt.setString(2,X.getDataLocacao());
              stmt.setString(3,X.getDataDevolucao());
              stmt.setString(4,X.getPrevistaDataDevolucao());
              stmt.setInt(5,X.getIdProjetor());
              stmt.setInt(6,X.getIdCliente());
              stmt.setDouble(7,X.getValorMulta());
               
               if (stmt.executeUpdate() > 0) {

                    return "Atualização de nova Locação realizada com sucesso.";
               } else {

                    return "Erro ao tentar Atualizar nova Locação.";
               }
         } catch (Exception e) {
             return e.getMessage();
         }
         
     }
        
     

}
