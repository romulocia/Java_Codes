package module08;

public class ContaCorrente extends Conta {
    private double chequeEspecial;
    public ContaCorrente(String banco, int numeroDaConta, int agencia, double saldo, double chequeEspecial) {
        super(banco, numeroDaConta, agencia, saldo);
        this.chequeEspecial = chequeEspecial;
    }
}


