public class Main {
    public static void main(String[] args) {
        //Valores bandera
        Boolean variableBool = true;
        System.out.println(variableBool);
        Boolean variableBool2 = false;
        System.out.println(variableBool2);

        if(variableBool){
            System.out.println("Si es verdadera");
        }else{
            System.out.println("Si es falsa");
        }

        var edad = 10;
        //Guarda directamente el resultado true or false
        var esAdulto = edad >= 18;

        if(esAdulto){
            System.out.println("Es mayor de edad");
        }else{
            System.out.println("Es menor de edad");
        }
    }
}