public class Main {
    public static void main(String[] args) {

        //FLOAT 32bits
        float numeroFloat = 10.50F; //O (float)10.0
        System.out.println(numeroFloat);
        System.out.println("Valor maximo flotante: " + Float.MAX_VALUE);
        System.out.println("Valor minimo flotante: " + Float.MIN_VALUE);

        System.out.println();
        //DOUBLE 64bits
        Double numeroDouble = 10.502342353465345234234; //O (double)10.0
        System.out.println(numeroDouble);
        System.out.println("Valor maximo Double: " + Double.MAX_VALUE);
        System.out.println("Valor minimo Double: " + Double.MIN_VALUE);

        //Inferencia de variables primitivas
        var numeroEntero = 10;
        System.out.println(numeroEntero);

        var numeroDoubleVar = 10.0045;
        System.out.println(numeroDoubleVar);

        var numeroFloatVar = 10.54F;
        System.out.println(numeroFloatVar);


    }
}