package module09;

import java.util.*;

public class TestaConta {

    public static final String SENHA_DE_ACESSO = "123";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Cliente> clientes = new ArrayList<>();
        MostraClientes mostra = new MostraClientes();
        int opcao;

        clientes.add(new Cliente("1a2b3c", "André", "111", 12));
        clientes.add(new Cliente("1a2b3c", "Breno", "222", 45));
        clientes.add(new Cliente("1a2b3c", "Carol", "333", 2));
        clientes.add(new Cliente("1a2b3c", "David", "444", 15));
        clientes.add(new Cliente("1a2b3c", "Elias", "555", 3));
        clientes.add(new Cliente("1a2b3c", "Fernanda", "666", 8));
        clientes.add(new Cliente("1a2b3c", "Gabriela", "777", 7));
        clientes.add(new Cliente("1a2b3c", "Heloisa", "888", 48));
        clientes.add(new Cliente("1a2b3c", "Isabel", "999", 9));
        clientes.add(new Cliente("1a2b3c", "Júlio", "000", 22));
        //clientes.forEach(cliente -> System.out.println(cliente.getNome() + "\t" + cliente.getCPF() + "\t" + cliente.getCompras()));
        //Stream<Cliente> clienteStream = clientes.stream().filter(cliente -> cliente.getCPF().equals("888"));
        //List<Cliente> selecionados = clienteStream.collect(Collectors.toList());
        //selecionados.forEach(cliente -> System.out.println(cliente.getNome()));


        do {
            Optional<Cliente> maiorNumeroDeCompras = clientes.stream().max(Comparator.comparing(Cliente::getCompras));
            Optional<Cliente> menorNumeroDeCompras = clientes.stream().min(Comparator.comparing(Cliente::getCompras));
            int totalNumeroDeCompras = clientes.stream().mapToInt(Cliente::getCompras).sum();
            int mediaNumeroDeCompras = totalNumeroDeCompras / clientes.size();

            System.out.println("--------------------------------------------" +
                    "\n*** Consulta de Clientes ***" +
                    "\n    ** Menu de Opções **" +
                    "\n[1] Cliente que fez MAIS compras." +
                    "\n[2] Cliente que fez MENOS compras." +
                    "\n[3] Média de compras dos clientes." +
                    "\n[4] Cadastrar novo cliente." +
                    "\n[5] Adicionar compras ao cliente" +
                    "\n[6] Lista com todos os clientes" +
                    "\n[7] Sair");
            System.out.print("--------------------------------------------" +
                    "\nEscolha a opção desejada: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Cliente com maior número de compras:\n" +
                            ">>> Cliente: " + maiorNumeroDeCompras.get().getNome() +
                            ", CPF = " + maiorNumeroDeCompras.get().getCPF() +
                            ", Quantidade de compras = " + maiorNumeroDeCompras.get().getCompras());
                    break;

                case 2:
                    System.out.println("Cliente com maior número de compras:\n" +
                            ">>> Cliente: " + menorNumeroDeCompras.get().getNome() +
                            ", CPF = " + menorNumeroDeCompras.get().getCPF() +
                            ", Quantidade de compras = " + menorNumeroDeCompras.get().getCompras());
                    break;

                case 3:
                    System.out.println("A média do número de compras dos clientes da lista é: " +
                            mediaNumeroDeCompras);
                    break;

                case 4:
                    String senha = SENHA_DE_ACESSO;
                    scanner.nextLine();
                    System.out.print("Digite o nome do cliente: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o CPF do cliente: ");
                    String CPF = scanner.nextLine();
                    System.out.print("Digite a quantidade de compras: ");
                    int compras = scanner.nextInt();
                    System.out.println("Novo cliente cadastrado com sucesso!\n" +
                            ">>> Cliente: " + nome +
                            ", CPF = " + CPF +
                            ", Quantidade de compras = " + compras +
                            ".");
                    clientes.add(new Cliente(senha, nome, CPF, compras));
                    break;

                case 5:
                    scanner.nextLine();
                    System.out.println("Digite o CPF do cliente:");
                    String cpfCliente = scanner.nextLine();
                    Cliente clienteSelecionado = null;

                    for (Cliente cliente : clientes) {
                        if (Objects.equals(cliente.getCPF(), cpfCliente)) {
                            clienteSelecionado = cliente;
                        }
                    }
                    if (clienteSelecionado == null) {
                        System.out.println("CPF não cadastrado");
                        break;
                    } else {
                        System.out.println("Cliente selecionado:\n" + clienteSelecionado);
                        System.out.print("Informe o número de compras a serem adicionadas: ");
                        int numeroDeComprasAdicionais = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Digite a senha:");
                        String tentativaSenha = scanner.nextLine();
                        if (clienteSelecionado.autenticaSenha(tentativaSenha)) {
                            clienteSelecionado.setCompras(clienteSelecionado.getCompras() + numeroDeComprasAdicionais);
                            System.out.println("Novas compras adicionadas com sucesso!" +
                                    ">>> Cliente: " + clienteSelecionado.getNome() +
                                    ", CPF = " + clienteSelecionado.getCPF() +
                                    ", Quantidade de compras = " + clienteSelecionado.getCompras() +
                                    ".");
                        }
                    }
                    break;

                case 6:
                    System.out.println(">>> LISTA DE CLIENTES:");
                    clientes.forEach(mostra);
                    break;

                case 7:
                    System.out.println("Programa encerrado!");
                    scanner.close();
                    break;

                default:
                    System.out.println("Opção Inválida.");
                    break;
            }
        } while (opcao != 7);
    }
}


