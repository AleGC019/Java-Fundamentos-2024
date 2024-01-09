package com.gm.mundopc;

public class Orden {
    private final int idOrden;

    private Computadora computadoras[];

    private int contadorComputadoras;

    private static int contadorDeOrdenes;

    private static final int MAX_COMPUTADORAS = 5;

    public Orden(){
        this.idOrden = ++Orden.contadorDeOrdenes;
        this.computadoras = new Computadora[Orden.MAX_COMPUTADORAS];
    }

    public void agregarComputadora(Computadora computadora){
        if(this.contadorComputadoras < Orden.MAX_COMPUTADORAS){
            computadoras[this.contadorComputadoras++] = computadora;
        }else{
            System.out.println("No es posible agregar mas computadoras");
        }
    }

    public void mostrarOrden(){
        System.out.println("Orden: " + this.idOrden);
        for(int i = 0; i < this.contadorComputadoras; ++i){
            System.out.println(computadoras[i].getIdComputadora());
            System.out.println(computadoras[i].getName());
            System.out.println(computadoras[i].getMonitor());
            System.out.println(computadoras[i].getRaton());
            System.out.println(computadoras[i].getTeclado());
            //Se puede poner unicamenete computadoras[i] para utizar el toString
            System.out.println();

        }

    }

}
