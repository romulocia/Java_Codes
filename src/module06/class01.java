package module06;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class class01 {
    public static void main(String[] args) {
        List<String> colecao = new LinkedList<>(); //posso usar tambem o ArrayList.
        colecao.add("carro");
        colecao.add("moto");
        colecao.add("barco");
        colecao.add("carro");

        System.out.println(colecao.get(0)); //invoca algo da lista.
        System.out.println(colecao.get(2));

        for (String veiculo: colecao) {
            System.out.println(veiculo); //imprime a lista completa utilizando foreach.
        }

        colecao.remove(3); //remove algo da lista.

        for (int i = 0; i < colecao.size(); i++) {
            System.out.println(colecao.get(i)); //outra forma de imprimir toda a lista.
        }
    }
}
