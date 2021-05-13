package module07;

public class ContaCorrente extends Conta {
    private final double chequeEspecial;

    public ContaCorrente(int numero, int agencia, String banco, double saldo, double sacar, double depositar, double chequeEspecial) {
        super(numero, agencia, banco, saldo, sacar, depositar);
        this.chequeEspecial = chequeEspecial;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "chequeEspecial=" + chequeEspecial +
                '}';
    }

    public double getSacar() {
        if (this.sacar <= this.saldo + this.chequeEspecial + this.depositar) {
            return this.sacar;
        } else {
            return this.sacar = 0;
        }
    }

    public double getSaldo() {
        return this.saldo + this.chequeEspecial + this.depositar - getSacar();
    }
}
