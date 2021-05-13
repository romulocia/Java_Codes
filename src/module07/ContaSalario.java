package module07;

public class ContaSalario extends Conta{
    private int quantidadeDeSaques;

    public ContaSalario(int numero, int agencia, String banco, double saldo, int quantidadeDeSaques) {
        super(numero, agencia, banco, saldo);
        this.quantidadeDeSaques = quantidadeDeSaques;
    }

    @Override
    public String toString() {
        return  "Conta Salário {" +
                super.toString() +
                "Quantidade De Saques = " + quantidadeDeSaques +
                '}';
    }

    @Override
    public double getSaldo() {
        return this.saldo;
    }

    @Override
    public boolean sacar(double quantia) {
        if (quantia > saldo) {
            System.out.println("Seu saldo é insuficiente para realizar a transação.");
            return false;
        } else {
            if (this.quantidadeDeSaques > 0) {
                this.quantidadeDeSaques--;
                this.saldo -= quantia;
                System.out.println("Saque de R$ " + quantia + " foi realizado com sucesso.");
                System.out.println("Seu saldo atualizado é R$ " + getSaldo());
                return true;
            } else {
                System.out.println("Seu limite de saques mensais foi excedido.");
                return false;
            }
        }
    }
}
