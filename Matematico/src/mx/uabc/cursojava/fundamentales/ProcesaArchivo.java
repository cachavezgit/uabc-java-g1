package mx.uabc.cursojava.fundamentales;

import java.io.File;
import java.io.FileInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class ProcesaArchivo {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("C:\\Users\\cachavez\\curso-java\\Matematico\\Lineas.txt");
        Scanner scanner = new Scanner(fis);

        short longitudGanadora = 0;
        String lineaMasLarga = "";

        /*
        while (scanner.hasNextLine()) {
            String linea = scanner.nextLine();

            if (linea.length() > 10) {
                System.out.println(linea);

                lineaMasLarga = (linea.length()>longitudGanadora)?linea:lineaMasLarga;
                longitudGanadora = (linea.length()>longitudGanadora)?(short)linea.length():longitudGanadora;

            }
        }

         */

        fis.close();
        scanner.close();

        List<String> lines =Files.readAllLines(Path.of("C:\\Users\\cachavez\\curso-java\\Matematico\\Lineas.txt"));
        for (String linea:lines) {
            if (linea.length() <= 10){
                continue;
            }

            System.out.println(linea);
            lineaMasLarga = (linea.length()>longitudGanadora)?linea:lineaMasLarga;
            longitudGanadora = (linea.length()>longitudGanadora)?(short)linea.length():longitudGanadora;

        }

        System.out.println(String.format("La cadena más larga es: %s", lineaMasLarga));

    }
}
