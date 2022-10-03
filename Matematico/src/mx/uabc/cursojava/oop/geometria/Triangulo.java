package mx.uabc.cursojava.oop.geometria;

public class Triangulo extends FigurasConLados {

    public Triangulo(double base, double altura) {
        super.altura = altura;
        super.base = base;
    }
    @Override
    public double calcularArea() {
        double temp = super.calcularArea();
        return temp / 2;
    }
}
