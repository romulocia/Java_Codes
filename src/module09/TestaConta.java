package module09;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestaConta {
    public static void main(String[] args) {

        Cliente c01 = new Cliente(true, "André", "aaa", 25);
        Cliente c02 = new Cliente(false, "Breno", "bbb", 12);
        Cliente c03 = new Cliente(false, "Carol", "ccc", 55);
        Cliente c04 = new Cliente(false, "David", "ddd", 32);
        Cliente c05 = new Cliente(false, "Elias", "eee", 54);
        Cliente c06 = new Cliente(false, "Fernanda", "fff", 87);
        Cliente c07 = new Cliente(false, "Gabriela", "ggg", 2);
        Cliente c08 = new Cliente(false, "Heloisa", "hhh", 36);
        Cliente c09 = new Cliente(false, "Isabel", "iii", 8);
        Cliente c10 = new Cliente(false, "Júnior", "jjj", 74);

        c09.autentica("jjj");

        List<Cliente> clientes = Arrays.asList(c01, c02, c03, c04, c05, c06, c07, c08, c09, c10);

        clientes.forEach(cliente -> System.out.println(cliente.getNome() + "\t" + cliente.getSenha() + "\t" + cliente.getCompras()));

        Stream<Cliente> clienteStream = clientes.stream().filter(cliente -> cliente.getCompras() >= 10);

        List<Cliente> selecionados = clienteStream.collect(Collectors.toList());

        selecionados.forEach(cliente -> System.out.println(cliente.getCompras()));
    }
}
