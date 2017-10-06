package Model;


public class servicos {
 //FAZER UMA LINHA PARA CADA CAMPO DA TABELA

//int para integer
//String para varchar
//float para decimal


int idservicos;
String nomecliente;
String tiposervico;
String funcionario;
String setor;
float valorunitario;
int quantidade;
float valortotal;
String dataservico;
//CLIQUE ABAIXO DESTA FRASE

//Agora Clique em Código Fonte - Inserir Código
//Clique na opção Getter e setter
//Clique na primeira caixa de opção
//Clique em Gerar

    public String getDataservico() {
        return dataservico;
    }

    public void setDataservico(String dataservico) {
        this.dataservico = dataservico;
    }

    public String getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(String funcionario) {
        this.funcionario = funcionario;
    }

    public int getIdservicos() {
        return idservicos;
    }

    public void setIdservicos(int idservicos) {
        this.idservicos = idservicos;
    }

    public String getNomecliente() {
        return nomecliente;
    }

    public void setNomecliente(String nomecliente) {
        this.nomecliente = nomecliente;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getTiposervico() {
        return tiposervico;
    }

    public void setTiposervico(String tiposervico) {
        this.tiposervico = tiposervico;
    }

    public float getValortotal() {
        return valortotal;
    }

    public void setValortotal(float valortotal) {
        this.valortotal = valortotal;
    }

    public float getValorunitario() {
        return valorunitario;
    }

    public void setValorunitario(float valorunitario) {
        this.valorunitario = valorunitario;
    }

  
}