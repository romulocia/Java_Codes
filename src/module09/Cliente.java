package module09;

public class Cliente implements autenticaCliente {
    private boolean status;
    private String nome;
    private String CPF;
    private int compras;

    public Cliente(boolean status, String nome, String CPF, int compras) {
        this.status = status;
        this.nome = nome;
        this.CPF = CPF;
        this.compras = compras;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public int getCompras() {
        return this.compras;
    }

    public void setCompras(int compras) {
        this.compras = compras;
    }

    @Override
    public String toString() {
        return ">>> Cliente: " + nome +
                ", CPF = " + CPF +
                ", Quantidade de compras = " + compras +
                "status = " + status +
                '}';
    }

    @Override
    public boolean autentica(String CPF) {
        if (this.CPF != CPF){
            System.out.println("Não autenticada");
            return false;
        } else {
            System.out.println("Autenticado!");
            return true;
        }
    }
}
