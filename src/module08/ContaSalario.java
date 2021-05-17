package module08;

public class ContaSalario extends Conta {
    private int quantidadeDeSaques;

    public ContaSalario(String banco, int numeroDaConta, int agencia, double saldo, int quantidadeDeSaques) {
        super(banco, numeroDaConta, agencia, saldo);
        this.quantidadeDeSaques = quantidadeDeSaques;
    }

    @Override
    public double getSaldo() {
        return this.saldo;
    }

    @Override
    public boolean getSaque(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente para realizar a transação.");
            return false;
        } else {
            if (this.quantidadeDeSaques <= getLimiteSaques()) {
                this.quantidadeDeSaques++;
                this.saldo -= valor;
                System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
                System.out.println("Saldo atualizado: R$ " + getSaldo());
                return true;
            } else {
                System.out.println("Limite de saques mensal foi excedido.");
                return false;
            }
        }
    }
    @Override
    public boolean getTransferencia(Conta destino, double valor) {
        if (getSaldo() < valor + getTaxaTransferencia()) {
            System.out.println("Saldo insuficiente para realizar o saque.");
            return false;
        } else {
            this.saldo = this.getSaldo() - valor - getTaxaTransferencia();
            destino.saldo += valor;
            System.out.println("Transferência de R$ " + valor + " realizado com sucesso.");
            System.out.println("Taxa fixa de transferência: R$ " + getTaxaTransferencia());
            System.out.println("Saldo atualizado: R$ " + getSaldo());
            return true;
        }
    }

    @Override
    public String toString() {
        return  "Conta Salário {" +
                super.toString() +
                "Quantidade De Saques = " + quantidadeDeSaques +
                '}';
    }
}
