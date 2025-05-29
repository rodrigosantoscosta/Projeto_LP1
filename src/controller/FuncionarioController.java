package controller;

import model.Funcionario;
import service.FuncionarioService;

public class FuncionarioController {

    FuncionarioService vs = new FuncionarioService();

    public Funcionario cadastraFuncionario(String nome, String cpf, String cargo, String telefone) {
        Funcionario funcionario = new Funcionario( nome,  cpf,  cargo,  telefone);
        vs.adcionarFuncionario(funcionario);
        return funcionario;

    }
    public void listaFuncionarios(String nome){
        vs.mostrarFuncionario();
    }

    public Funcionario buscarPorNome(String nome) {
        return vs.buscarPorNome(nome);
    }

    public void deletarFuncionario(String nome){
        vs.removerFuncionario(nome);
    }


    public boolean atualizarTodosDadosFuncionario(String novoTelefone, String novoNome, String novoCpf, String novoCargo){
        return vs.atualizarTodosDadosFuncionario(novoTelefone, novoNome, novoCpf, novoCargo);
    }

    public void listarFuncionario() {
        for (Funcionario funcionario : vs.listarFuncionario()) {
            System.out.println(funcionario);
        }
    }

}

