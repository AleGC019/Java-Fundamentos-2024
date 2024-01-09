package com.gm.mundopc;

public class Computadora {

    private final int idComputadora;

    private static int contadorComputadoras;

    private String name;

    private Monitor monitor;

    private Teclado teclado;

    private Raton raton;

    private Computadora(){
        this.idComputadora = ++Computadora.contadorComputadoras;
    }

    public int getIdComputadora() {
        return idComputadora;
    }

    public static int getContadorComputadoras() {
        return contadorComputadoras;
    }

    public static void setContadorComputadoras(int contadorComputadoras) {
        Computadora.contadorComputadoras = contadorComputadoras;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Raton getRaton() {
        return raton;
    }

    public void setRaton(Raton raton) {
        this.raton = raton;
    }

    public Computadora(String name, Monitor monitor, Teclado teclado, Raton raton){
        this();
        this.name = name;
        this.teclado = teclado;
        this.monitor = monitor;
        this.raton = raton;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Computadora{");
        sb.append("idComputadora=").append(idComputadora);
        sb.append(", name='").append(name).append('\'');
        sb.append(", monitor=").append(monitor);
        sb.append(", teclado=").append(teclado);
        sb.append(", raton=").append(raton);
        sb.append('}');
        return sb.toString();
    }
}
