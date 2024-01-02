import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.printf("Proporciona el nombre: ");
        String nombre = consola.nextLine();

        System.out.printf("Proporciona el id: ");
        int id = Integer.parseInt(consola.nextLine());
        System.out.printf("Proporciona el precio: ");
        Double precio = Double.parseDouble(consola.nextLine());
        System.out.printf("Proporciona el envio gratuito: ");
        Boolean envioGratuito = Boolean.parseBoolean(consola.nextLine());
        System.out.println(nombre + " #" + id );
        System.out.println("Precio: $" + precio);
        System.out.println("Envio Gratuito: " + envioGratuito);

        consola.close();

    }
}