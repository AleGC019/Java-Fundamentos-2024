package com.gm.mundopc;

public class Teclado extends DispositivoEntrada{

    private int idTeclado;

    private static int contadorTeclados;

    public Teclado(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idTeclado = ++Teclado.contadorTeclados;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Teclado{");
        sb.append("idTeclado=").append(idTeclado);
        sb.append(" marca=").append(this.getMarca());
        sb.append(" tipo de Entrada=").append(this.getTipoEntrada());
        //Puede utilizarse super.toString()
        sb.append('}');
        return sb.toString();
    }
}
