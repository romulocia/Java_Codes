package module08;

import java.time.LocalDate;
import java.util.*;

public class MenuGerente {
    private static final String NOME_BANCO = "Mentorama";
    protected static List<Cliente> listaClientes;
    protected static List<ContaCorrente> listaContaCorrente;
    protected static HashMap<Conta, Cliente> MapContas;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        listaClientes = new ArrayList();
        MapContas = new HashMap();

        int opcao;
        int numeroDaConta = 1000 , agencia, quantidadeDeSaques = 3;
        double saldo, chequeEspecial;
        String banco = NOME_BANCO, dataAniversario;

        do {
            System.out.println("--------------------------------------------" +
                    "\n*** Banco Mentorama ***" +
                    "\nMenu de opções:" +
                    "\n[1] Criar Cliente" +
                    "\n[2] Criar Conta" +
                    "\n[3] Depositar" +
                    "\n[4] Sacar" +
                    "\n[5] Transferir Valores" +
                    "\n[6] Mostrar montante disponível nas contas" +
                    "\n[7] Sair" +
                    "\nEscolha a opção desejada:");
            opcao = scanner.nextInt();
            System.out.println("--------------------------------------------");
            switch (opcao) {
                case 1:
                    scanner.nextLine();
                    System.out.println("Digite o nome do cliente:");
                    String nome = scanner.nextLine();
                    System.out.println("Digite o CPF do cliente:");
                    long cpf = scanner.nextLong();

                    listaClientes.add(new Cliente(nome, cpf));
                    Iterator it = listaClientes.iterator();
                    System.out.println("\nLista dos Clientes Cadastrados:");
                    while (it.hasNext()) {
                        System.out.println(it.next().toString());
                    }
                    break;

                case 2:
                    do {
                        System.out.println("Escolha o tipo de conta a ser criada:" +
                                "\n[1] Conta Corrente" +
                                "\n[2] Conta Poupança" +
                                "\n[3] Conta Salário" +
                                "\n[4] Voltar ao Menu principal");

                        opcao = scanner.nextInt();

                        switch (opcao) {

                            case 1:
                                Cliente clienteValidado = clienteValido();
                                if (clienteValidado != null) {
                                    System.out.println("Digite o número da agência:");
                                    agencia = scanner.nextInt();
                                    System.out.println("Digite o saldo inicial:");
                                    saldo = scanner.nextDouble();
                                    System.out.println("Digite o valor do cheque especial:");
                                    chequeEspecial = scanner.nextDouble();

                                    MapContas.put(new ContaCorrente(banco, numeroDaConta, agencia, saldo, chequeEspecial), clienteValidado);
                                    for (Map.Entry<Conta, Cliente> listaContas : MapContas.entrySet()) {
                                        System.out.println(listaContas.getValue() + "\n" + listaContas.getKey());
                                    }
                                    numeroDaConta += 1;
                                }
                                break;

                            case 2:
                                clienteValidado = clienteValido();
                                if (clienteValidado != null) {
                                    dataAniversario = String.valueOf(LocalDate.now());
                                    System.out.println("Digite o numero da agencia:");
                                    agencia = scanner.nextInt();
                                    scanner.nextLine();
                                    System.out.println("Digite o saldo inicial:");
                                    saldo = scanner.nextDouble();

                                    MapContas.put(new ContaPoupanca(banco, numeroDaConta, agencia, saldo, dataAniversario), clienteValidado);
                                    for (Map.Entry<Conta, Cliente> listaContas : MapContas.entrySet()) {
                                        System.out.println(listaContas.getValue() + "\n" + listaContas.getKey());
                                    }
                                    numeroDaConta += 1;
                                }
                                break;

                            case 3:
                                clienteValidado = clienteValido();
                                if (clienteValidado != null) {
                                    System.out.println("Digite o numero da agencia:");
                                    agencia = scanner.nextInt();
                                    scanner.nextLine();
                                    System.out.println("Digite o saldo inicial:");
                                    saldo = scanner.nextDouble();

                                    MapContas.put(new ContaSalario(banco, numeroDaConta, agencia, saldo, quantidadeDeSaques), clienteValidado);
                                    for (Map.Entry<Conta, Cliente> listaContas : MapContas.entrySet()) {
                                        System.out.println(listaContas.getValue() + "\n" + listaContas.getKey());
                                    }
                                    numeroDaConta += 1;
                                }
                                break;

                            case 4:
                                break;

                            default:
                                System.out.println("Opção Inválida.");
                                break;
                        }
                    } while (opcao != 4);
                    break;

                case 3:
                    System.out.println("Operação depósito selecionada.");
                    Conta conta = contaValida();
                    if (conta != null) {
                        System.out.println("Digite o valor a ser retirado:");
                        int valor = scanner.nextInt();
                        conta.getDeposito(valor);
                    }
                    break;

                case 4:
                    conta = contaValida();
                    if (conta != null) {
                        System.out.println("Operação saque selecionada.");
                        System.out.println("Digite o valor a ser retirado:");
                        int valor = scanner.nextInt();
                        conta.getSaque(valor);
                    }
                    break;

                case 5:
                    System.out.println("Operação transferência selecionada");
                    System.out.println("Digite as informações da conta emissora");
                    conta = contaValida();
                    if (conta != null) {
                        System.out.println("Digite o valor a ser transferido:");
                        int valor = scanner.nextInt();
                        System.out.println("Digite as informações da conta de destino");
                        Conta destino = contaValida();
                        conta.getTransferencia(destino, valor);
                    }
                    break;
                case 6:
                    System.out.println("O montante disponível no banco é R$" + MontanteTotal());
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

    public static Cliente clienteValido() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o CPF de um cliente cadastrado:");
        long cpfCadastrado = scanner.nextLong();
        for (Cliente cliente : listaClientes) {
            if (Objects.equals(cliente.getCpf(), cpfCadastrado)) {
                System.out.println(cliente.toString() + " Selecionado.");
                return cliente;
            }
        }
        System.out.println("Cliente não cadastrado.");
        return null;
    }

    public static Conta contaValida() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número da conta:");
        int numeroConta = scanner.nextInt();
        System.out.println("Digite o número da agencia:");
        int agencia = scanner.nextInt();
        for (Map.Entry<Conta, Cliente> conta : MapContas.entrySet()) {
            if (conta.getKey().getAgencia() == agencia &&
                    conta.getKey().getNumeroDaConta() == numeroConta) {
                System.out.println(conta.toString() + " Selecionada.");
                return conta.getKey();
            }
        }
        System.out.println("Conta não encontrada.");
        return null;
    }

    public static Double MontanteTotal() {
        listaContaCorrente = new ArrayList<>();
        double sum = 0;
        double sumCheque = 0;
        for (Map.Entry<Conta, Cliente> saldoContas : MapContas.entrySet()) {
            sum = MapContas.keySet()
                    .stream()
                    .mapToDouble(Conta::getSaldo)
                    .sum();
            if (saldoContas.getKey().getClass().equals(ContaCorrente.class)) {
                listaContaCorrente.add((ContaCorrente) saldoContas.getKey());
            }
            sumCheque = listaContaCorrente.stream()
                    .mapToDouble(ContaCorrente::getChequeEspecial)
                    .sum();
        }
        return sum - sumCheque;
    }
}
