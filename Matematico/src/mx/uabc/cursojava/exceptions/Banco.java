package mx.uabc.cursojava.exceptions;

public class Banco {
    public static void main(String[] args) {
        CuentaBancaria cb1 = new CuentaBancaria();
        cb1.setSaldo(12000);
        try {
            double saldoRestante = cb1.retiro(15000);
        }
        catch (SobregiroException ex) {
            ex.printStackTrace();
        }

    }
}
