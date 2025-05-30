package service;

import model.Cliente;
import model.Funcionario;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioService {

    private List<Funcionario> funcionarios = new ArrayList<>();


    public void adcionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void removerFuncionario(String nome) {
        funcionarios.removeIf(funcionario -> funcionario.getNome() == nome);

    }

    public Funcionario buscarPorNome(String nome) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getNome().equals(nome)) {
                return funcionario;
            }
        }
        return null;
    }

    public Funcionario buscarPorId(String id) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getNome().equals(id)) {
                return funcionario;
            }
        }
        return null;
    }

    public boolean atualizarTodosDadosFuncionario(String novoTelefone, String novoNome, String novoCpf, String novoCargo) {
        Funcionario funcionario = buscarPorNome(novoNome);
        if (funcionario != null) {
            funcionario.setNome(novoNome);
            funcionario.setCpf(novoCpf);
            funcionario.setTelefone(novoTelefone);
            funcionario.setCargo(novoCargo);
            return true;
        }

        return false;

    }


    public void mostrarFuncionario(){
        funcionarios.forEach(element -> System.out.println("Funcionário: " + element));
    }

}