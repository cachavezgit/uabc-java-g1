package mx.uabc.cursojava.colecciones;

import java.util.HashMap;
import java.util.Map;

public class Mapas {
    public static void main(String[] args) {
        Map<Integer, String> miMapa = new HashMap<>();
        miMapa.put(3, "Texto 3");
        miMapa.put(1, "Texto 1");
        miMapa.put(2, "Texto 2");
        System.out.println(miMapa.get(2));

        System.out.println(miMapa.keySet());
        System.out.println(miMapa.entrySet());
    }
}
