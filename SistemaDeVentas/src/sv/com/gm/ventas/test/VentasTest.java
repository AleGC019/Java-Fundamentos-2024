package sv.com.gm.ventas.test;

import sv.com.gm.ventas.Orden;
import sv.com.gm.ventas.Producto;

public class VentasTest {
    public static void main(String[] args){
        Producto firstProduct = new Producto("Manzana", 0.5);
        Producto secondtProduct = new Producto("Pantalon", 60.50);

        Orden firstOrder = new Orden();
        firstOrder.agregarProducto(firstProduct);
        firstOrder.agregarProducto(secondtProduct);

        firstOrder.mostrarOrden();

        System.out.println();
        System.out.println();

        Producto thirdProduct = new Producto("Xbox SX", 399.99);
        Orden secondOrder = new Orden();
        secondOrder.agregarProducto(firstProduct);
        secondOrder.agregarProducto(secondtProduct);
        secondOrder.agregarProducto(thirdProduct);

        secondOrder.mostrarOrden();

    }
}
