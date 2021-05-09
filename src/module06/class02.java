package module06;

import java.util.HashSet;
import java.util.Set;

public class class02 {
    public static void main(String[] args) {
        Set<String> colecao = new HashSet<>(); //não armazena elementos repetidos.
        colecao.add("carro");
        colecao.add("moto");
        System.out.println(colecao.add("barco")); //mostra o retorno em boleano se o elemento foi validado.
        System.out.println(colecao.add("carro")); //aqui a resposta é false, pois o elemen to esta repetido.

        for (String veiculo: colecao) {
            System.out.println(veiculo); //imprime a lista completa utilizando foreach.
        }
    }
}
