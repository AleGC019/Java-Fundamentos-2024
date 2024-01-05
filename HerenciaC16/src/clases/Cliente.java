package clases;

import java.util.Date;

public class Cliente extends Persona{

    private int idCliente;
    private static int contadorDeClientes;
    private Date fechaRegistro;
    private boolean vip;

    public Cliente(){
        Cliente.contadorDeClientes++;
        this.idCliente = Cliente.contadorDeClientes;
    }

    public Cliente(String nombre, char genero, int edad, String direccion, Date fechaRegistro, boolean vip) {
        this();
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public static int getContadorDeClientes() {
        return contadorDeClientes;
    }

    public static void setContadorDeClientes(int contadorDeClientes) {
        Cliente.contadorDeClientes = contadorDeClientes;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cliente {");
        sb.append("\n\tidCliente = ").append(idCliente);
        sb.append(", fechaRegistro = ").append(fechaRegistro);
        sb.append(", vip = ").append(vip);
        sb.append(", \n\t\tPersona {").append(super.toString());
        sb.append("\n\t\t}\n\t}");
        return sb.toString();
    }
}
