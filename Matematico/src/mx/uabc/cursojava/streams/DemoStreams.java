package mx.uabc.cursojava.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Empleado {
    private int clave;
    private String nombre;
    private double sueldo;

    public Empleado(int clave, String nombre, double sueldo) {
        this.clave = clave;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void incrementaSueldo() {
        this.sueldo *=2;
    }
}

public class DemoStreams {
    public static void main(String[] args) {
        Empleado [] empleados = new Empleado[3];
        empleados[0] = new Empleado(1,"Wilson Perez", 13903494);
        empleados[1] = new Empleado(2,"Lucia Gomez", 1234445);
        empleados[2] = new Empleado(3,"Matilde Hernandez", 784646);

        Stream<Empleado> s = Stream.of(empleados);
        s.forEach(e -> System.out.println(e.getSueldo()));
        s = Stream.of(empleados);
        s.forEach(e -> e.incrementaSueldo());
        s = Stream.of(empleados);
        s.forEach(e -> System.out.println(e.getSueldo()));

        List<Empleado> listaEmpleados = Arrays.asList(empleados);
        Stream<Empleado> s2=listaEmpleados.stream();
        s2.forEach(e -> System.out.println(e.getClave()));






    }
}
