/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Helio
 */
public class Locacoes {
    private int IdLocacoes  ;
    private Double ValorLocacao ;
    private String DataLocacao ;
    private String   DataDevolucao ;
    private String   PrevistaDataDevolucao ;
    private int  IdProjetor ;
    private int  IdCliente ;
    private Double ValorMulta ;

    public int getIdLocacoes() {
        return IdLocacoes;
    }

    public void setIdLocacoes(int IdLocacoes) {
        this.IdLocacoes = IdLocacoes;
    }

    public Double getValorLocacao() {
        return ValorLocacao;
    }

    public void setValorLocacao(Double ValorLocacao) {
        this.ValorLocacao = ValorLocacao;
    }

    public String getDataLocacao() {
        return DataLocacao;
    }

    public void setDataLocacao(String DataLocacao) {
        this.DataLocacao = DataLocacao;
    }

    public String getDataDevolucao() {
        return DataDevolucao;
    }

    public void setDataDevolucao(String DataDevolucao) {
        this.DataDevolucao = DataDevolucao;
    }

    public String getPrevistaDataDevolucao() {
        return PrevistaDataDevolucao;
    }

    public void setPrevistaDataDevolucao(String PrevistaDataDevolucao) {
        this.PrevistaDataDevolucao = PrevistaDataDevolucao;
    }

    public int getIdProjetor() {
        return IdProjetor;
    }

    public void setIdProjetor(int IdProjetor) {
        this.IdProjetor = IdProjetor;
    }

    public int getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(int IdCliente) {
        this.IdCliente = IdCliente;
    }

    public Double getValorMulta() {
        return ValorMulta;
    }

    public void setValorMulta(Double ValorMulta) {
        this.ValorMulta = ValorMulta;
    }
    
    
}
