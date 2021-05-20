package module08;

public class ContaCorrente extends Conta implements Tributavel{
    private double chequeEspecial;

    public ContaCorrente(String banco, int numeroDaConta, int agencia, double saldo, double chequeEspecial) {
        super(banco, numeroDaConta, agencia, saldo);
        this.chequeEspecial = chequeEspecial;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    @Override
    public double getSaldo() {
        return this.saldo + this.chequeEspecial;
    }

    @Override
    public boolean getSaque(double valor) {
        if (valor > this.chequeEspecial + this.saldo) {
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
    public boolean getTransferencia(Conta destino, double valor) {
        if (getSaldo() < valor + getValorImposto()) {
            System.out.println("Saldo insuficiente para realizar o saque.");
            return false;
        } else {
            this.saldo = this.saldo - valor - getValorImposto();
            destino.saldo += valor;
            System.out.println("Transferência de R$ " + valor + " realizado com sucesso.");
            System.out.println("Taxa fixa de transferência: R$ " + getValorImposto());
            System.out.println("Saldo atualizado: R$ " + getSaldo());
            return true;
        }
    }

    @Override
    public String toString() {
        return  "Conta Corrente {" +
                super.toString() +
                "Cheque Especial = " + chequeEspecial +
                '}';
    }

    @Override
    public double getValorImposto() {
        return this.getSaldo() * 0.01;
    }
}




