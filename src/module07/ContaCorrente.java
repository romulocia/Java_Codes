package module07;

public class ContaCorrente extends Conta {
    private double chequeEspecial;

    public ContaCorrente(int numero, int agencia, String banco, double saldo, double chequeEspecial) {
        super(numero, agencia, banco, saldo);
        this.chequeEspecial = chequeEspecial;
    }

    @Override
    public String toString() {
        return  "Conta Corrente {" +
                super.toString() +
                "Cheque Especial = " + chequeEspecial +
                '}';
    }

    public double getSaldo() {
        return this.saldo + this.chequeEspecial;
    }

    public boolean sacar(double quantia) {
        double disponivel = this.chequeEspecial + this.saldo;
        if (quantia > disponivel) {
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
