package module07;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TestaConta {
    public static void main(String[] args) {
        Calendar data = Calendar.getInstance();
        SimpleDateFormat formatarData = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Conta contas[] = new Conta[3];

        ContaCorrente cc = new ContaCorrente(1, 1, "Banco 01", 100.0, 200.0);
        ContaPoupanca cp = new ContaPoupanca(2, 1, "Banco 01", 100.0, 15, 0.05);
        ContaSalario cs = new ContaSalario(3, 1, "Banco 01", 100.0, 3);

        contas[0] = cc;
        contas[1] = cp;
        contas[2] = cs;

        System.out.println("Obtendo o saldo das contas:");
        System.out.println("-------------------------------------------------------------");
        for (Conta conta:contas) {
            System.out.println("Data: " + formatarData.format(data.getTime()));
            System.out.println(conta);
            System.out.println("Saldo atual: R$ " + conta.getSaldo());
            System.out.println("-------------------------------------------------------------");
        }
    }
}
