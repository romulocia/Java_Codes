package module08;

public abstract class Conta {
    private String banco;
    private int numeroDaConta;
    private int agencia;
    protected double saldo;
    protected double depositar;
    protected double sacar;
    protected double tranferir;
    protected double taxaTransferencia;
    protected double taxaSaque;

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

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getDepositar() {
        return depositar;
    }

    public void setDepositar(double depositar) {
        this.depositar = depositar;
    }

    public double getSacar() {
        return sacar;
    }

    public void setSacar(double sacar) {
        this.sacar = sacar;
    }

    public double getTranferir() {
        return tranferir;
    }

    public void setTranferir(double tranferir) {
        this.tranferir = tranferir;
    }

    public double getTaxaTransferencia() {
        return taxaTransferencia;
    }

    public void setTaxaTransferencia(double taxaTransferencia) {
        this.taxaTransferencia = taxaTransferencia;
    }

    public double getTaxaSaque() {
        return taxaSaque;
    }

    public void setTaxaSaque(double taxaSaque) {
        this.taxaSaque = taxaSaque;
    }

    public Conta(String banco, int numeroDaConta, int agencia, double saldo) {
        this.banco = banco;
        this.numeroDaConta = numeroDaConta;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta {" +
                "Banco = " + banco +
                ", número = " + numeroDaConta +
                ", agência = " + agencia +
                ", saldo = " + saldo +
                '}';
    }
}
