package service;
import model.Veiculo;
import java.util.ArrayList;
import java.util.List;


public class VeiculoService {

    private List<Veiculo> veiculos = new ArrayList<>();

    public void adcionarVeiculo(Veiculo veiculo){

        veiculos.add(veiculo);
    }

    public void removerVeiculo(String placa){
        veiculos.removeIf(veiculo -> veiculo.getPlaca() == placa);

    }
    public void mostraVeiculos(){
        veiculos.forEach(element -> System.out.println("Elemento: " + element));
    }


}