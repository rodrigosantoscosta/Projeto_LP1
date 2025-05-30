package service;
import model.Cliente;
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

    public void listarTodosVeiculos(){
        veiculos.forEach(element -> System.out.println("Veiculo: " +  " | " + element));
    }

    public void mostraVeiculospornome(String veiculo) {
        veiculos.forEach(element -> System.out.println("Veiculo: " + veiculo + " | " + element));
    }

    public Veiculo acharVeiculo(String placa) {
        for (Veiculo veiculo : veiculos) {
            if (veiculo.getPlaca().equals(placa)) {
                return veiculo;
            }
        }

        return null;
    }
    public boolean atualizarTodosDadosVeiculo(String placa, String novoPlaca, String novoModelo, String novoChassi, int novoAno, int novoQuilometragem) {
        Veiculo veiculo = acharVeiculo(placa);
        if (veiculo != null) {
            veiculo.setPlaca(novoPlaca);
            veiculo.setModelo(novoModelo);
            veiculo.setChassi(novoChassi);
            veiculo.setAno(novoAno);
            veiculo.setQuilometragem(novoQuilometragem);
            return true;
        }
        return false;

    }
}