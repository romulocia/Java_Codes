package module09;

public class Cliente implements autenticaSenha {
    private String senha;
    private String nome;
    private String CPF;
    private int compras;


    public Cliente(String senha, String nome, String CPF, int compras) {
        this.senha = senha;
        this.nome = nome;
        this.CPF = CPF;
        this.compras = compras;
    }

    public String getNome() {
        return nome;
    }

    public String getCPF() {
        return CPF;
    }

    public int getCompras() {
        return this.compras;
    }

    public void setCompras(int compras) {
        this.compras = compras;
    }

    @Override
    public boolean autenticaSenha(String senha) {
        if (!this.senha.equals(senha)) {
            System.out.println("Senha Incorreta!\nConfira sua senha.");
            return false;
        } else {
            return true;
        }
    }

    @Override
    public String toString() {
        return ">>> Cliente: " + nome +
                ", CPF = " + CPF +
                ", Quantidade de compras = " + compras +
                ".";
    }
}
