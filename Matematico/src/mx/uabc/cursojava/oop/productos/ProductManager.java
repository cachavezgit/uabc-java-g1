package mx.uabc.cursojava.oop.productos;

import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    private List<Product> inventario = new ArrayList<Product>();

    public void listarProductos() {
        for(Product p:inventario) {
            System.out.println(p);
        }
    }

    public void agregarProducto(Product producto) {
        inventario.add(producto);
    }

    public void eliminarProducto(int id) {
        inventario.removeIf(p -> p.getId()==id);
    }
}
