package module08;

public abstract class Conta {
    private String banco;
    private int numeroDaConta;
    private int agencia;
    protected double saldo;
    protected double taxaTransferencia;

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public double getTaxaTransferencia() {
        return 1.25;
    }

    public void setTaxaTransferencia(double taxaTransferencia) {
        this.taxaTransferencia = taxaTransferencia;
    }

    public abstract boolean sacar(double valor);

    public abstract boolean transferir(Conta emissor, Conta destino, double valor);

    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Depósito de R$ " + valor + " realizado com sucesso");
        System.out.println("O saldo atualizado da conta é R$" + saldo);
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
