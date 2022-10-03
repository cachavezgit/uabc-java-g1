package mx.uabc.cursojava.oop.geometria2.tests;

import mx.uabc.cursojava.oop.geometria2.Circulo;
import mx.uabc.cursojava.oop.geometria2.IFiguraGeometrica;
import mx.uabc.cursojava.oop.geometria2.Rectangulo;
import mx.uabc.cursojava.oop.geometria2.UtileriasGeometria;

public class PruebaGeometria2 {
    public static void main(String args[]) {
        IFiguraGeometrica figura1 = new Circulo();
        IFiguraGeometrica figura2 = new Rectangulo();

        figura1.calcularArea();
        figura1.calcularPerimetro();

        figura2.calcularArea();
        figura2.calcularPerimetro();

        demo();

        UtileriasGeometria.comparaFiguras(figura1, figura2);
    }

    public static void demo() {

    }
}
