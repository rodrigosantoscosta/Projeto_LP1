package controller;

import model.Cliente;
import model.Funcionario;
import service.FuncionarioService;

public class FuncionarioController {

    FuncionarioService fs = new FuncionarioService();

    public Funcionario cadastraFuncionario(String nome, String cpf, String cargo, String telefone) {
        Funcionario funcionario = new Funcionario( nome,  cpf,  cargo,  telefone);
        fs.adcionarFuncionario(funcionario);
        return funcionario;

    }




    public Funcionario buscarPorNome(String nome) {
        return fs.buscarPorNome(nome);
    }

    public Funcionario buscarFuncionarioPorId(String id) {
        return fs.buscarPorId(id);
    }

    public void deletarFuncionario(String nome){
        fs.removerFuncionario(nome);
    }


    public boolean atualizarTodosDadosFuncionario(String novoTelefone, String novoNome, String novoCpf, String novoCargo){
        return fs.atualizarTodosDadosFuncionario(novoTelefone, novoNome, novoCpf, novoCargo);
    }

    public void listarFuncionarios() {
        fs.mostrarFuncionario();
    }

}

