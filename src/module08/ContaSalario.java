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
    public boolean sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente para realizar a transação.");
            return false;
        } else {
            if (this.quantidadeDeSaques < 3) {
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
    public boolean transferir(Conta emissor, Conta destino, double valor) {
        if (getSaldo() < valor + getTaxaTransferencia()){
            return false;
        } else {
            emissor.saldo -= valor - getTaxaTransferencia();
            destino.saldo += valor;
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
