package com.gm.mundopc.test;

import com.gm.mundopc.*;

public class MundoPC {
    public static void main(String[] args){
        Monitor firstMonitor = new Monitor("Asus 4k", 24.5);
        Teclado firstTeclado = new Teclado("Alambrico", "Razer Blackwidow");
        Raton firstRaton = new Raton("Bluetooth", "Razer Viper Mini");
        Computadora firstComputadora = new Computadora("Computadora i3", firstMonitor, firstTeclado, firstRaton);

        Monitor secMonitor = new Monitor("HP 4k", 27.5);
        Teclado secTeclado = new Teclado("Alambrico", "MSI");
        Raton secRaton = new Raton("Bluetooth", "Apple");
        Computadora secComputadora = new Computadora("Computadora i9", secMonitor, secTeclado, secRaton);


        Orden firstOrder = new Orden();
        firstOrder.agregarComputadora(firstComputadora);
        firstOrder.agregarComputadora(secComputadora);

        firstOrder.mostrarOrden();



    }
}
