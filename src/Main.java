import enums.Servico;
import model.Atendimento;
import model.Cliente;
import model.Veiculo;
import model.Funcionario;
import controller.AtendimentoController;
import controller.ClienteController;
import controller.FuncionarioController;
import controller.VeiculoController;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;



public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Criando os controllers
        ClienteController clienteController = new ClienteController();
        VeiculoController veiculoController = new VeiculoController();
        FuncionarioController funcionarioController = new FuncionarioController();
        AtendimentoController atendimentoController = new AtendimentoController();


//        // Cadastrando cliente usando o ClienteController
        clienteController.cadastrarCliente("Pedrinha Neto","12345678990","5599999999","pedrinha@gmail.com");
//
//
        // Cadastrando funcionário
        funcionarioController.cadastraFuncionario("Jailson ","9999999","Assistente Mecanico","99999999");

//        //Cadastrando veiculo usando VeiculoController
        veiculoController.adicionarVeiculo("ABC555","Fiat UNO","QWER1",1995, 500000);
//
        veiculoController.listarVeiculos();
        funcionarioController.listarFuncionarios();
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
            System.out.println("\n╔══════════════════════════════════════════════════╗");
            System.out.println("║            🚗 MECHMANAGER  - MENU                  ║");
            System.out.println("╠════════════════════════════════════════════════════╣");
            System.out.println("║  1. 👤 Cadastrar Cliente                           ║");
            System.out.println("║  2. 🔍 Consultar Cliente Específico                ║");
            System.out.println("║  3. ✏️  Alterar Dados de Cliente                   ║");
            System.out.println("║  4. ❌  Deletar Dados de Cliente                   ║");
            System.out.println("║----------------------------------------------------║");
            System.out.println("║  5. 🚘 Cadastrar Veículo                           ║");
            System.out.println("║  6. 🔍 Consultar Veículo Específico                ║");
            System.out.println("║  7. ✏️  Alterar Dados de Veículo                   ║");
            System.out.println("║  8. ❌  Deletar Dados de Veículo                   ║");
            System.out.println("║  9. 📂 Listar Veículos de um Cliente               ║");
            System.out.println("║----------------------------------------------------║");
            System.out.println("║  10. 🧑‍🔧 Cadastrar Funcionário                    ║");
            System.out.println("║  11. 🔍 Consultar Funcionário                      ║");
            System.out.println("║  12. ✏️ Alterar Dados de Funcionario               ║");
            System.out.println("║  13. ❌ Deletar Dados de Funcionário               ║");
            System.out.println("║----------------------------------------------------║");
            System.out.println("║  14. 🛠️  Registrar Atendimento (Ordem de Serviço)  ║");
            System.out.println("║  15. 🔍 Consultar Atendimento                      ║");
            System.out.println("║----------------------------------------------------║");
            System.out.println("║  0. ❌ Sair                                        ║");
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

                    System.out.println("Pressione Enter para continuar...");
                    sc.nextLine();

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

                    System.out.println("Pressione Enter para continuar...");
                    sc.nextLine();
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
                        System.out.println("Veículo ainda esta no sistema!");

                    }

                    System.out.println("Pressione Enter para continuar...");
                    sc.nextLine();

                    break;

                case 9:
                    // listar veículos do cliente

                    break;
                case 10:
                    String nomeFuncionario, cpfFuncionario, cargoFuncionario, telefoneFuncionario;

                    System.out.println("Digite o nome do funcionario:");
                    nomeFuncionario = sc.nextLine();
                    System.out.println("Digite o CPF do funcionario: ");
                    cpfFuncionario = sc.nextLine();
                    System.out.println("Digite o cargo do funcionario: ");
                    cargoFuncionario = sc.nextLine();
                    System.out.println("Digite o telefone do funcionario: ");
                    telefoneFuncionario = sc.nextLine();
                    Funcionario F = funcionarioController.cadastraFuncionario(nomeFuncionario,cpfFuncionario,cargoFuncionario,telefoneFuncionario);

                    System.out.println("Pressione Enter para continuar...");
                    sc.nextLine();

                    break;
                case 11:
                    // consultar funcionário
                    System.out.println("Digite o Nome do funcionario para consulta: ");
                    String buscarPorNome = sc.nextLine();
                    Funcionario funcionarioEncontrado = funcionarioController.buscarPorNome(buscarPorNome);

                    if (funcionarioEncontrado != null) {
                        System.out.println("Funcionario encontrado:");
                        System.out.println(funcionarioEncontrado);
                    } else {
                        System.out.println("Funcionario não encontrado!");
                    }

                    System.out.println("Pressione Enter para continuar...");
                    sc.nextLine();
                    break;



                case 12:
                    // deletar dados de funcionários
                    System.out.println("Digite o nome do funcionario que deseja alterar: ");
                    String nomeDoFuncionario = sc.nextLine();
                    Funcionario funcionarioParaAlterar = funcionarioController.buscarPorNome(nomeDoFuncionario);

                    if (funcionarioParaAlterar != null) {
                        System.out.println("\nFuncionario encontrado:");
                        System.out.println(funcionarioParaAlterar);

                        System.out.println("\nDigite os novos dados do funcionario:");

                        System.out.println("Nome atual: " + funcionarioParaAlterar.getNome());
                        System.out.print("Novo nome: ");
                        String novoNome = sc.nextLine();

                        System.out.println("\nCPF atual: " + funcionarioParaAlterar.getCpf());
                        System.out.print("Novo CPF: ");
                        String novoCpf = sc.nextLine();

                        System.out.println("\nCargo atual: " + funcionarioParaAlterar.getCargo());
                        System.out.print("Novo cargo: ");
                        String novoCargo = sc.nextLine();

                        System.out.println("\nTelefone atual: " + funcionarioParaAlterar.getTelefone());
                        System.out.print("Novo telefone: ");
                        String novoTelefone = sc.nextLine();

                        boolean sucesso = funcionarioController.atualizarTodosDadosFuncionario(
                                novoTelefone, novoNome, novoCpf, novoTelefone);

                        if (sucesso) {
                            System.out.println("\nFuncionario atualizado com sucesso!");
                            System.out.println("Novos dados:");
                            System.out.println(funcionarioController.buscarPorNome(novoNome));
                        } else {
                            System.out.println("\nFalha ao atualizar funcionario.");
                        }
                    } else {
                        System.out.println("\nFuncionario não encontrado!");
                    }

                    System.out.println("Pressione Enter para continuar...");
                    sc.nextLine();

                    break;
                case 13:
                    // deletar dados dos funcionarios
                    System.out.println("Digite o nome do cliente para excluir:");
                    String nome_funcionario = sc.nextLine();
                    Funcionario achouFuncionario = funcionarioController.buscarPorNome(nome_funcionario);
                    if (achouFuncionario != null) {
                        funcionarioController.deletarFuncionario(nome_funcionario);
                        System.out.println("Cliente deletado com Sucesso:");

                    } else {
                        System.out.println("Cliente ainda estar no sistema!");

                    }

                    System.out.println("Pressione Enter para continuar...");
                    sc.nextLine();

                    break;


                case 14:
                    //registrar atendimento
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

                    funcionarioController.listarFuncionarios();
                    System.out.print("Escolha o nome do funcionário deste atendimento: ");

                    String funcionarioAtendimentoID = sc.nextLine();
                    Funcionario funcionarioAtendimento = funcionarioController.buscarFuncionarioPorId(funcionarioAtendimentoID);

                    System.out.println("Descreva o atendimento, caso houver necessidade de peças de reposição etc:");
                    String descricaoAtendimento = sc.nextLine();

                    System.out.println("\nEscolha os serviços prestados no atendimento:");
                    Servico[] servicos = Servico.values();

                    for (int i = 0; i < servicos.length; i++) {
                        System.out.println((i + 1) + " - " + servicos[i].name().replace('_', ' '));
                    }

                    List<Servico> servicosAtendimento = new ArrayList<>();
                    while (true) {
                        System.out.print("Digite o número do serviço (ou 0 para finalizar): ");
                        int opcaoServico = Integer.parseInt(sc.nextLine());

                        if (opcaoServico == 0) break;

                        if (opcaoServico < 1 || opcaoServico > servicos.length) {
                            System.out.println("Opção inválida. Tente novamente.");
                        } else {
                            Servico servicoSelecionado = servicos[opcaoServico - 1];
                            if (servicosAtendimento.contains(servicoSelecionado)) {
                                System.out.println("Esse serviço já foi adicionado.");
                            } else {
                                servicosAtendimento.add(servicoSelecionado);
                                System.out.println("Serviço adicionado: " + servicoSelecionado.name().replace('_', ' '));
                            }
                        }
                    }


                    Atendimento novoAtendimento = atendimentoController.registrarAtendimento(clienteAtendimento, veiculoAtendimento,
                            funcionarioAtendimento, servicosAtendimento, descricaoAtendimento);

                    System.out.println("\nAtendimento registrado com sucesso:");
                    System.out.println("Pressione Enter para continuar...");
                    sc.nextLine();
                    break;

                case 15:
                    // consultar atendimento

                    System.out.println("Pressione Enter para continuar...");
                    sc.nextLine();
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
