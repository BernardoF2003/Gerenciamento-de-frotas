package entities;

public class Moto extends Veiculo{
    private Boolean partidaEletrica;

    public Moto(){}
    public Moto(Boolean partidaEletrica){
        this.partidaEletrica = partidaEletrica;
    }
    public Moto(String marca, String modelo, Integer ano, String placa, Boolean partidaEletrica){
        super(marca, modelo, ano, placa);
        this.partidaEletrica = partidaEletrica;
    }

    public Boolean getPartidaEletrica(){
        return this.partidaEletrica;
    }

    public void setPartidaEletrica(Boolean partidaEletrica){
        this.partidaEletrica = partidaEletrica;
    }

    @Override
    public String toString(){
        return "Tipo: Moto - " + this.getMarca() + " "
                + this.getModelo() + " "
                + this.getAno() + " - Placa: "
                + this.getPlaca() + " - Part. Elétrica: "
                + (this.getPartidaEletrica() ? "Sim" : "Não");
    }
}
