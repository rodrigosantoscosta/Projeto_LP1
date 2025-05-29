import controller.AtendimentoController;
import controller.ClienteController;
import controller.FuncionarioController;
import controller.VeiculoController;
import java.util.Scanner;

import model.Atendimento;
import model.Cliente;
import model.Veiculo;
import model.Funcionario;



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
        // Cadastrando funcionário
        Funcionario fc = new Funcionario("Jailson M","9999999","Assistente Mecanico","99999999");
        funcionarioController.cadastraFuncionario(fc);

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
            System.out.println("║  4. ❌  Deletar Dados de Cliente                    ║");
            System.out.println("║----------------------------------------------------║");
            System.out.println("║  5. 🚘 Cadastrar Veículo                           ║");
            System.out.println("║  6. 🔍 Consultar Veículo Específico                ║");
            System.out.println("║  7. ✏️  Alterar Dados de Veículo                   ║");
            System.out.println("║  8. ❌  Deletar Dados de Veículo                   ║");
            System.out.println("║  9. 📂 Listar Veículos de um Cliente               ║");
            System.out.println("║----------------------------------------------------║");
            System.out.println("║  10. 🧑‍🔧 Cadastrar Funcionário                      ║");
            System.out.println("║  11. 🔍 Consultar Funcionário                       ║");
            System.out.println("║  12. ❌  Deletar Dados de Funcionário                   ║");
            System.out.println("║----------------------------------------------------║");
            System.out.println("║  13. 🛠️  Registrar Atendimento (Ordem de Serviço)    ║");
            System.out.println("║  14. 🔍 Consultar Atendimento                       ║");
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
                    // deletar dados cliente
                    System.out.println("Digite o Telefone do cliente para excluir:");
                    String telefone_cliente = sc.nextLine();
                    Cliente achouCliente = clienteController.buscarClientePorTelefone(telefone_cliente);
                    if (achouCliente != null) {
                        clienteController.excluirCliente(telefone_cliente);
                        System.out.println("Cliente deletado com Sucesso:");

                    } else {
                        System.out.println("Cliente ainda estar no sistema!");

                    }
                    break;
                case 5:
                    // cadastrar veículo
                    String placa, modelo, chassi;
                    int ano, quilometragem;
                    System.out.println("Digite a placa do veículo:");
                    placa = sc.nextLine();
                    System.out.println("Digite o modelo do veículo: ");
                    modelo = sc.nextLine();
                    System.out.println("Digite o chassi do veículo: ");
                    chassi = sc.nextLine();
                    System.out.println("Digite ano de fabricação do veículo: ");
                    ano = sc.nextInt();
                    System.out.println("Digite a quilomentragem do veículo:");
                    quilometragem = sc.nextInt();
                    Veiculo v = veiculoController.adicionarVeiculo(placa,modelo,chassi,ano,quilometragem);

                    break;
                case 6:
                    // consultar veículo
                    System.out.println("Digite a placa do veículo para consulta: ");
                    String buscaVeiculo = sc.nextLine();
                    Veiculo VeiculoEncontrado = veiculoController.buscaVeiculo(buscaVeiculo);

                    if (VeiculoEncontrado != null) {
                        System.out.println("Veículo encontrado:");
                        System.out.println(VeiculoEncontrado);
                    } else {
                        System.out.println("Veículo não foi encontrado!");
                    }

                    System.out.println("Pressione Enter para continuar...");
                    sc.nextLine();
                    break;
                case 7:
                    // alterar dados de veículo
                    System.out.println("Digite a placa do veículo que deseja alterar: ");
                    String placaVeiculo = sc.nextLine();
                    Veiculo veiculoParaAlterar = veiculoController.buscaVeiculo(placaVeiculo);

                    if (veiculoParaAlterar != null) {
                        System.out.println("\nVeiculo encontrado:");
                        System.out.println(veiculoParaAlterar);

                        System.out.println("\nDigite os novos dados do Veículo:");

                        System.out.println("Placa atual: " + veiculoParaAlterar.getPlaca());
                        System.out.print("Nova placa: ");
                        String novoPlaca = sc.nextLine();

                        System.out.println("\nModelo atual: " + veiculoParaAlterar.getModelo());
                        System.out.print("Novo Modelo: ");
                        String novoModelo = sc.nextLine();

                        System.out.println("\nChassi atual: " + veiculoParaAlterar.getChassi());
                        System.out.print("Novo chassi: ");
                        String novoChassi = sc.nextLine();

                        System.out.println("\nAno de Fabricação atual: " + veiculoParaAlterar.getAno());
                        System.out.print("Novo ano de fabricação: ");
                        int novoAno = sc.nextInt();

                        System.out.println("\nQuilometragem atual: " + veiculoParaAlterar.getQuilometragem());
                        System.out.print("Nova Quilometragem: ");
                        int novoQuilometragem = sc.nextInt();

                        boolean sucesso_veiculo = veiculoController.atualizarTodosDadosVeiculo(
                                placaVeiculo, novoPlaca, novoModelo, novoChassi, novoAno, novoQuilometragem);

                        if (sucesso_veiculo) {
                            System.out.println("\nDados do Veículo atualizado com sucesso!");
                            System.out.println("Novos dados:");
                            System.out.println(veiculoController.buscaVeiculo(novoPlaca));
                        } else {
                            System.out.println("\nFalha ao atualizar os dados do veículo.");
                        }
                    } else {
                        System.out.println("\nVeículo não encontrado!");
                    }

                    System.out.println("Pressione Enter para continuar...");
                    sc.nextLine();
                    break;
                case 8:
                    // deletar dados de veículos
                    System.out.println("Digite a placa do veiculo para excluir:");
                    String numero_placa = sc.nextLine();
                    Veiculo achouVeiculo = veiculoController.buscaVeiculo(numero_placa);
                    if (achouVeiculo != null) {
                        veiculoController.deletarVeiculo(numero_placa);
                        System.out.println("Veículo deletado com Sucesso:");

                    } else {
                        System.out.println("Veículo ainda estar no sistema!");

                    }
                    break;
                case 9:
                    // listar veículos do cliente
                    System.out.println("Digite a ID do cliente: ");
                    String id_cliente = sc.nextLine();
                    System.out.println("Lista de Veiculos:");
                    veiculoController.listaVeiculosID(id_cliente);

                    break;
                case 10:
                    // cadastrar funcionário

                    break;
                case 11:
                    // consultar funcionário

                    break;
                case 12:
                    // deletar dados de funcionários

                    break;
                case 13:
                    System.out.println("Digite o telefone do cliente: ");

                    String telefoneClienteAtendimento = sc.nextLine();
                    Cliente clienteAtendimento = clienteController.buscarClientePorTelefone(telefoneClienteAtendimento);

                    if (clienteAtendimento == null) {
                        System.out.println("Cliente não encontrado!");
                        System.out.println("Pressione Enter para continuar...");
                        sc.nextLine();
                        break;
                    }

                    veiculoController.listarVeiculos();
                    System.out.print("Escolha a placa do veículo do atendimento: ");
                    String placaAtendimento = sc.nextLine();
                    Veiculo veiculoAtendimento = veiculoController.buscaVeiculo(placaAtendimento);

                    System.out.println("Descreva o atendimento:");
                    String descricao = sc.nextLine();

                    atendimentoController.listaFuncionarios();
                    System.out.print("Escolha o funcionário atendimento: ");
                    String funcionarioAtendimentoID = sc.nextLine();
                    Funcionario funcionarioAtendimento = funcionarioController.buscaFuncionario(funcionarioAtendimentoID);

                    System.out.println("Descreva o atendimento:");
                    String descricaoAtendimento = sc.nextLine();



                    Atendimento novoAtendimento = atendimentoController.registrarAtendimento(clienteAtendimento, veiculoAtendimento,
                            funcionarioAtendimento, servicosAtendimento, descricaoAtendimento);

                    System.out.println("\nAtendimento registrado com sucesso:");
                    System.out.println("Pressione Enter para continuar...");
                    sc.nextLine();
                    break;


                case 14:
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
