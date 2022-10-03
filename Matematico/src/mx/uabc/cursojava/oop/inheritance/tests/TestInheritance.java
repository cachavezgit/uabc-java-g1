package mx.uabc.cursojava.oop.inheritance.tests;

import mx.uabc.cursojava.oop.inheritance.Flor;
import mx.uabc.cursojava.oop.inheritance.Girasol;
import mx.uabc.cursojava.oop.inheritance.GirasolExotico;

public class TestInheritance {
    public static void main(String[] args) {
        Flor f1 = new Flor();
        Girasol g1 = new Girasol();
        GirasolExotico ge1 = new GirasolExotico();

        Object ge2 = new GirasolExotico(); //Polimorfismo

        procesaFlor(f1);
        procesaFlor(g1);
        procesaFlor(ge1);

        ge1.metodoExotico();

        ((GirasolExotico)ge2).metodoExotico();

        //((GirasolExotico)g1).metodoExotico(); no se vale de arriba hacia abajo
        ge1.fotoSintesis();
    }

    public static void procesaFlor(Flor f) {

    }
}
