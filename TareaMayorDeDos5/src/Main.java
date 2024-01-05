import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.printf("Proporciona el numero1: ");
        var numero1 = Integer.parseInt(consola.nextLine());
        System.out.printf("Proporciona el numero2: ");
        var numero2 = Integer.parseInt(consola.nextLine());
        var resultado = (numero1 > numero2) ? numero1 : numero2;
        System.out.println(resultado);

    }
}