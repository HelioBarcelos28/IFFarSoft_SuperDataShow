/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Calendar;

/**
 *
 * @author Helio
 */
public class locacoes {
  private int idLocacoes ;
  private Double valorLocacao ;
  private Calendar dataLocacao ;
  private Calendar dataDevolucao ;
  private String previstaDataDevolucao ;
  private int idProjetor ;
  private int idCliente;
  private Double valorMulta;

    public int getIdLocacoes() {
        return idLocacoes;
    }

    public void setIdLocacoes(int idLocacoes) {
        this.idLocacoes = idLocacoes;
    }

    public Double getValorLocacao() {
        return valorLocacao;
    }

    public void setValorLocacao(Double valorLocacao) {
        this.valorLocacao = valorLocacao;
    }

    public Calendar getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(Calendar dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public Calendar getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Calendar dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public String getPrevistaDataDevolucao() {
        return previstaDataDevolucao;
    }

    public void setPrevistaDataDevolucao(String previstaDataDevolucao) {
        this.previstaDataDevolucao = previstaDataDevolucao;
    }

    public int getIdProjetor() {
        return idProjetor;
    }

    public void setIdProjetor(int idProjetor) {
        this.idProjetor = idProjetor;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Double getValorMulta() {
        return valorMulta;
    }

    public void setValorMulta(Double valorMulta) {
        this.valorMulta = valorMulta;
    }
  
  
  
  
  
}
