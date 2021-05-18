package module09;

import java.util.Arrays;
import java.util.List;

public class TestaConta {
    public static void main(String[] args) {

        Cliente c01 = new Cliente(true, "André", "aaa");
        Cliente c02 = new Cliente(false, "Breno", "bbb");
        Cliente c03 = new Cliente(false, "Carol", "ccc");
        Cliente c04 = new Cliente(false, "David", "ddd");
        Cliente c05 = new Cliente(false, "Elias", "eee");
        Cliente c06 = new Cliente(false, "Fernanda", "fff");
        Cliente c07 = new Cliente(false, "Gabriela", "ggg");
        Cliente c08 = new Cliente(false, "Heloisa", "hhh");
        Cliente c09 = new Cliente(false, "Isabel", "iii");
        Cliente c10 = new Cliente(false, "Júnior", "jjj");

        c09.autentica("jjj");

        List<Cliente> clientes = Arrays.asList(c01, c02, c03, c04, c05, c06, c07, c08, c09, c10);

        clientes.forEach(cliente -> System.out.println(cliente.getNome() + cliente.getSenha()));
    }
}
