package entities;

public abstract class Veiculo{
    private String marca;
    private String modelo;
    private Integer ano;
    private String placa;

    public Veiculo(){}
    public Veiculo(String marca, String modelo, Integer ano, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
    }

    public String getMarca(){
        return this.marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public Integer getAno(){
        return this.ano;
    }

    public void setAno(Integer ano){
        this.ano = ano;
    }

    public String getPlaca(){
        return this.placa;
    }

    public void setPlaca(String placa){
        this.placa = placa;
    }
}
