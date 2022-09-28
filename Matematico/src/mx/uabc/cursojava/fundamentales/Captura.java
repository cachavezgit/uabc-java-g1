package mx.uabc.cursojava.fundamentales;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Captura {
    public static void main(String[] args) throws IOException {
        /*
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

            // Reading data using readLine
            String name = reader.readLine();
         */

        /*Scanner in = new Scanner(System.in);
        int s = in.nextInt()
        System.out.println("You entered string " + s);*/

        System.out.println("Numero 1:");
        int num1 = Integer.parseInt(System.console().readLine());
        System.out.println("Numero 2:");
        int num2 = Integer.parseInt(System.console().readLine());
        int resultado = num1 + num2;
        System.out.println(resultado);

    }
}
