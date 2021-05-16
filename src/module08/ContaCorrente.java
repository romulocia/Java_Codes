package module08;

public class ContaCorrente extends Conta {
    private double chequeEspecial;

    public ContaCorrente(String banco, int numeroDaConta, int agencia, double saldo, double chequeEspecial) {
        super(banco, numeroDaConta, agencia, saldo);
        this.chequeEspecial = chequeEspecial;
    }

    @Override
    public double getSaldo() {
        return this.saldo + this.chequeEspecial;
    }

    public boolean sacar(double valor) {
        if (valor > this.chequeEspecial + this.saldo) {
            System.out.println("Seu saldo é insuficiente para realizar a transação.");
            return false;
        } else {
            this.saldo -= valor;
            System.out.println("Saque de R$ " + valor + " foi realizado com sucesso.");
            System.out.println("Seu saldo atualizado é R$ " + getSaldo());
            return true;
        }
    }
}




