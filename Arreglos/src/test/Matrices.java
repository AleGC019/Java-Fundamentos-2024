package test;

import clases.Persona;

public class Matrices {
    public static void main(String[] args){
        int edades[][] = new int[3][2];
        //Fila columna

        edades[0][0] = 5;
        edades[0][1] = 6;
        edades[1][0] = 2;
        edades[1][1] = 4;
        edades[2][0] = 9;
        edades[2][1] = 1;

        for(int i = 0; i < edades.length; ++i){
            for(int j = 0; j < edades[i].length; ++j){
                System.out.printf(Integer.toString(edades[i][j]) + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        String frutas[][] = {{"Naranaja", "Limon"},
                            {"Pera", "Manzana"},
                            {"Mango", ""}};

        for(int i = 0; i < frutas.length; ++i){
            for(int j = 0; j < frutas[i].length; ++j){
                System.out.printf(frutas[i][j] + "   ");
            }
            System.out.println();
        }


        System.out.println();
        System.out.println();

        Persona personas[][] = new Persona[2][3];

        //De esta forma se crean nuevos elementos
        personas[0][0] = new Persona("Alejandro");
        personas[0][1] = new Persona("Rene");
        personas[0][2] = new Persona("Victor");
        personas[1][0] = new Persona("Fernando");
        personas[1][1] = new Persona("Carlos");
        personas[1][2] = new Persona("Felipe");

        /*
        for(int i = 0; i < personas.length; ++i){
            for(int j = 0; j < personas[i].length; ++j){
                System.out.printf(personas[i][j].getName() + "  ");
            }
            System.out.println();
        }
        */
        impimir(personas);
    }

    public static void impimir(Object matriz[][]){
        for(int i = 0; i < matriz.length; ++i){
            for(int j = 0; j < matriz[i].length; ++j){
                System.out.printf(matriz[i][j] + "  ");
            }
            System.out.println();
        }
    }

}
