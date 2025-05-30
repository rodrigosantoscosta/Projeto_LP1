package service;

import model.Atendimento;

import java.util.ArrayList;
import java.util.List;

public class AtendimentoService {
    private List<Atendimento> atendimentos = new ArrayList<>();

    public void adicionarAtendimento(Atendimento atendimento) {
        atendimentos.add(atendimento);
    }

    public List<Atendimento> listarAtendimentos() {
        return atendimentos;
    }

    public Atendimento buscarPorId(String placa) {
        for (Atendimento a : atendimentos) {
            if (a.getId().equals(placa)) return a;
        }
        return null;
    }

    public boolean removerAtendimento(String id) {
        return atendimentos.removeIf(a -> a.getId().equals(id));
    }
}
