package mx.uabc.cursojava.oop.geometria.tests;

import mx.uabc.cursojava.oop.geometria.Circulo;
import mx.uabc.cursojava.oop.geometria.FiguraGeometrica;
import mx.uabc.cursojava.oop.geometria.Rectangulo;
import mx.uabc.cursojava.oop.geometria.Triangulo;
import org.w3c.dom.css.Rect;

public class PruebaGeometria {
    public static void main (String args []) {
        FiguraGeometrica t1 = new Triangulo(9,6);
        t1.setColor("Rojo");
        System.out.println(((Triangulo)t1).calcularArea());

        FiguraGeometrica r1 = new Rectangulo(8,4);
        r1.setColor("Verde");
        System.out.println(((Rectangulo)r1).calcularArea());

        FiguraGeometrica c1 = new Circulo(20);
        c1.setColor("Azul");
        System.out.println(((Circulo)c1).calculaArea());

    }
}
