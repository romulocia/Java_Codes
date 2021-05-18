package module09;

public class Cliente implements autenticaCliente {
    private boolean status;
    private String nome;
    private String senha;

    public Cliente(boolean status, String nome, String senha) {
        this.status = status;
        this.nome = nome;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    @Override
    public String toString() {
        return "Cliente {" +
                "status = " + status +
                ", nome = " + nome +
                ", senha = " + senha +
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
