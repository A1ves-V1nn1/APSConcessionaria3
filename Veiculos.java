package projetoaps;

import java.util.Scanner;
import static projetoaps.ProjetoAPS.lista1;

public class veiculos extends ProjetoAPS{
    private double Valor;
    private int Ano;
    private String Modelo;
    private String Marca;

    public veiculos() {

    }

    public veiculos(double Valor,int Ano,String Modelo,String Marca) {
        this.Valor = Valor;
        this.Ano = Ano;
        this.Modelo = Modelo;
        this.Marca = Marca;
    }

    public double getValor() {
        return Valor;
    }

    public void setValor(double Valor) {
        this.Valor = Valor;
    }
    public int getAno() {
        return Ano;
    }

    public void setAno(int Ano) {
        this.Ano = Ano;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }
   @Override
    public String toString(){
        return getModelo();
    }
}
