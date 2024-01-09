package sv.com.gm.ventas;

import java.util.Arrays;

public class Orden {
    private final int idOrden;
    private Producto productos[];

    private static int contadorOrdenes;

    private int contadorProductos;

    private static final int MAX_PRODUCTOS = 10;

    public Orden(){
        this.idOrden = ++Orden.contadorOrdenes;
        this.productos = new Producto[Orden.MAX_PRODUCTOS];
    }

    public void agregarProducto(Producto producto){
        if(this.contadorProductos < Orden.MAX_PRODUCTOS){
            productos[contadorProductos++] = producto;
        }else{
            System.out.println("No es posible agregar mas productos, productos agregados: " + contadorProductos);
        }

    }

    public double calcularTotal(){
        double total = 0;
        for(int i = 0; i < contadorProductos; ++i){
            Producto producto = this.productos[i];
            total = total + producto.getPrecio();
            //Tambien total += thi.productos[i].getPrecio();
        }
        return total;
    }

    public void mostrarOrden(){
        System.out.println("IdOrden: " + this.idOrden);
        double totalOrden = this.calcularTotal();
        System.out.println("Total de la Orden: $" + totalOrden);
        System.out.println("Productos de la Orden: ");
        for(int i = 0; i < this.contadorProductos; ++i){
            System.out.println("Producto: " + this.productos[i]);
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Orden{");
        sb.append("idOrden=").append(idOrden);
        sb.append(", productos=").append(Arrays.toString(productos));
        sb.append(", contadorProductos=").append(contadorProductos);
        sb.append('}');
        return sb.toString();
    }
}
