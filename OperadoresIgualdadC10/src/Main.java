public class Main {
    public static void main(String[] args) {
        var a = 3;
        var b = 2;

        var c = (a == b);
        System.out.println(c);
        System.out.println();

        var d = (a != b);
        System.out.println(d);
        System.out.println();

        var cadena = "Hola";
        var cadena2 = "Adios";

        var e = (cadena2 == cadena); //Se comparan referenciaas
        System.out.println(e);
        System.out.println();

        var f = cadena.equals(cadena2); //Comparamos contenido de cadenas
        System.out.println(f);
        System.out.println();

        //OPERADORES RELACIONALES
        var g = a >= b;
        System.out.println(g);
        System.out.println();

        if(a % 2 == 0){
            System.out.println("El numero es par");
        }
        else{
            System.out.println("El numero es impar");
        }

        System.out.println();

        var edad  = 10;
        var edadAdulto = 18;
        if(edad >= edadAdulto){
            System.out.println("Usted es mayor de edad");
        }
        else{
            System.out.println("Usted es menor de edad");
        }

        System.out.println();
        //OPERADORES CONDICIONALES
        var num = 10;
        var valorMin = 0;
        var valorMax = 20;

        var res = num >= valorMin && num <= valorMax;
        System.out.println(res);
        System.out.println();
        if(res)
            System.out.println("Dentro del rango");
        else
            System.out.println("Fuera de rango");

        System.out.println();

        var vacaciones = true;
        var diaDescanso = false;

        if(vacaciones || diaDescanso)
            System.out.println("Puede ir al juego");
        else
            System.out.println("No puede ir");

        System.out.println();

        //OPERADORES TERNARIO
        var resultado = (3 > 4) ? "Verdadero" : "Falso";
        System.out.println(resultado);
        System.out.println();

        var numero = 7;
        resultado = (numero % 2 == 0) ? "Es par" : "Es impar";
        System.out.println(resultado);
        System.out.println();

        //PRECEDENCIA DE OPERADORES
        var x1 = 5;
        var y1 = 10;
        var z = ++x1 + y1--;
        System.out.println(z);

        System.out.println();
        var resultado1 = 4 + 5 * 6 / 3;
        System.out.println(resultado1);

        System.out.println();
        resultado1 = (4 + 5) * 6 / 3;
        System.out.println(resultado1);













    }
}