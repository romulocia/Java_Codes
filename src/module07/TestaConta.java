package module07;

public class TestaConta {
    public static void main(String[] args) {

        ContaCorrente cc1 = new ContaCorrente(11, 1, "Banco 01", 100.0, 20.0, 10.0, 500.0);
        System.out.println(cc1);
        System.out.println("O saldo da conta corrente é R$ " + cc1.getSaldo());

        ContaPoupanca cp1 = new ContaPoupanca(22, 2, "Banco 01", 100.0, 20.0, 10.0, 30 ,0.1);
        System.out.println(cp1);
        System.out.println("O saldo da conta poupança é R$ " + cp1.getSaldo());

        ContaSalario cs1 = new ContaSalario(33, 3, "Banco 01", 100.0, 20.0, 10.0, 2);
        System.out.println(cs1);
        System.out.println("O saldo da conta salario é R$ " + cs1.getSaldo());
    }
}
