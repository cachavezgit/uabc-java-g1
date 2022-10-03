package mx.uabc.cursojava.colecciones;

import java.io.FileInputStream;
import java.util.*;

public class LecturaOrdenadaArchivo {
    public static void main(String args[]) throws Exception{
        FileInputStream fis = new FileInputStream("C:\\Users\\cachavez\\curso-java\\Matematico\\src\\mx\\uabc\\cursojava\\colecciones\\entrada.txt");
        Scanner scanner = new Scanner(fis);

        List<String> lineasArchivo = new ArrayList<>();

        while (scanner.hasNextLine()) {
            lineasArchivo.add(scanner.nextLine());
        }

        ListIterator<String> iterador = lineasArchivo.listIterator();

        while (iterador.hasNext()) {
            String linea = iterador.next();
            List<String> palabras = Arrays.asList(linea.split(" "));
            Collections.sort(palabras);
            linea = String.join(" ", palabras);
            iterador.set(linea.toUpperCase());
        }

        Collections.sort(lineasArchivo);

        for(String linea:lineasArchivo) {
            System.out.println((linea));
        }
    }
}
