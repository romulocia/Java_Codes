package module07;

public abstract class Conta {
    private int numero;
    private int agencia;
    private String banco;
    protected double saldo;

    public abstract boolean sacar(double quantia);

    public void depositar(double quantia) {this.saldo += quantia;}

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public abstract double getSaldo();

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Conta(int numero, int agencia, String banco, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.banco = banco;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return  "Número = " + numero +
                ", Agência = " + agencia +
                ", Banco = '" + banco + '\'' +
                ", Saldo = " + saldo +
                ", ";
    }
}
