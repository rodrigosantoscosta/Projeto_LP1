package controller;

import model.Atendimento;
import model.Cliente;
import model.Funcionario;
import model.Veiculo;
import service.AtendimentoService;

import enums.Defeitos;
import enums.Servico;

import java.time.LocalDateTime;
import java.util.List;

public class AtendimentoController {
    private AtendimentoService atendimentoService = new AtendimentoService();

    public Atendimento registrarAtendimento(Cliente cliente, Veiculo veiculo, Funcionario funcionario,
                                            List<Servico> servicos, String descricao) {
        Atendimento atendimento = new Atendimento(cliente, veiculo, funcionario,
                LocalDateTime.now(), servicos, descricao);
        atendimentoService.adicionarAtendimento(atendimento);
        return atendimento;
    }



    public void listarAtendimentos() {
        for (Atendimento a : atendimentoService.listarAtendimentos()) {
            System.out.println(a);
        }
    }
}
