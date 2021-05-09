package module06;

import java.util.HashMap;

public class class06 {
    public static void main(String[] args) {
        HashMap<String, String> mapa = new HashMap<>();
        mapa.put("C", "caro");
        mapa.put("M", "moto");
        mapa.put("B", "bike");

        System.out.println(mapa.get("C"));

        mapa.remove("M");

        System.out.println(mapa.get("M"));
    }
}
