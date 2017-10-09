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
public class Projetores {
        private int IdProjetor;
        private String Marca ;
        private String Modelos;
        private String NumSerie;
        private String  DataCompra;
        private String  DataTrocaLampada;
        private String Ansilumens; 
        private String Estado;  
        private Double Preco;

    public int getIdProjetor() {
        return IdProjetor;
    }

    public void setIdProjetor(int IdProjetor) {
        this.IdProjetor = IdProjetor;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelos() {
        return Modelos;
    }

    public void setModelos(String Modelos) {
        this.Modelos = Modelos;
    }

    public String getNumSerie() {
        return NumSerie;
    }

    public void setNumSerie(String NumSerie) {
        this.NumSerie = NumSerie;
    }

    public String getDataCompra() {
        return DataCompra;
    }

    public void setDataCompra(String DataCompra) {
        this.DataCompra = DataCompra;
    }

    public String getDataTrocaLampada() {
        return DataTrocaLampada;
    }

    public void setDataTrocaLampada(String DataTrocaLampada) {
        this.DataTrocaLampada = DataTrocaLampada;
    }

    public String getAnsilumens() {
        return Ansilumens;
    }

    public void setAnsilumens(String Ansilumens) {
        this.Ansilumens = Ansilumens;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public Double getPreco() {
        return Preco;
    }

    public void setPreco(Double Preco) {
        this.Preco = Preco;
    }
        
        
       
}
