import clases.Caja;

public class Main {
    public static void main(String[] args) {
        Caja cajita = new Caja(2, 3,6);
        var res = cajita.Volumen();
        System.out.println("Volumen de la cajita: " + res);
    }
}