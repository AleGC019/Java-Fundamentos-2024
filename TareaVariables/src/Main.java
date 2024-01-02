import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.printf("Proporciona el titulo: ");
        var title = console.nextLine();

        System.out.printf("Proporciona el autor: ");
        var author = console.nextLine();

        System.out.printf(title + " fue escrito por " + author);
    }

}