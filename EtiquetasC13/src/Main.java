public class Main {
    public static void main(String[] args) {
        //Break and Continue

        for (int i = 0; i <= 10; ++i){
            if(i % 2 == 0)
                System.out.println("Valor: " + i);
            break;
        }

        System.out.println();

        inicio:
        for (int i = 0; i <= 10; ++i){
            if(i % 2 != 0) {
                continue inicio; //Directamente se dirige a un tipo de linea especifica
            }
            System.out.println("Valor: " + i);
        }
    }
}