package controller;

import model.Cliente;
import service.ClienteService;

public class ClienteController {
    private ClienteService clienteService = new ClienteService();

    public Cliente cadastrarCliente(String nome, String cpf, String telefone, String email) {
        Cliente cliente = new Cliente(nome, cpf, telefone, email);
        clienteService.adicionarCliente(cliente);
        return cliente;
    }

    public void listarClientes() {
        for (Cliente cliente : clienteService.listarClientes()) {
            System.out.println(cliente);
        }
    }

    public Cliente buscarClientePorId(String id) {
        return clienteService.buscarPorId(id);
    }

    public boolean excluirCliente(String id) {
        return clienteService.removerCliente(id);
    }

    public boolean atualizarTelefoneCliente(String id, String novoTelefone) {
        return clienteService.atualizarTelefone(id, novoTelefone);
    }
}
