package module07;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ContaPoupanca extends Conta{
    Calendar data = Calendar.getInstance();
    SimpleDateFormat formatarData = new SimpleDateFormat("dd");

    private int diaAniversario;
    private double taxaDeJuros;

    public ContaPoupanca(int numero, int agencia, String banco, double saldo,int diaAniversario, double taxaDeJuros) {
        super(numero, agencia, banco, saldo);
        this.diaAniversario = diaAniversario;
        this.taxaDeJuros = taxaDeJuros;
    }

    @Override
    public String toString() {
        return "Conta Poupanca {" +
                super.toString() +
                "Dia De Aniversario = " + diaAniversario +
                ", Taxa De Juros = " + taxaDeJuros +
                '}';
    }

    public double getSaldo(){
        String diaAtual = formatarData.format(data.getTime());
        int diaAtualConvertido = Integer.parseInt(diaAtual);
        if (diaAtualConvertido >= diaAniversario) {
            return this.saldo + this.saldo * this.taxaDeJuros;
        } else {
            return this.saldo;
        }
    }

    @Override
    public boolean sacar(double quantia) {
        if (quantia > getSaldo()) {
            System.out.println("Seu saldo é insuficiente para realizar a transação.");
            return false;
        } else {
            this.saldo -= quantia;
            System.out.println("Saque de R$ " + quantia + " foi realizado com sucesso.");
            System.out.println("Seu saldo atualizado é R$ " + getSaldo());
            return true;
        }
    }
}
