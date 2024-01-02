public class Main {
    public static void main(String[] args) {

        //Suma
        int a = 6, b = 3;

        var resultado = a + b;

        System.out.println(resultado);

        //Resta

        resultado = a - b;

        System.out.println(resultado);

        //Multiplicacion

        resultado = a * b;

        System.out.println(resultado);

        //Division cociente

        resultado = a / b;
        System.out.println(resultado);

        //Division residuo
        resultado = a % b;
        System.out.println(resultado);

        //Hacer una division con punto flotante
        var c = 6D;
        var d = 4D;
        var resultado2 = c / d;
        System.out.println(resultado2);


        //Numero es par o impar
        if(b % 2 == 0)
            System.out.println("El numero es par");
        else
            System.out.println("El numero es impar");


    }
}