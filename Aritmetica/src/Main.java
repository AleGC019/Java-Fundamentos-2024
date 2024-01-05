import clases.Aritmetica;

public class Main {
    public static void main(String[] args) {

        var x = 10;
        var y = 45;



        //Opcion uno enviar elementos directamente
        Aritmetica operaciones1 = new Aritmetica(5, 6);
        operaciones1.resta();
        operaciones1.sumar();
        //Retornar un elemento con una funcion
        var multi = operaciones1.multi();
        System.out.println("Valor de la multiplicacion: " + multi);
        System.out.println();
        //Previo a modificar
        var a = operaciones1.getA();
        var b = operaciones1.getB();
        System.out.println(a);
        System.out.println(b);
        System.out.println();
        //Opcion 2, elementos con objeto ya creado
        operaciones1.sumaModificada(13,14);
        System.out.println();
        System.out.println(a);
        System.out.println(b);

    }
}