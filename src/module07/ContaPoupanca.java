package module07;

public class ContaPoupanca extends Conta{
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
        if (!(this.diaAniversario < 20)) {
            return this.saldo + this.saldo * this.taxaDeJuros;
        } else {
            return this.saldo;
        }
    }

    @Override
    public boolean sacar(double quantia) {
        if (quantia >= getSaldo()) {
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
