package projetoaps;


public class compra extends Cliente{
    
   private String nomecliente;
   private String marcaveiculo;
   private String anoveiculo;
   private String modeloveiculo;

    public compra() {
    }

    public compra(String nomecliente, String marcaveiculo, String anoveiculo, String modeloveiculo, String valorveiculo) {
        this.nomecliente = nomecliente;
        this.marcaveiculo = marcaveiculo;
        this.anoveiculo = anoveiculo;
        this.modeloveiculo = modeloveiculo;
        this.valorveiculo = valorveiculo;
    }

    public String getNomecliente() {
        return nomecliente;
    }

    public void setNomecliente(String nomecliente) {
        this.nomecliente = nomecliente;
    }

    public String getMarcaveiculo() {
        return marcaveiculo;
    }

    public void setMarcaveiculo(String marcaveiculo) {
        this.marcaveiculo = marcaveiculo;
    }

    public String getAnoveiculo() {
        return anoveiculo;
    }

    public void setAnoveiculo(String anoveiculo) {
        this.anoveiculo = anoveiculo;
    }

    public String getModeloveiculo() {
        return modeloveiculo;
    }

    public void setModeloveiculo(String modeloveiculo) {
        this.modeloveiculo = modeloveiculo;
    }

    public String getValorveiculo() {
        return valorveiculo;
    }

    public void setValorveiculo(String valorveiculo) {
        this.valorveiculo = valorveiculo;
    }
   private String valorveiculo;
}
