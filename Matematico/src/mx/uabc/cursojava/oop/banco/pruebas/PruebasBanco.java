package mx.uabc.cursojava.oop.banco.pruebas;

import mx.uabc.cursojava.oop.banco.Cliente;
import mx.uabc.cursojava.oop.banco.CuentaBancaria;
import mx.uabc.cursojava.oop.banco.TipoCuenta;

public class PruebasBanco {
    public static  void main(String[] args) {
        CuentaBancaria cb1= new CuentaBancaria();
        CuentaBancaria cb2= new CuentaBancaria();
        CuentaBancaria cb3 = new CuentaBancaria(55000, TipoCuenta.CREDITO);
        CuentaBancaria cb4 = new CuentaBancaria(120000, TipoCuenta.INVERSION);

        System.out.println(cb1.getCuentaHabiente());

        Cliente c1 = new Cliente("Wilson", "Perez Perez");

        cb1.setCuentaHabiente(c1);
        cb2.setCuentaHabiente(c1);
        cb3.setCuentaHabiente(c1);
        cb4.setCuentaHabiente(c1);

        System.out.println(cb1.getCuentaHabiente().toString());

        System.out.println(cb1.getSaldo());
        cb1.depositar(20000);
        cb1.retirar(9000);
        System.out.println(cb1.getSaldo());

        System.out.println(cb2.getSaldo());
        cb2.depositar(4556600);
        cb2.retirar(389338);
        System.out.println(cb2.getSaldo());

        System.out.println(cb3.getSaldo());
        cb3.depositar(4600);
        System.out.println(cb3.getSaldo());

        System.out.println(cb4.toString());
    }
}
