package clases;

public class Caja {

    private int alto;
    private int ancho;
    private int profundo;

    public Caja(){

    }

    public Caja(int alto, int ancho, int profundo){
        this.alto = alto;
        this.ancho = ancho;
        this.profundo = profundo;
    }

    public int Volumen(){
        return alto*ancho*profundo;
    }


}
