package clases;

public class Empleado extends Persona{
    private double sueldo;

    private int idEmpleado;

    private static int contadorDeEmpleado;

    public Empleado() {
        Empleado.contadorDeEmpleado++;
        this.idEmpleado = Empleado.contadorDeEmpleado;
        //Puede utilizarse
        //this.idEmpleado = ++Empleado.contadorDeEmpleado

    }  //Constructor para el elemento que ya pertence a la clase
    public Empleado(String nombre, char genero, int edad, String direccion, double sueldo) {
        //super(nombre, genero, edad, direccion);
        this();
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
        this.sueldo = sueldo;

    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public static int getContadorDeEmpleado() {
        return contadorDeEmpleado;
    }

    public static void setContadorDeEmpleado(int contadorDeEmpleado) {
        Empleado.contadorDeEmpleado = contadorDeEmpleado;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Empleado {\n");
        sb.append("\tsueldo = ").append(sueldo);
        sb.append(", idEmpleado = ").append(idEmpleado);
        sb.append(", \n\t\tPersona {").append(super.toString());
        sb.append("\n\t\t}\n}");
        return sb.toString();
    }
}
