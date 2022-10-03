package mx.uabc.cursojava.colecciones;

import java.util.*;

class Rectangulo {
    private double altura;
    private double base;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public Rectangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    public double calcularArea() {
        return base * altura;
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "altura=" + altura +
                ", base=" + base +
                ", area=" + calcularArea() +
                '}';
    }
}

class ComparaRectangulos implements Comparator<Rectangulo> {

    @Override
    public int compare(Rectangulo r1, Rectangulo r2) {
        return (int) (r1.calcularArea() - r2.calcularArea());
    }
}

public class OrdenaRectangulos {
    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo(124, 300);
        Rectangulo r2 = new Rectangulo(156, 500);
        Rectangulo r3 = new Rectangulo(15, 23);
        Rectangulo r4 = new Rectangulo(35, 100);

        List<Rectangulo> listaRectangulos = new ArrayList<>();

        listaRectangulos.add(r1);
        listaRectangulos.add(r2);
        listaRectangulos.add(r3);
        listaRectangulos.add(r4);

        for (Rectangulo rectangulo: listaRectangulos) {
            System.out.println(rectangulo);
        }

        Collections.sort(listaRectangulos, new Comparator<Rectangulo>() {
            @Override
            public int compare(Rectangulo r1, Rectangulo r2) {
                return (int) (r1.calcularArea()-r2.calcularArea());
            }
        });

        for (Rectangulo rectangulo: listaRectangulos) {
            System.out.println(rectangulo);
        }

    }
}

