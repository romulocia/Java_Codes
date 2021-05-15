package module08;

import java.util.*;

public class Menu {
    protected static ArrayList<Cliente> listaClientes;
    protected static ArrayList<ContaCorrente> listaContaCorrente;
    protected static HashMap<Conta, Cliente> MapContas;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        listaClientes = new ArrayList();
        MapContas = new HashMap();
        int opcao;

        do {
            System.out.println("--------------------------------------------" +
                    "\n*** Banco Mentorama ***" +
                    "\nMenu de opções:" +
                    "\n[1]. Criar conta" +
                    "\n[2]. Sacar" +
                    "\n[3]. Depositar" +
                    "\n[4]. Criar Cliente" +
                    "\n[5]. Transferir Valores" +
                    "\n[6]. Mostrar montante disponível nas contas" +
                    "\n[7]. Sair" +
                    "\nEscolha a opção desejada:" +
                    "\n-----------------------------------------------------");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Escolha o tipo de conta a ser criada:" +
                            "\n[1]. Conta Corrente" +
                            "\n[2]. Conta Poupança" +
                            "\n[3]. Conta Salário");
                    opcao = scanner.nextInt();
                    int numero, agencia;
                    double saldo, chequeEspecial;
                    String banco, dataAniversario;

                    switch (opcao) {
                        case 1:
                            Cliente clienteValidado = clienteValido();
                            if (clienteValidado != null) {
                                System.out.println("Digite o numero da conta:");
                                numero = scanner.nextInt();
                                System.out.println("Digite o numero da agencia:");
                                agencia = scanner.nextInt();
                                scanner.nextLine();
                                System.out.println("Digite o nome do banco:");
                                banco = scanner.nextLine();
                                System.out.println("Digite o saldo inicial:");
                                saldo = scanner.nextDouble();
                                System.out.println("Digite o valor do cheque especial:");
                                chequeEspecial = scanner.nextDouble();

                                MapContas.put(new ContaCorrente(numero, agencia, banco, saldo, chequeEspecial), clienteValidado);
                                for (Map.Entry<Conta, Cliente> listaContas: MapContas.entrySet()){
                                    System.out.println(listaContas.getKey() + "\t\t" + listaContas.getValue());}
                            } break;

                        case 2:
                            clienteValidado = clienteValido();
                            if (clienteValidado != null) {
                                System.out.println("Digite o numero da conta:");
                                numero = scanner.nextInt();
                                System.out.println("Digite o numero da agencia:");
                                agencia = scanner.nextInt();
                                scanner.nextLine();
                                System.out.println("Digite o nome do banco:");
                                banco = scanner.nextLine();
                                System.out.println("Digite o saldo inicial:");
                                saldo = scanner.nextDouble();
                                scanner.nextLine();
                                System.out.println("Digite a data de aniversário: (yyyy-mm-dd)");
                                dataAniversario = scanner.nextLine();

                                MapContas.put(new ContaPoupanca(numero, agencia, banco, saldo, dataAniversario), clienteValidado);
                                for (Map.Entry<Conta, Cliente> listaContas: MapContas.entrySet()){
                                    System.out.println(listaContas.getKey() + "\t\t" + listaContas.getValue());}
                            }
                            break;

                        case 3:
                            clienteValidado = clienteValido();
                            if (clienteValidado != null) {
                                System.out.println("Digite o numero da conta:");
                                numero = scanner.nextInt();
                                System.out.println("Digite o numero da agencia:");
                                agencia = scanner.nextInt();
                                scanner.nextLine();
                                System.out.println("Digite o nome do banco:");
                                banco = scanner.nextLine();
                                System.out.println("Digite o saldo inicial:");
                                saldo = scanner.nextDouble();

                                MapContas.put(new ContaSalario(numero, agencia, banco, saldo), clienteValidado);
                                for (Map.Entry<Conta, Cliente> listaContas: MapContas.entrySet()){
                                    System.out.println(listaContas.getKey() + "\t\t" + listaContas.getValue());
                                }
                            }
                    } break;

                case 2:
                    Conta conta = contaValida();
                    if (conta != null) {
                        System.out.println("Operação saque selecionada.");
                        System.out.println("Digite o valor a ser retirado:");
                        int valor = scanner.nextInt();
                        conta.getSaque(valor);
                    } break;
                case 3:
                    System.out.println("Operação depósito selecionada.");
                    conta = contaValida();
                    if (conta != null) {
                        System.out.println("Digite o valor a ser retirado:");
                        int valor = scanner.nextInt();
                        conta.getDeposito(valor);
                    } break;
                case 4:
                    scanner.nextLine();
                    System.out.println("Digite o seu primeiro nome:");
                    String nome = scanner.nextLine();
                    System.out.println("Digite o seu sobrenome:");
                    String sobrenome = scanner.nextLine();
                    System.out.println("Digite o seu cpf:");
                    long cpf = scanner.nextLong();

                    listaClientes.add(new Cliente(nome, sobrenome, cpf));
                    Iterator it = listaClientes.iterator();
                    System.out.println("\nLista dos Clientes Cadastrados:");
                    while (it.hasNext()) {
                        System.out.println(it.next().toString());
                    }
                    break;
                case 5:
                    System.out.println("Operação transferência selecionada" +
                            "\nDigite as informações da sua conta");
                    conta = contaValida();
                    if (conta != null){
                        System.out.println("Digite o valor a ser transferido:");
                        int valor = scanner.nextInt();
                        System.out.println("Digite as informações da conta de destino");
                        Conta destino = contaValida();
                        conta.getTransferencia(destino,valor);
                    }
                    break;
                case 6:
                    System.out.println("O montante disponível no banco é R$" + MontanteTotal());
                    break;
                case 7:
                    System.out.println("Obrigado por estar conosco. Até logo.");
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
        System.out.println("Digite o cpf de um cliente cadastrado:");
        long cpfCadastrado = scanner.nextLong();
        for (Cliente cliente : listaClientes) {
            if (Objects.equals(cliente.getCpf(), cpfCadastrado)) {
                System.out.println(cliente.toString() + " selecionado.");
                return cliente;
            }
        }
        System.out.println("Cliente não cadastrado.");
        return null;
    }

    public static Conta contaValida() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o numero da cpf:");
        long cpfCadastrado = scanner.nextLong();
        System.out.println("Digite o numero da conta:");
        int numeroConta = scanner.nextInt();
        System.out.println("Digite o numero da agencia:");
        int agencia = scanner.nextInt();
        System.out.println("Digite o banco:");
        scanner.nextLine();
        String banco = scanner.nextLine();
        for (Map.Entry<Conta,Cliente> conta : MapContas.entrySet()) {
            if(conta.getKey().getAgencia() == agencia &&
                    conta.getKey().getNumero() == numeroConta &&
                    conta.getKey().getBanco().equals(banco) &&
                    conta.getValue().getCpf()== cpfCadastrado){
                System.out.println(conta.toString() + " selecionado.");
                return conta.getKey();
            }
        }
        System.out.println("Conta não encontrada.");
        return null;
    }

    public static Double MontanteTotal(){
        listaContaCorrente = new ArrayList<>();
        double sum = 0;
        double sumCheque = 0;
        for(Map.Entry<Conta,Cliente> saldoContas : MapContas.entrySet()) {
            sum = MapContas.keySet()
                    .stream()
                    .mapToDouble(Conta::getSaldo)
                    .sum();
            if (saldoContas.getKey().getClass().equals(ContaCorrente.class)){
                listaContaCorrente.add((ContaCorrente) saldoContas.getKey());}
            sumCheque = listaContaCorrente.stream()
                    .mapToDouble(ContaCorrente::getChequeEspecial)
                    .sum();
        } return sum - sumCheque;
    }
}
