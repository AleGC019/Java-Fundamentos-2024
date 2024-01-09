package com.gm.mundopc;

public class Raton extends DispositivoEntrada{
    private final int idRaton;

    private static int contadorRatones;


    public Raton(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idRaton = ++Raton.contadorRatones;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Raton{");
        sb.append("idRaton=").append(idRaton);
        sb.append(" marca=").append(this.getMarca());
        sb.append(" tipo de Entrada=").append(this.getTipoEntrada());
        //Puede utilizarse super.toString()
        sb.append('}');
        return sb.toString();
    }
}
