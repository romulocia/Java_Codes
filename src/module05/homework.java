package module05;

import java.util.Scanner;

public class homework {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("\n--------------------------------------------------------------------");
        System.out.println("\nDidite as alturas: ");

        Double maiorAltura = 0.0, menorAltura = 5.0;//Objeto wrap tipo Double recebendo um tipo primitivo.

        Double[] altura = new Double[3];

        for (int i = 0; i < altura.length; i++) {
            System.out.print("\nAltura " + (i + 1) + ": ");
            altura[i] = ler.nextDouble();

            if (altura[i] > maiorAltura) {
                maiorAltura = altura[i];
            }
            if (altura[i] < menorAltura) {
                menorAltura = altura[i];
            }
        }

        System.out.println("\n-------------------------------------------------------------------");
        System.out.println("\nMaior altura: " + maiorAltura + "\n\nMenor altura: " + menorAltura);
        System.out.println("\n-------------------------------------------------------------------");

        ler.close();
    }
}
