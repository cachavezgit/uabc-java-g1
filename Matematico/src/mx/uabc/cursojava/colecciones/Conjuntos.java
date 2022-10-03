package mx.uabc.cursojava.colecciones;

import java.util.*;

public class Conjuntos {
    public static void main (String args[]) {
        Set<String> cadenas = new HashSet<>();
        Collections.addAll(cadenas, args);
        System.out.println(cadenas);

        Integer[] numeros = new Integer[]{34,5,1,1001, 34, -8, 56, 34};

        Set<Integer> conjuntoNumeros = new HashSet<>();
        Collections.addAll(conjuntoNumeros, numeros);
        System.out.println(conjuntoNumeros);

        Set<Integer> conjuntoNumeros2 = new TreeSet<>();
        Collections.addAll(conjuntoNumeros2, numeros);
        System.out.println(conjuntoNumeros2);

        Set<Integer> conjuntoNumeros3 = new LinkedHashSet<>();
        Collections.addAll(conjuntoNumeros3, numeros);
        System.out.println(conjuntoNumeros3);
    }
}

