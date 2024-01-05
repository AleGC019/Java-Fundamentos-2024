import clases.Persona;

public class Main {
    public static void main(String[] args) {
        Persona pruebaPersona = new Persona("Alejandro");
        System.out.println("Persona 1: \n" + pruebaPersona);
        System.out.println();
        Persona persona2 = new Persona("Melani");
        System.out.println("Persona 2: \n" + persona2);
        System.out.println();
        imprimir(pruebaPersona);
    }

    public static void imprimir(Persona persona){
        System.out.println("Persona Static\n" + persona);
    }
}