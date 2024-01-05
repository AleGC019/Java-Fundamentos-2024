import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.printf("Proporciona el alto: ");
        var alto = Integer.parseInt(consola.nextLine());
        System.out.printf("Proporciona el alto: ");
        var ancho = Integer.parseInt(consola.nextLine());
        System.out.println("Area: " + (alto*ancho));
        System.out.println("Perimetro: " + ((alto+ancho)*2));
    }
}