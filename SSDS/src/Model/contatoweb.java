package Model;


public class contatoweb {
 //FAZER UMA LINHA PARA CADA CAMPO DA TABELA

//int para integer
//String para varchar
//float para decimal



int idcontatoweb;

String nome;
String rua;
String bairro;
String cidade;
String telefone;
String data;
String email;
String sexo;



//CLIQUE ABAIXO DESTA FRASE

//Agora Clique em Código Fonte - Inserir Código
//Clique na opção Getter e setter
//Clique na primeira caixa de opção
//Clique em Gerar



    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdcontatoweb() {
        return idcontatoweb;
    }

    public void setIdcontatoweb(int idcontatoweb) {
        this.idcontatoweb = idcontatoweb;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
