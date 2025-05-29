import controller.AtendimentoController;
import controller.ClienteController;
import controller.FuncionarioController;
import controller.VeiculoController;
import enums.Servico;
import model.Atendimento;
import model.Cliente;
import model.Funcionario;
import model.Veiculo;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static enums.Servico.REVISAO_GERAL;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Criando os controllers
        ClienteController clienteController = new ClienteController();
        VeiculoController veiculoController = new VeiculoController();
        FuncionarioController funcionarioController = new FuncionarioController();
        AtendimentoController atendimentoController = new AtendimentoController();


//        // Cadastrando cliente usando o ClienteController
//        Cliente c = clienteController.cadastrarCliente("Pedrinha Neto","12345678990","5599999999","pedrinha@gmail.com");
//
//
//        // Cadastrando funcionário
//        Funcionario fc = new Funcionario("Jailson M","9999999","Assistente Mecanico","99999999");
//        funcionarioController.cadastraFuncionario(fc);
//
//        //Cadastrando veiculo usando VeiculoController
//
//        Veiculo v = new Veiculo("ABC555","Fiat UNO",2001,"QEF5454", 1234);
//
//        //Realizando um atendimento
//        String descricao = "Cliente solicitou revisão geral e alinhamento, não vai ser necessário ser feito nenhum reparo";
//        List<Servico> servicos = Arrays.asList(REVISAO_GERAL, Servico.ALINHAMENTO);//Listando serviços que vão ser feitos
//
//
//        // Registrando os dados do atendimento usando AtendimentoController
//        Atendimento atendimento = atendimentoController.cadastrarAtendimento(
//                c, v, fc, servicos, descricao);
//
//        // Imprimindo o atendimento registrado
//        System.out.println("\nAtendimento registrado:");
//        System.out.println(atendimento.toString());
//
//        // Imprimindo todos os atendimentos
//        System.out.println("\nLista de atendimentos:");
//        atendimentoController.listarAtendimentos();

        int opcao = -1;
        do {
            System.out.println("\n╔════════════════════════════════════════════════════╗");
            System.out.println("║            🚗 MECHMANAGER  - MENU                    ║");
            System.out.println("╠════════════════════════════════════════════════════╣");
            System.out.println("║  1. 👤 Cadastrar Cliente                            ║");
            System.out.println("║  2. 🔍 Consultar Cliente Específico                ║");
            System.out.println("║  3. ✏️  Alterar Dados de Cliente                    ║");
            System.out.println("║----------------------------------------------------║");
            System.out.println("║  4. 🚘 Cadastrar Veículo                           ║");
            System.out.println("║  5. 🔍 Consultar Veículo Específico                ║");
            System.out.println("║  6. ✏️  Alterar Dados de Veículo                   ║");
            System.out.println("║ 11. 📂 Listar Veículos de um Cliente               ║");
            System.out.println("║----------------------------------------------------║");
            System.out.println("║  7. 🧑‍🔧 Cadastrar Funcionário                      ║");
            System.out.println("║  8. 🔍 Consultar Funcionário                       ║");
            System.out.println("║----------------------------------------------------║");
            System.out.println("║  9. 🛠️  Registrar Atendimento (Ordem de Serviço)    ║");
            System.out.println("║ 10. 🔍 Consultar Atendimento                       ║");
            System.out.println("║----------------------------------------------------║");
            System.out.println("║  0. ❌ Sair                                         ║");
            System.out.println("╚════════════════════════════════════════════════════╝");
            System.out.print("Digite uma opção: ");

            opcao = Integer.parseInt(sc.nextLine());

            switch (opcao) {
                case 1:
                    String nome, cpf, telefone, email;

                    System.out.println("Digite o nome do cliente:");
                    nome = sc.nextLine();
                    System.out.println("Digite o CPF do cliente: ");
                    cpf = sc.nextLine();
                    System.out.println("Digite o telefone do cliente: ");
                    telefone = sc.nextLine();
                    System.out.println("Digite o email do cliente: ");
                    email = sc.nextLine();
                    Cliente c = clienteController.cadastrarCliente(nome,cpf,telefone,email);

                    System.out.println("Pressione Enter para continuar...");
                    sc.nextLine();

                    break;
                case 2:
                    System.out.println("Digite o telefone do cliente para consulta: ");
                    String buscaCliente = sc.nextLine();
                    Cliente clienteEncontrado = clienteController.buscarClientePorTelefone(buscaCliente);

                    if (clienteEncontrado != null) {
                        System.out.println("Cliente encontrado:");
                        System.out.println(clienteEncontrado);
                    } else {
                        System.out.println("Cliente não encontrado!");
                    }

                    System.out.println("Pressione Enter para continuar...");
                    sc.nextLine();
                    break;

                case 3:
                    System.out.println("Digite o telefone do cliente que deseja alterar: ");
                    String telefoneCliente = sc.nextLine();
                    Cliente clienteParaAlterar = clienteController.buscarClientePorTelefone(telefoneCliente);

                    if (clienteParaAlterar != null) {
                        System.out.println("\nCliente encontrado:");
                        System.out.println(clienteParaAlterar);

                        System.out.println("\nDigite os novos dados do cliente:");

                        System.out.println("Nome atual: " + clienteParaAlterar.getNome());
                        System.out.print("Novo nome: ");
                        String novoNome = sc.nextLine();

                        System.out.println("\nCPF atual: " + clienteParaAlterar.getCpf());
                        System.out.print("Novo CPF: ");
                        String novoCpf = sc.nextLine();

                        System.out.println("\nTelefone atual: " + clienteParaAlterar.getTelefone());
                        System.out.print("Novo telefone: ");
                        String novoTelefone = sc.nextLine();

                        System.out.println("\nEmail atual: " + clienteParaAlterar.getEmail());
                        System.out.print("Novo email: ");
                        String novoEmail = sc.nextLine();

                        boolean sucesso = clienteController.atualizarTodosDadosCliente(
                                telefoneCliente, novoNome, novoCpf, novoTelefone, novoEmail);

                        if (sucesso) {
                            System.out.println("\nCliente atualizado com sucesso!");
                            System.out.println("Novos dados:");
                            System.out.println(clienteController.buscarClientePorTelefone(novoTelefone));
                        } else {
                            System.out.println("\nFalha ao atualizar cliente.");
                        }
                    } else {
                        System.out.println("\nCliente não encontrado!");
                    }

                    System.out.println("Pressione Enter para continuar...");
                    sc.nextLine();

                    break;
                case 4:
                    // cadastrar veículo
                    break;
                case 5:
                    // consultar veículo
                    break;
                case 6:
                    // alterar dados de veículo
                    break;
                case 11:
                    // listar veículos do cliente
                    break;
                case 7:
                    // cadastrar funcionário
                    break;
                case 8:
                    // consultar funcionário
                    break;
                case 9:
                    // registrar atendimento
                    break;
                case 10:
                    // consultar atendimento
                    break;
                case 0:
                    System.out.println("✅ Encerrando o sistema...");
                    break;
                default:
                    System.out.println("❌ Opção inválida!");
                    break;
            }

        } while (opcao != 0);

        sc.close();
    }
}
