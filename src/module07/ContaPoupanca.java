package module07;

public class ContaPoupanca extends Conta{
    static final Integer DATA_ANIVERSARIO = 15;
    private int dataSaque;
    private double taxaDeJuros;

    public ContaPoupanca(int numero, int agencia, String banco, double saldo, double sacar, double depositar, int diaAniversario, double taxaDeJuros) {
        super(numero, agencia, banco, saldo, sacar, depositar);
        this.dataSaque = diaAniversario;
        this.taxaDeJuros = taxaDeJuros;
    }

    public double getSacar() {
        if (this.sacar <= this.saldo + this.depositar) {
            return this.sacar;
        } else {
            return this.sacar = 0;
        }
    }

    public double getSaldo(){
        if (this.dataSaque <= 31 && this.dataSaque >= DATA_ANIVERSARIO) {
            return ((this.saldo + this.depositar - getSacar()) * this.taxaDeJuros) + this.saldo + this.depositar - getSacar() ;
        } else {
            return this.saldo;
        }
    }
}
