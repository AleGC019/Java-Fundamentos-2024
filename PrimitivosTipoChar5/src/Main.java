public class Main {
    public static void main(String[] args) {
        char miCaracter = 'A';
        System.out.println(miCaracter);

        //Se pueden utilizar los caracteres Unicode
        char miUniCode = '\u0021';
        System.out.println(miUniCode);

        //Valor con decimal
        char miDecimal = 33;
        System.out.println(miDecimal);

        //Directamente el simbolo
        char miSimbolo = '!';
        System.out.println(miSimbolo);

        System.out.println("\n");

        //USO DE VAR PARA LOS CASOS ANTERIORES

        var miCaracter2 = 'A';
        System.out.println(miCaracter2);

        //Se pueden utilizar los caracteres Unicode
        var miUniCode2 = '\u0021';
        System.out.println(miUniCode2);

        //Valor con decimal
        var miDecimal2 = 33;
        System.out.println(miDecimal2);

        //Directamente el simbolo
        var miSimbolo2 = '!';
        System.out.println(miSimbolo2);

        //UN CHAR PUEDE CONVERTIRSE A ENTERA
        int variableEnteraSimbolo = '!';
        //Se convierte a su valor decimal
        System.out.println(variableEnteraSimbolo);

        //Con letras minuscula y mayuscula
        int variableEnteraLetra = 'a';
        //Se convierte a su valor decimal
        System.out.println(variableEnteraLetra);

        int variableEnteraLetraMayus= 'A';
        //Se convierte a su valor decimal
        System.out.println(variableEnteraLetraMayus);

    }
}