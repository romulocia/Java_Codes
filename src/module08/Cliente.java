package module08;

public class Cliente {
    private String nome;
    private long cpf;

    public Cliente(String nome, long cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public long getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return ">>> Cliente: " + nome + ", CPF: " + cpf + ".";
    }
}
