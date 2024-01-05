package pasoporreferencia;

import clases.Persona;

public class PasoPorReferencia {
    public static void main(String[] args){
        Persona persona1 = new Persona();
        persona1.setNombre("Juan");
        System.out.println(persona1.getNombre());
        cambioValorDeObjeto(persona1);
        System.out.println(persona1.getNombre());
    }

    public static void cambioValorDeObjeto(Persona persona){
        persona.setNombre("Carlos");
    }
}
