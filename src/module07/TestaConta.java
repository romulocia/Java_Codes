package module07;

public class TestaConta {
    public static void main(String[] args) {

        ContaCorrente cc1 = new ContaCorrente(22, 1, "Banco 01", 100.0, 1000.0);
        System.out.println(cc1);

        System.out.println("O saldo da conta corrente é R$ " + cc1.getSaldo());

        ContaPoupanca cp1 = new ContaPoupanca(33, 3, "Banco 01", 10.0, 20, 0.05);

        System.out.println("O saldo da conta poupança é R$ " + cp1.getSaldo());
    }
}
