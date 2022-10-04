package mx.uabc.cursojava.lamdbaexpressions;

interface IRevisarNumeroPrimo {
    /**
     * Revisa si el numero dado es primo.
     * Un número primo es aquel que sólo es divisible entre sí mismo y el 1
    * */
    public boolean esPrimo(int num);
}

public class PruebaNumerosPrimos {

    public static void main (String args[]) {
        IRevisarNumeroPrimo prueba = ((num) -> {
            int vueltas = (int) Math.sqrt(num);
            for (int contador=2;contador<=vueltas;contador++) {
                if (num%contador == 0)
                    return false;
            }
            return true;
        });

        System.out.println(String.format("El numero %d es primo: %b", 2, prueba.esPrimo(2)));
        System.out.println(String.format("El numero %d es primo: %b", 3, prueba.esPrimo(3)));
        System.out.println(String.format("El numero %d es primo: %b", 216547687, prueba.esPrimo(216547687)));
        System.out.println(String.format("El numero %d es primo: %b", 743, prueba.esPrimo(743)));
        System.out.println(String.format("El numero %d es primo: %b", 4, prueba.esPrimo(4)));
        System.out.println(String.format("El numero %d es primo: %b", 6, prueba.esPrimo(6)));
    }





}
