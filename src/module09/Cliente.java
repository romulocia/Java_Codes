package module09;

public class Cliente implements autenticaCliente {
    private String nome;
    private long cpf;

    public Cliente(String nome, long cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public long getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return "\n>>> Cliente: " + nome + ", CPF: " + cpf + ".";
    }
}
