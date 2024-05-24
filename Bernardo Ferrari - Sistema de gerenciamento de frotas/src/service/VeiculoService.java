package service;

import entities.Carro;
import entities.Moto;
import entities.Veiculo;

import java.util.ArrayList;

public class VeiculoService{
    private ArrayList<Veiculo> veiculos = new ArrayList<>();

    public void cadastrarVeiculo(Veiculo veiculo){
        validarCamposVeiculo(veiculo);
        if(veiculo instanceof Carro){
            Carro carro = (Carro) veiculo;
            if(carro.getNportas() == null || carro.getNportas() == 0)
                throw new IllegalArgumentException("O número de portas do carro não pode ser zero ou nulo.");
        }
        veiculos.add(veiculo);
        System.out.println("Veículo cadastrado com sucesso!");
    }

    public void removerVeiculo(String placa){
        Veiculo veiculoParaRemover = null;
        for(Veiculo veiculo : veiculos){
            if(veiculo.getPlaca().equalsIgnoreCase(placa)){
                veiculoParaRemover = veiculo;
                break;
            }
        }
        if(veiculoParaRemover != null){
            veiculos.remove(veiculoParaRemover);
            System.out.println("Veículo removido com sucesso!");
        }
        else
            System.out.println("Veículo com placa " + placa + " não encontrado!");
    }

    private void validarCamposVeiculo(Veiculo veiculo) throws IllegalArgumentException{
        if(veiculo.getMarca() == null || veiculo.getMarca().isBlank())
            throw new IllegalArgumentException("A marca não pode estar em branco.");
        if(veiculo.getModelo() == null || veiculo.getModelo().isBlank())
            throw new IllegalArgumentException("O modelo não pode estar em branco.");
        if(veiculo.getAno() == null || veiculo.getAno() == 0)
            throw new IllegalArgumentException("O ano não pode ser zero ou nulo.");
        if(veiculo.getPlaca() == null || veiculo.getPlaca().isBlank())
            throw new IllegalArgumentException("A placa não pode estar em branco.");
    }

    public void listarVeiculos(){
        if(veiculos.isEmpty())
            System.out.println("NENHUM VEÍCULO CADASTRADO.");
        else
            System.out.println("LISTA DE VEÍCULOS CADASTRADOS:");
            for(Veiculo v : veiculos)
                System.out.println(v.toString());
    }

    public Veiculo pesquisarVeiculoPorPlaca(String placa){
        for(Veiculo v : veiculos)
            if(v.getPlaca().equalsIgnoreCase(placa))
                return v;
        return null;
    }

}
