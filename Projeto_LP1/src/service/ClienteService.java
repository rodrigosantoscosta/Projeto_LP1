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
}
