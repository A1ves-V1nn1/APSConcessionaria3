
package model;


public class Cliente {
    private int cod;
    private String nome;
    private String cpf;
    private String telefone;
    private String email;
    private String datanasc;
    private String endereço;
    private String cidade;
    private String número;

    public Cliente() {
    }
    public Cliente(int codigo){
        this.cod=codigo;
    }
    public Cliente(int cod, String nome, String cpf, String telefone, String email, String datanasc, String endereço, String cidade, String número) {
        this.cod = cod;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.datanasc = datanasc;
        this.endereço = endereço;
        this.cidade = cidade;
        this.número = número;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDatanasc() {
        return datanasc;
    }

    public void setDatanasc(String datanasc) {
        this.datanasc = datanasc;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getNúmero() {
        return número;
    }

    public void setNúmero(String número) {
        this.número = número;
    }
    
    
    
}
