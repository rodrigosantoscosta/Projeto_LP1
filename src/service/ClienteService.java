package service;
import model.Cliente;
import java.util.ArrayList;
import java.util.List;

public class ClienteService {
    private List<Cliente> clientes = new ArrayList<>();

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public List<Cliente> listarClientes() {
        return clientes;
    }

    public Cliente buscarPorId(String id) {
        for (Cliente cliente : clientes) {
            if (cliente.getId().equals(id)) {
                return cliente;
            }
        }
        return null;
    }

    public Cliente buscarPorTelefone(String telefone) {
        for (Cliente cliente : clientes) {
            if (cliente.getTelefone().equals(telefone)) {
                return cliente;
            }
        }
        return null;
    }

    public boolean removerCliente(String id) {
        return clientes.removeIf(c -> c.getId().equals(id));
    }

    public boolean atualizarTelefone(String id, String novoTelefone) {
        Cliente cliente = buscarPorId(id);
        if (cliente != null) {
            cliente.setTelefone(novoTelefone);
            return true;
        }
        return false;
    }

    public Cliente buscarClientePorTelefone(String telefone) {
        for (Cliente cliente : clientes) {
            if (cliente.getTelefone().equals(telefone)) {
                return cliente;
            }
        }
        return null;
    }

    public boolean atualizarTodosDadosCliente(String telefone, String novoNome, String novoCpf, String novoTelefone, String novoEmail) {
        Cliente cliente = buscarClientePorTelefone(telefone);
        if (cliente != null) {
            cliente.setNome(novoNome);
            cliente.setCpf(novoCpf);
            cliente.setTelefone(novoTelefone);
            cliente.setEmail(novoEmail);
            return true;
        }
        return false;

    }
}
