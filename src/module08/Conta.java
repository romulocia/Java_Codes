package module08;

public abstract class Conta {
    private String banco;
    private int numeroDaConta;
    private int agencia;
    protected double saldo;
    protected double saque;
    protected double deposito;
    protected double transferencia;


    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public int getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public abstract boolean getSaque(double valor);

    public boolean getDeposito(double valor){
        saldo += valor;
        System.out.println("Depósito de R$ " + valor + " realizado com sucesso");
        System.out.println("O saldo atualizado da conta é R$" + saldo);
        return true;
    }

    public abstract boolean getTransferencia(Conta emissor, Conta destino, double valor);

    public double getTaxaTransferencia() {
        return 1.25;
    }

    public double getLimiteSaques() {
        return 3;
    }

    public Conta(String banco, int numeroDaConta, int agencia, double saldo) {
        this.banco = banco;
        this.numeroDaConta = numeroDaConta;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return
                "Banco = " + banco +
                ", Número = " + numeroDaConta +
                ", Agência = " + agencia +
                ", Saldo = " + saldo +
                ", ";
    }
}
