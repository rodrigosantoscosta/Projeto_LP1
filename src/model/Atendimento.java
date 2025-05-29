package model;

import enums.Servico;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class Atendimento {
    private String id;
    private Cliente cliente;
    private Veiculo veiculo;
    private Funcionario funcionario;
    private LocalDateTime dataHora;
    private List<Servico> servicos;
    private String descricao;

    public Atendimento(Cliente cliente, Veiculo veiculo, Funcionario funcionario, LocalDateTime dataHora, List<Servico> servicos, String descricao) {
        this.id = UUID.randomUUID().toString();
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.funcionario = funcionario;
        this.dataHora = dataHora;
        this.servicos = servicos;
        this.descricao = descricao;
    }

    public String getId() { return id; }

    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }

    public Veiculo getVeiculo() { return veiculo; }
    public void setVeiculo(Veiculo veiculo) { this.veiculo = veiculo; }

    public Funcionario getFuncionario() { return funcionario; }
    public void setFuncionario(Funcionario funcionario) { this.funcionario = funcionario; }

    public LocalDateTime getDataHora() { return dataHora; }
    public void setDataHora(LocalDateTime dataHora) { this.dataHora = dataHora; }

    public List<Servico> getServicos() { return servicos; }
    public void setServicos(List<Servico> servicos) { this.servicos = servicos; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    @Override
    public String toString() {
        return "Atendimento{" +
                "id='" + id + '\'' +
                ", cliente=" + cliente.getNome() +
                ", veiculo=" + veiculo.getModelo() +
                ", funcionario=" + funcionario.getNome() +
                ", dataHora=" + dataHora +
                ", servicos=" + servicos +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
