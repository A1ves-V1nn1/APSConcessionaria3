public class veiculos {
    public String veiculo;
    public int ano;
    public String modelo;
    public String marca;

    public veiculos() {

    }

    public veiculos(String veiculo,int ano,String modelo,String marca) {
        this.veiculo = veiculo;
        this.ano = ano;
        this.modelo = modelo;
        this.marca = marca;
    }

    public String getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    @Override
    public String toString() {
        return  "Veiculo='" + veiculo+ '\'' +
                ", Ano=" + ano +
                ", Modelo='" + modelo + '\'' +
                ", Marca='" + marca + '\'';
    }
}
