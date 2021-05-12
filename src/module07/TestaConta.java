package module07;

public class TestaConta {
    public static void main(String[] args) {

        ContaCorrente cc1 = new ContaCorrente(11, 1, "Banco 01", 100.0, 1000.0);
        System.out.println(cc1);
        System.out.println("O saldo da conta corrente é R$ " + cc1.getSaldo());

        ContaPoupanca cp1 = new ContaPoupanca(22, 2, "Banco 01", 10.0, 20, 0.05);
        System.out.println(cp1);
        System.out.println("O saldo da conta poupança é R$ " + cp1.getSaldo());

        ContaSalario cs1 = new ContaSalario(33, 3, "Banco 01", 50.0, 5);
        System.out.println(cs1);
        System.out.println("O saldo da conta salario é R$ " + cs1.getSaldo());
    }
}
