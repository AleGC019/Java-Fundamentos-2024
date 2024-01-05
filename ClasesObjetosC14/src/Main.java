import clases.Persona;

public class Main {
    public static void main(String[] args) {

        Persona persona1 = new Persona("Alejandro", "Gomez", false);
        Persona persona2 = new Persona("Rene", "Gomez", true);

        persona1.desplegarInformacion();
        System.out.println();
        persona2.desplegarInformacion();
        System.out.println();
        System.out.println("Persona 1: " + persona1);//println manda a llamar directamente el metodo toString
    }
}