package clases;

public class Aritmetica {
    //Atributos
    private int a;
    private int b;

    //Constructor
    public Aritmetica(){

    }
    public Aritmetica(int a){
        this.a = a;
    }
    public Aritmetica(int a, int b){
        this.a = a;
        this.b = b;
    }


    //Metodo


    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void sumar(){
        System.out.println("Valor de la suma: " + (a+b));
    }

    public void resta(){
        System.out.println("Valor de la resta: " + (a-b));
    }

    public int multi(){
        return a * b;
    }

    public void sumaModificada(int c, int d){
        a = c;
        b = d;
        sumar();
    }

}
