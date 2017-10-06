package Model;


public class funcionarios {
 //FAZER UMA LINHA PARA CADA CAMPO DA TABELA

//int para integer
//String para varchar
//float para decimal


int idfunionarios;

String nome;
String setor;
String cpf;
String datanasc;
String sexo;
String endereco;
String cidade;
String telefone;
float salario;

//CLIQUE ABAIXO DESTA FRASE

//Agora Clique em Código Fonte - Inserir Código
//Clique na opção Getter e setter
//Clique na primeira caixa de opção
//Clique em Gerar

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDatanasc() {
        return datanasc;
    }

    public void setDatanasc(String datanasc) {
        this.datanasc = datanasc;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getIdfunionarios() {
        return idfunionarios;
    }

    public void setIdfunionarios(int idfunionarios) {
        this.idfunionarios = idfunionarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
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
