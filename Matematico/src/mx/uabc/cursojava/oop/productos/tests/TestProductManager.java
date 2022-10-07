package mx.uabc.cursojava.oop.productos.tests;

import mx.uabc.cursojava.oop.productos.Product;
import mx.uabc.cursojava.oop.productos.ProductManager;

import java.util.ArrayList;
import java.util.List;

public class TestProductManager {
    public static void main(String args[]) {
        ProductManager pm = new ProductManager();

        Product p1 = new Product(1,"Mouse", 3456.45);
        List<String> comments = new ArrayList<>();
        comments.add("Muy comodo");
        comments.add("Un poco caro");
        p1.setComentarios(comments);

        pm.agregarProducto(p1);

        pm.agregarProducto(new Product(2,"Teclado Inalambrico", 456.45));
        pm.agregarProducto(new Product(3,"Headphones", 3463.45));
        pm.agregarProducto(new Product(3,"Pizza Hawaiana", 3463.45));
        pm.agregarProducto(new Product(3,"Pizza Mexicana", 123463.45));
        pm.agregarProducto(new Product(3,"Producto 5", 333463.45));
        pm.agregarProducto(new Product(3,"Producto 6", 93463.45));
        pm.agregarProducto(new Product(3,"Producto 7", 83463.45));

        pm.listarProductos();

        pm.eliminarProducto(2);

        pm.listarProductos();
        System.out.println("---------");
        List<Product> resultado = pm.listarProductosMasCaros(4);
        for(Product p:resultado) {
            System.out.println(p);
        }
        System.out.println("---------");
        List<Product> resultado2 = pm.listarProductosQueComiencenCon("Piz");
        for(Product p:resultado2) {
            System.out.println(p);
        }
    }
}
