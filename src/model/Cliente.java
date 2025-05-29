package model;
import java.util.UUID;
import java.util.ArrayList;
import java.util.List;


public class Cliente {
    private String id;
    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private List<Veiculo> veiculos;

    public Cliente(String nome, String cpf, String telefone, String email) {
        this.id = UUID.randomUUID().toString();
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.veiculos = new ArrayList<>();
    }
    //Getters e Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void adicionarVeiculoCliente(Veiculo veiculo) {
        veiculos.add(veiculo);
    }


    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
