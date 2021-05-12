package module07;

public class ContaSalario extends Conta{
    private int limiteDeSaques;

    public ContaSalario(int numero, int agencia, String banco, double saldo, int limiteDeSaques) {
        super(numero, agencia, banco, saldo);
        this.limiteDeSaques = limiteDeSaques;
    }

    public double getSaldo() {
        return this.saldo;
    }
}
