package mx.uabc.cursojava.fundamentales;

import mx.uabc.cursojava.figurasgeometricas.Circulo;
import mx.uabc.cursojava.figurasgeometricas.Rectangulo;
import mx.uabc.cursojava.figurasgeometricas.Triangulo;

import java.math.BigDecimal;
import java.math.BigInteger;

public class HolaMundo {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        Circulo c1 = new Circulo();
        Triangulo t1=new Triangulo();
        Rectangulo r1 =new Rectangulo();

        int cantidad1 = 5000;
        int cantidad2 = 8000;

        int resultado = cantidad1 + cantidad2;

        char letra = 'a';

        float cantidadConPunto = (float) 98.76;
        double cantidad3 = 98.12;
        System.out.println(letra);

        System.out.println(resultado);

        String s= "Ivan";
        String s2 = new String();
        String s3 = "\uD83D\uDD25";

        String cad1 = new String("Uno");
        String cad2 = new String("Uno");

        if (cad1.equals(cad2 )){ // Se compara la referencia
            System.out.println("Son iguales");
        }
        else {
            System.out.println("No son iguales");
        }

        int diasDelMes = 31;

        switch(diasDelMes) {
            case 29:
            case 28:
                System.out.println("Febrero");
                break;
            case 30:
                System.out.println("April, Junio, Septiembre, Noviembre");
                break;
            case 31:
                System.out.println("Enero, Marzo, Mayo, Julio, Agosto, Octubre, Diciembre");
                break;
            default:
                System.out.println("No es un mes válido");
        }

        String parte1 = "Bienvenido al";
        String parte2 = "Sistema";

        System.out.println(parte1+parte2);

        StringBuilder sb = new StringBuilder();
        sb.append("Bienvenido al ");
        sb.append("sistema");

        System.out.println(sb);

        System.out.println(String.format("Los 3 numeros generados son: %d,%d,%d", 10,20,30));

        BigInteger b1 =  BigInteger.valueOf(Long.MAX_VALUE);
        b1.add(BigInteger.valueOf(Long.MAX_VALUE));

        System.out.println(b1.toString());

        BigDecimal bd1=BigDecimal.valueOf(Double.MAX_VALUE);
        bd1.add(BigDecimal.valueOf(Double.MAX_VALUE));
        System.out.println(bd1.toString());

    }
}
