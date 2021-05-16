package module08;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ContaPoupanca extends Conta {
    Calendar data = Calendar.getInstance();
    SimpleDateFormat formatarData = new SimpleDateFormat("dd");

    public static final double TAXA_RENDIMENTO_MENSAL = 0.05;
    private int diaDoRendimento;
    public ContaPoupanca(String banco, int numeroDaConta, int agencia, double saldo, int diaDoRendimento) {
        super(banco, numeroDaConta, agencia, saldo);
        this.diaDoRendimento = diaDoRendimento;
    }

    public double getSaldo(){
        String dia = formatarData.format(data.getTime());
        int diaConvertido = Integer.parseInt(dia);
        if (diaConvertido >= this.diaDoRendimento) {
            return this.saldo *= TAXA_RENDIMENTO_MENSAL;
        } else {
            return this.saldo;
        }
    }
    @Override
    public boolean sacar(double valor) {
        if (valor > getSaldo()) {
            System.out.println("Saldo insuficiente para realizar a transação.");
            return false;
        } else {
            this.saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
            System.out.println("Saldo atualizado: R$ " + getSaldo());
            return true;
        }
    }

    @Override
    public boolean transferir(Conta emissor, Conta destino, double valor) {
        if (getSaldo() < valor + getTaxaTransferencia()){
            System.out.println("Saldo insuficiente para realizar o saque.");
            return false;
        } else {
            emissor.saldo -= valor - getTaxaTransferencia();
            destino.saldo += valor;
            System.out.println("Transferência de R$ " + valor + " realizado com sucesso.");
            System.out.println("Taxa fixa de transferência: R$ " + getTaxaTransferencia());
            System.out.println("Saldo atualizado: R$ " + getSaldo());
            return true;
        }
    }

    @Override
    public String toString() {
        return "Conta Poupanca {" +
                super.toString() +
                "Dia do rendimento mensal = " + diaDoRendimento +
                '}';
    }
}
