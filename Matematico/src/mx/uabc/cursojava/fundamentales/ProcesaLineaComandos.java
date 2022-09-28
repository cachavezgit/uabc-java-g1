package mx.uabc.cursojava.fundamentales;

import java.util.Arrays;
import java.util.List;

public class ProcesaLineaComandos {
    public static void main(String[] args) {
        List<String> numeros = Arrays.asList(args);

        for (String n:numeros) {
            int residuo = Integer.parseInt(n) % 2;
            if (residuo > 0) {
                System.out.println(n);
            }
        }
    }
}
