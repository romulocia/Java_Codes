package module05;

public class class08 {
    public static void main(String[] args) {
        String texto0 = " Use - Companhia ";
        String texto1 = " USE - COMPANHIA ";

        System.out.println(texto0.charAt(7));

        System.out.println(texto0.substring(7, 16));

        System.out.println(texto0.isEmpty());

        System.out.println(texto0.equals(texto1));
        System.out.println(texto0.equalsIgnoreCase(texto1));

        System.out.println(texto0.startsWith("Use"));
        System.out.println(texto0.endsWith("ia"));

        String[] textos0 = texto0.split("-"); //quebra o texto em palavras onde estiver o selecionado, no caso o hifem.
        for (String t: textos0) {
            System.out.println(t);
        }

        String[] textos1 = texto0.split("-");
        for (String t: textos1) {
            System.out.println(t.toLowerCase());
        }

        String[] textos2 = texto0.split("-");
        for (String t: textos2) {
            System.out.println(t.toUpperCase());
        }

        String[] textos3 = texto0.split("-");
        for (String t: textos3) {
            System.out.println(t.trim()); //o trim restira os espa�os.
        }
    }
}
