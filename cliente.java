package projetoaps;

import java.util.Scanner;
import static projetoaps.ProjetoAPS.lista;

public class Cliente extends ProjetoAPS{
    private String Nome;
    private int Idade;
    private String Endereco;
    private String Email;
    private String Telefone;

    public Cliente() {

    }

    public Cliente(String Nome,int Idade,String Endereco,String Email,String Telefone) {
        this.Nome = Nome;
        this.Idade = Idade;
        this.Endereco = Endereco;
        this.Email = Email;
        this.Telefone = Telefone;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int Idade) {
        this.Idade = Idade;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    @Override
    public String toString(){
        return getNome();
    }
}

