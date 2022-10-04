package mx.uabc.cursojava.streams;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class EncriptarLineasArchivoStreams {
    public static void main (String args[]) throws Exception {
        FileInputStream fis = new FileInputStream("C:\\Users\\cachavez\\curso-java\\Matematico\\Lineas.txt");
        Scanner scanner = new Scanner(fis);

        List<String> lineasDelArchivo = new ArrayList<>();
        List<Integer> codigosCadena = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String linea = scanner.nextLine();
            lineasDelArchivo.add(linea);
        }

        Stream<String> streamLineas = lineasDelArchivo.stream();
        streamLineas.forEach(linea -> linea.chars().forEach(numero -> codigosCadena.add(numero+1)));


        codigosCadena.forEach(c -> System.out.print((char)c.intValue()));



    }
}
