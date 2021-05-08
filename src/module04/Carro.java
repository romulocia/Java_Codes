package module04;

public class Carro {

    public static final String VERMELHO = "vermelho";
    public static final String PRETO = "preto";
    private Integer quantidadePneus;
    private Integer quantidadeCalotas;
    private Integer quantidadeParafusoPneu;


    public Carro(Integer quantidadePneus) {
        setQuantidadePneus(quantidadePneus);
    }

    public Integer getQuantidadePneus() {
        return quantidadePneus + 2;
    }

    public void setQuantidadePneus(Integer quantidadePneus) {
        setQuantidadeCalotas(quantidadePneus);
        setQuantidadeParafusoPneu(quantidadePneus * 4);
        this.quantidadePneus = quantidadePneus;
    }

    public void setCor(String cor) {
        System.out.println(cor);
    }

    public Integer getQuantidadeCalotas() {
        return quantidadeCalotas;
    }

    public void setQuantidadeCalotas(Integer quantidadeCalotas) {
        this.quantidadeCalotas = quantidadeCalotas;
    }

    public Integer getQuantidadeParafusoPneu() {
        return quantidadeParafusoPneu;
    }

    public void setQuantidadeParafusoPneu(Integer quantidadeParafusoPneu) {
        this.quantidadeParafusoPneu = quantidadeParafusoPneu;
    }

    public void imprimeValores() {
        System.out.println("Quantidade de Pneus " + getQuantidadePneus());
        System.out.println("Quantidade de Calotas " + getQuantidadeCalotas());
        System.out.println("Quantidade de Parafusos " + getQuantidadeParafusoPneu());
    }
}
