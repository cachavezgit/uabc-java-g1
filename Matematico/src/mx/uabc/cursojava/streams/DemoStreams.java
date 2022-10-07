package mx.uabc.cursojava.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
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

    @Override
    public String toString() {
        return "Empleado{" +
                "clave=" + clave +
                ", nombre='" + nombre + '\'' +
                ", sueldo=" + sueldo +
                '}';
    }
}

public class DemoStreams {
    public static void main(String[] args) {
        Empleado [] empleados = new Empleado[3];
        empleados[0] = new Empleado(1,"Wilson Perez", 8000);
        empleados[1] = new Empleado(2,"Lucia Gomez", 5000);
        empleados[2] = new Empleado(3,"Matilde Hernandez", 10000);

        Stream<Empleado> s = Stream.of(empleados);
        s.forEach(e -> System.out.println(e.getSueldo()));
        s = Stream.of(empleados);
        s.forEach(e -> e.incrementaSueldo());
        s = Stream.of(empleados);
        s.forEach(e -> System.out.println(e.getSueldo()));

        List<Empleado> listaEmpleados = Arrays.asList(empleados);
        Stream<Empleado> s2=listaEmpleados.stream();

        Arrays.asList(empleados).stream()
                .filter(e -> e.getSueldo() > 12500)
                .filter(e -> e!=null)
                .collect(Collectors.toList())
                .forEach(e -> System.out.println(e));

        Empleado empleado = Arrays.asList(empleados).stream()
                .filter(e -> e.getSueldo() > 12500)
                .filter(e -> e!=null)
                .findFirst()
                .orElse(null);

        System.out.println(empleado);

        Long cuenta = Arrays.asList(empleados).stream()
                .filter(e -> e.getSueldo() > 12500)
                .filter(e -> e!=null)
                .count();

        System.out.println(cuenta);

    }
}
