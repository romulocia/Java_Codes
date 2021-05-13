package module07;

public class ContaSalario extends Conta{
    static final Integer LIMITE_DE_SAQUES = 2;
    private int quantidadeDeSaques;

    public ContaSalario(int numero, int agencia, String banco, double saldo, double sacar, double depositar, int quantidadeDeSaques) {
        super(numero, agencia, banco, saldo, sacar, depositar);
        this.quantidadeDeSaques = quantidadeDeSaques;
    }

    public double getSaldo() {
        return this.saldo + this.depositar - this.sacar ;
    }

    public double getSacar() {
        if (quantidadeDeSaques <= LIMITE_DE_SAQUES && this.sacar <= this.saldo + this.depositar) {
            return this.sacar;
        } else {
            return this.sacar = 0;
        }
    }
}
