package mx.uabc.cursojava.exceptions;

public class CuentaBancaria {
    private double saldo = 0.0;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double retiro(double cantidad) throws SobregiroException {
        if (cantidad > saldo) {
            throw new SobregiroException();
        }
        this.saldo -=cantidad;

        return this.saldo;

    }
}
