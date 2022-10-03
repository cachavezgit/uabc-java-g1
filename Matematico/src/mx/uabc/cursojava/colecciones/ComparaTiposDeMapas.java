package mx.uabc.cursojava.colecciones;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class ComparaTiposDeMapas {
    public static void main(String args[]) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        insertAndPrint(map);
    }

    static void insertAndPrint(AbstractMap<Integer, String> map)
    {
        int[] array= {1, -1, 0, 2,-2};
        for (int x: array)
        {
            map.put(x, Integer.toString(x));
        }
        for (int k: map.keySet())
        {
            System.out.print(k + ", ");
        }
    }
}
