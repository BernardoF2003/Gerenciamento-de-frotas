package entities;

public class Carro extends Veiculo{
    private Integer nportas;

    public Carro(){}

    public Carro(Integer nportas){
        this.nportas = nportas;
    }

    public Carro(String marca, String modelo, Integer ano, String placa, Integer nportas){
        super(marca, modelo, ano, placa);
        this.nportas = nportas;
    }

    public Integer getNportas(){
        return this.nportas;
    }

    public void setNportas(Integer nportas){
        this.nportas = nportas;
    }

    @Override
    public String toString(){
        return "Tipo: Carro - " + this.getMarca() + " "
                                + this.getModelo() + " "
                                + this.getAno() + " - Placa: "
                                + this.getPlaca() + " - N. Portas: "
                                + this.getNportas();
    }
}
