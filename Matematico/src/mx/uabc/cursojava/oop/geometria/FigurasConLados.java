package mx.uabc.cursojava.oop.geometria;

public class FigurasConLados extends FiguraGeometrica {
    double base;
    double altura;

    public double calcularArea() {
        return (base*altura);
    }

    public FigurasConLados() {

    }
    public FigurasConLados(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
}
