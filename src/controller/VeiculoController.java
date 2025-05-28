package controller;

import model.Veiculo;
import service.VeiculoService;

public class VeiculoController {

    VeiculoService vs = new VeiculoService();

    public void cadastraVeiculo(Veiculo veiculo){
        vs.adcionarVeiculo(veiculo);

    }
    public void listaVeiculos(){
        vs.mostraVeiculos();
    }
    public void deletarVeiculo(String placa){
        vs.removerVeiculo(placa);
    }
}
