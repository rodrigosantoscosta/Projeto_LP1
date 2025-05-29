package controller;

import model.Veiculo;
import service.VeiculoService;

public class VeiculoController {

    VeiculoService vs = new VeiculoService();

    public Veiculo adicionarVeiculo(String placa, String modelo, String chassi, int ano, int quilometragem) {
        Veiculo veiculo = new Veiculo(placa, modelo, chassi, ano, quilometragem);
       vs.adcionarVeiculo(veiculo);
        return veiculo;
    }
    public void listaVeiculosID(String id){
        vs.mostraVeiculospornome(id);
    }

    public Veiculo deletarVeiculo(String placa){
        vs.removerVeiculo(placa);
        return null;
    }
    public Veiculo buscaVeiculo(String placa){
        return vs.acharVeiculo(placa);

    }
    public boolean atualizarTodosDadosVeiculo(String placa, String novoPlaca, String novoModelo, String novoChassi, int novoAno, int novoQuilometragem) {
        return vs.atualizarTodosDadosVeiculo(placa, novoPlaca, novoModelo, novoChassi, novoAno, novoQuilometragem);
    }

    public void listarVeiculos() {
        vs.listarVeiculos();
    }
}
