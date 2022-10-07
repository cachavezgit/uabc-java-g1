package mx.uabc.cursojava.oop.productos;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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

    public List<Product> listarProductosMasCaros(int limite) {
        return inventario.stream()
                .sorted(Comparator.comparing(Product::getPrecio).reversed())
                .limit(limite)
                .collect(Collectors.toList());
    }

    public List<Product> listarProductosQueComiencenCon(String cad) {
        return inventario.stream()
                .filter(p->p.getNombre().startsWith(cad))
                .collect(Collectors.toList());
    }
}
