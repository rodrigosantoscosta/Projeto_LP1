package controller;

import model.Funcionario;
import service.FuncionarioService;

public class FuncionarioController {

    FuncionarioService vs = new FuncionarioService();

    public void cadastraFuncionario(Funcionario funcionario){
        vs.adcionarFuncionario(funcionario);

    }
    public void listaFuncionarios(){
        vs.mostrarFuncionario();
    }
    public void deletarFuncionario(String cpf){
        vs.removerFuncionario(cpf);
    }
}
