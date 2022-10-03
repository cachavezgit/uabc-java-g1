package mx.uabc.cursojava.oop.productos;

import java.util.ArrayList;
import java.util.List;

public final class Product extends DefProducto implements  IProducto{
    private final int id;

    private final String nombre;

    private final double precio;

    private List<String> comentarios;

    public List<String> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<String> comentarios) {
        this.comentarios = comentarios;
    }

    public Product(int id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.comentarios = new ArrayList<>();
    }

    public int getId() {
        return id;
    }



    public String getNombre() {
        return nombre;
    }



    public double getPrecio() {
        return precio;
    }



    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", comentarios" + this.getComentarios().toString() +
                '}';
    }

    @Override
    public void review(int calificacion) {

    }
}
