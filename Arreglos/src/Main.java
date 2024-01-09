import clases.Persona;

public class Main {
    public static void main(String[] args) {
        //Elementos basicos para el uso de arreglos
        //en Java
        //int edades[] = new int[3];
        //Inicializar un arreglo
        Persona personas[] = new Persona[2];

        personas[0] = new Persona("Alejandro");
        personas[1] = new Persona("Carlos");

        System.out.println(personas[0].toString());
        System.out.println(personas[1].toString());

    }
}