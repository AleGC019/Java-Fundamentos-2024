import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //ENTEROS
        System.out.println();
        int enteros = 10;
        System.out.println(enteros);
        //Es posible modificar las variables
        //Mientras no se utilicen etiquetas que mantengan
        //Estatico su valor
        enteros = enteros + 10;
        System.out.println(enteros);

        //STRINGS
        String miNombre = "Alejandro";
        System.out.println(miNombre);

        miNombre = "Carlos";
        System.out.println(miNombre);

        //INFERENCIA EN JAVA
        var enterosVar = 10;
        System.out.println(enterosVar);

        var miNombreVar = "Rene";
        System.out.println(miNombreVar);

        //Reglas para definir las variables en Java

        //Se recomienda utilizar minuscula
        var miVariablePrueba = "Hola que tal estas?";
        var _miVariablePrueba = "Hola que tal estas?";
        var $miVariablePrueba = "Hola que tal estas?";
        //Es posible pero sin tildes para evitar problemas segun el lenguaje de un sistema operativo
        //var míVariablePrueba = "Hola que tal estas?";

        //Concatenacion

        var nombre = "Alejandro";
        var usuarioTipo = "Administrador";
        var informacionUsuario = nombre + " " + usuarioTipo;
        System.out.println(informacionUsuario);

        var i = 3;
        var j = 4;
        var z = i + j;
        System.out.println(z);//Se realiza suma de numeros

        //Si primero son numeros realiza la operacion
        System.out.println(i + j + " " + usuarioTipo);
        //Si encuentra un string de primero toma como cadena de texto
        System.out.println(usuarioTipo + " " + i + j);
        //Con perentesis cambiamos la prioridad de las operaciones
        System.out.println(usuarioTipo + " " + (i + j));
        System.out.println();

        //Caracteres Especiales en Java
        var nombrePrueba = "Karla";

        //Salto de linea
        System.out.println("Nueva linea: \n" + nombrePrueba);
        //Tabulacion
        System.out.println("Tabulacion: \t" + nombrePrueba);
        //Retroceso, se recorre tantas posiciones para atras como \b existan
        System.out.println("Retroceso: \b" + nombrePrueba);
        //Comillas simples
        System.out.println("Nueva linea: \'" + nombrePrueba + "\'");
        //Comillas dobles
        System.out.println("Nueva linea: \"" + nombrePrueba + "\"");


        //Clase Scanner de Java
        Scanner consola = new Scanner(System.in);

        System.out.println();
        System.out.println();

        System.out.printf("Ingresa tu nombre: ");
        var nameDeUsuario = consola.nextLine();

        System.out.println("Su nombre es: " + nameDeUsuario);

        System.out.printf("Ingresa un titulo: ");
        var titleDeUsuario = consola.nextLine();

        System.out.println("El titulo es: " + titleDeUsuario);

        System.out.println("El " + titleDeUsuario + " " + nameDeUsuario);


        //TAREA SOBRE SECCION DE VARIABLES

    }
}