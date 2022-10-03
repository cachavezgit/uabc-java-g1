package mx.uabc.cursojava.colecciones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ArregloSortearArchivo {
    public static void main(String[] args) throws Exception {
        String lineasDelArchivo[] = new String[100];

        File f = new File("C:\\Users\\cachavez\\curso-java\\Matematico\\src\\mx\\uabc\\cursojava\\colecciones\\entrada.txt");
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);

        String linea="";
        int numLinea = 0;

        while((linea=br.readLine())!=null) {
            lineasDelArchivo[numLinea] = linea;
            numLinea++;
        }

        br.close();
        fr.close();

        for(String line:lineasDelArchivo) {
            if (line==null)
                break;
            System.out.println(line);
        }

        Arrays.sort(lineasDelArchivo, new Comparator<String>() {
            @Override
            public int compare(String stringOne, String stringTwo) {
                if (stringOne !=null && stringTwo !=null) {
                    return stringOne.compareTo(stringTwo);
                }
                return (stringOne == stringTwo)?0:(stringOne==null?1:-1);
            }
        });

        System.out.println("Impresion Ordenada:");

        for(String line:lineasDelArchivo) {
            if (line==null)
                break;
            System.out.println(line);
        }

        // Ocurrencias de una linea en el arreglo
        String searchQuery = "1914 translaTION by H. Rackham";
        int occurrence = -1;

        for (int i=0; i<lineasDelArchivo.length; i++) {
            if (lineasDelArchivo[i] == null)
                break;

            occurrence = lineasDelArchivo[i].compareToIgnoreCase(searchQuery);
            if (occurrence == 0) {
                System.out.println(String.format("Se encontró la cadena buscada en %d", i));
            }
        }

    }
}
