package module09;

public class Cliente implements autenticaCliente {
    private boolean status;
    private String nome;
    private String senha;
    private int compras;

    public Cliente(boolean status, String nome, String senha, int compras) {
        this.status = status;
        this.nome = nome;
        this.senha = senha;
        this.compras = compras;
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public int getCompras() {
        return this.compras;
    }

    @Override
    public String toString() {
        return "Cliente {" +
                "status = " + status +
                ", nome = " + nome +
                ", senha = " + senha +
                ", compras = " + compras +
                '}';
    }

    @Override
    public boolean autentica(String senha) {
        if (this.senha != senha){
            System.out.println("Não autenticada");
            return false;
        } else {
            System.out.println("Autenticado!");
            return true;
        }
    }
}
