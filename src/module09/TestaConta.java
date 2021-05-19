package module09;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestaConta {
    public static void main(String[] args) {

        Cliente c01 = new Cliente(true, "André", "111", 0);
        Cliente c02 = new Cliente(true, "Breno", "222", 0);
        Cliente c03 = new Cliente(true, "Carol", "333", 0);
        Cliente c04 = new Cliente(true, "David", "444", 0);
        Cliente c05 = new Cliente(true, "Elias", "555", 0);
        Cliente c06 = new Cliente(true, "Fernanda", "666", 0);
        Cliente c07 = new Cliente(true, "Gabriela", "777", 0);
        Cliente c08 = new Cliente(true, "Heloisa", "888", 0);
        Cliente c09 = new Cliente(true, "Isabel", "999", 0);

        c09.autentica("jjj");

        List<Cliente> clientes = Arrays.asList(c01, c02, c03, c04, c05, c06, c07, c08, c09);

        clientes.forEach(cliente -> System.out.println(cliente.getNome() + "\t" + cliente.getCPF() + "\t" + cliente.getCompras()));

        Stream<Cliente> clienteStream = clientes.stream().filter(cliente -> cliente.getCompras() >= 10);

        List<Cliente> selecionados = clienteStream.collect(Collectors.toList());

        selecionados.forEach(cliente -> System.out.println(cliente.getCompras()));
    }
}
