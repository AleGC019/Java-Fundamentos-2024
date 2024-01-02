import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Convertir tipo String a tipo int
        //Practicamente hacer un cast
        var edad = Integer.parseInt("30");
        //Recordar la prioridad de los parentesis
        System.out.println("Edad: " + (edad + 2));

        System.out.println();
        //Caso que no se haga el cas
        var edad2 = "30";
        //Recordar la prioridad de los parentesis
        System.out.println("Edad (Sin el cast): " + (edad2 + 2));


        System.out.println();
        //Se toma un String y se hace un cast a un valor Double
        var valorPI = Double.parseDouble("3.1415");
        System.out.println("PI: " + valorPI);

        System.out.println();

        //Ejercicio para pedir cosas desde consola

        Scanner consola = new Scanner(System.in);
        System.out.printf("Ingresa tu edad: ");
        edad = Integer.parseInt(consola.nextLine());
        System.out.println("Tu edad es: " + edad);


        //Tipo INT a String
        var edadTexto = String.valueOf(edad);
        //En este punto la variable ingresada no es int
        //es String
        System.out.println("Tu edad es (pero en String): " + edadTexto);


        System.out.println();
        //Ahora trabajaremos con los caracteres
        //Recuperar un caracter
        var caracter = "Hola".charAt(0);
        //De esta forma estamos recuperando la posicion 0 de la palabra
        System.out.println(caracter);


        System.out.printf("Ingresa un caracter: ");
        caracter = consola.nextLine().charAt(0);
        //De esta forma solo se recupera el primer caracter
        //Aunque el usuario ingrese mas elementos
        System.out.println(caracter);

        /*
        Esto dara error
         */
        //String color;
        //System.out.println(color);

    }
}