package mx.uabc.cursojava.oop.inheritance;

public class Girasol extends Flor {
    public Girasol() {
        System.out.println("Se creo un girasol...");
    }

    @Override
    public void fotoSintesis () {
        System.out.println("Se ejecuto la fotosintesis en la clase Girasol...");
    }
}
