package module05.class11;

public enum cores {
    BRANCO("Cor do nome"), PRETO("Cor do fundo"), LARANJA("Cor da logo");

    private String texto;
    cores(String texto) {
        this.texto = texto;
    }
    public String getTexto() {
        return texto;
    }
}
