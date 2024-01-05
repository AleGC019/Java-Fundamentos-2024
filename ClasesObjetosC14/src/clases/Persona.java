package clases;

public class Persona {

    private String nombre;
    private String apellido;
    private boolean eliminado;

    public Persona(){

    }
    public Persona(String nombre, String apellido, boolean eliminado){
        this.nombre = nombre;
        this.apellido = apellido;
        this.eliminado = eliminado;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public void setEliminado(boolean eliminado){
        this.eliminado = eliminado;
    }

    public String getNombre(){
        return this.nombre;
    }
    public String getApellido() {
        return this.apellido;
    }

    public boolean isEliminado(){
        return this.eliminado;
    }

    //Imprimir estado del objeto, to String
    public String toString(){
        return "Persona\n[Nombre: " + this.nombre + "]" +
                "\n[Apellido: " + this.apellido + "]" +
                "\n[Eliminado: " + this.eliminado + "]\n";
    }

    public void desplegarInformacion(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellido: " + this.apellido);
        System.out.println("Esta eliminado: " + this.eliminado);
    }

}
