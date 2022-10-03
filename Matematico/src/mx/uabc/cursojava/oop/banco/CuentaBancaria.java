package mx.uabc.cursojava.oop.banco;

/**
 * Esta es una clase que representa las cuentas que ofrece el banco
 */
public class CuentaBancaria {
    // fields
    /**
     * Es el saldo de la cuenta
     */
    private double saldo=0.0;

    Cliente cuentaHabiente;


    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    private TipoCuenta tipo;

    public TipoCuenta getTipo() {
        return tipo;
    }

    public void setTipo(TipoCuenta tipo) {
        this.tipo = tipo;
    }

    public Cliente getCuentaHabiente() {
        return cuentaHabiente;
    }

    public void setCuentaHabiente(Cliente cuentaHabiente) {
        this.cuentaHabiente = cuentaHabiente;
    }

    // constructors
    public CuentaBancaria () {
        System.out.println("Se creo una cuenta bancaria...");
    }

    public CuentaBancaria (double saldoInicial, TipoCuenta tipo) {
        this.saldo = saldoInicial;
        this.tipo = tipo;
    }

    // methods

    /**
     * Incrementa el saldo de la cuenta
     * @param cantidad es el valor que se adicionará al saldo
     */
    public void depositar(double cantidad){
        this.saldo += cantidad;
    }

    /**
     * Disminuye el saldo de la cuenta
     * @param cantidad es el valor que se restará al saldo
     */
    public void retirar(double cantidad) {
        this.saldo -= cantidad;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "saldo=" + saldo +
                ", cuentaHabiente=" + cuentaHabiente +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
