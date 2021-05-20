package module09;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestaConta {
    protected static List<Cliente> clientes;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao;
        boolean status;

        Cliente c01 = new Cliente(true, "André", "111", 12);
        Cliente c02 = new Cliente(true, "Breno", "222", 45);
        Cliente c03 = new Cliente(true, "Carol", "333", 2);
        Cliente c04 = new Cliente(true, "David", "444", 15);
        Cliente c05 = new Cliente(true, "Elias", "555", 3);
        Cliente c06 = new Cliente(true, "Fernanda", "666", 8);
        Cliente c07 = new Cliente(true, "Gabriela", "777", 7);
        Cliente c08 = new Cliente(true, "Heloisa", "888", 48);
        Cliente c09 = new Cliente(true, "Isabel", "999", 9);
        Cliente c10 = new Cliente(true, "Júlio", "000", 22);

        //c09.autentica("jjj");

        List<Cliente> clientes = Arrays.asList(c01, c02, c03, c04, c05, c06, c07, c08, c09);

        //clientes.forEach(cliente -> System.out.println(cliente.getNome() + "\t" + cliente.getCPF() + "\t" + cliente.getCompras()));

        Stream<Cliente> clienteStream = clientes.stream().filter(cliente -> cliente.getCompras() >= 10);

        List<Cliente> selecionados = clienteStream.collect(Collectors.toList());

        selecionados.forEach(cliente -> System.out.println(cliente.getCompras()));

        do {
            System.out.println("--------------------------------------------" +
                    "\n*** Consulta de Clientes ***" +
                    "\n    ** Menu de Opções **" +
                    "\n[1] Cliente que fez MAIS compras." +
                    "\n[2] Cliente que fez MENOS compras." +
                    "\n[3] Média de compras dos clientes." +
                    "\n[4] Cadastrar novo cliente." +
                    "\n[5] Adicionar compras a cliente" +
                    "\n[6] Sair");
            System.out.println("--------------------------------------------" +
                    "\nEscolha a opção desejada: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("pera");
                    break;

                case 2:
                    System.out.println("sei la");
                    break;

                case 3:
                    System.out.println("ummm");
                    break;

                case 4:
                    status = true;
                    System.out.println("Digite o nome do cliente:");
                    String nome = scanner.nextLine();
                    System.out.println("Digite o CPF do cliente:");
                    String CPF = scanner.nextLine();
                    System.out.println("Digite a quantidade de compras:");
                    int compras = scanner.nextInt();
                    clientes.add(new Cliente(status, nome, CPF, compras));
                    System.out.println("\nLista dos Clientes Cadastrados:");

                    break;

                case 5:
                    System.out.println("sei n");
                    break;

                case 6:
                    System.out.println("Programa encerrado!");
                    scanner.close();
                    break;

                default:
                    System.out.println("Opção Inválida.");
                    break;
            }
        } while (opcao != 6);
    }
}
