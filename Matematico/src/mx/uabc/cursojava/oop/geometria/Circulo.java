package mx.uabc.cursojava.oop.geometria;

public class Circulo extends FigurasRedondas {
    public Circulo (double d) {
        setDiametro(d);
    }

    public double calculaArea() {
        return Math.PI * Math.pow(getDiametro()/2,2);
    }

}
