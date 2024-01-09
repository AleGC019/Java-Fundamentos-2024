package sv.com.gm.ventas;

public class Producto {

    private final int idProducto;

    private String name;

    private double precio;

    private static int contadorProducto;

    private Producto(){
        this.idProducto = ++Producto.contadorProducto;
    }

    public Producto(String name, Double precio){
        this();
        this.name = name;
        this.precio = precio;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public static int getContadorProducto() {
        return contadorProducto;
    }

    public static void setContadorProducto(int contadorProducto) {
        Producto.contadorProducto = contadorProducto;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Producto{");
        sb.append("idProducto=").append(idProducto);
        sb.append(", name='").append(name).append('\'');
        sb.append(", precio=").append(precio);
        sb.append('}');
        return sb.toString();
    }
}
