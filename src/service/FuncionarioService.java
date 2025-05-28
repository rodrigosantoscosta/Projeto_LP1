package service;

import model.Funcionario;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioService {

    private List<Funcionario> funcionarios = new ArrayList<>();

    public void adcionarFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
    }

    public void removerFuncionario(String cpf){
        funcionarios.removeIf(funcionario -> funcionario.getCpf() == cpf);

    }
    public void mostrarFuncionario(){
        funcionarios.forEach(element -> System.out.println("Elemento: " + element));
    }
}