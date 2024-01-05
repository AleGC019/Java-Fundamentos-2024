import clases.Cliente;
import clases.Empleado;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Alejandro", 'M', 21, "Residencial Ciudad Corinto", 2000);
        System.out.println(empleado1);
        System.out.println();
        Cliente cliente1 = new Cliente("Carlos", 'M', 18, "Paseo El Prado", new Date(), true);
        System.out.println(cliente1);
    }
}