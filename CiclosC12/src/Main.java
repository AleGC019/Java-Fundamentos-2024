public class Main {
    public static void main(String[] args) {
        //Ciclo while
        var contador = 0;
        while(contador <= 3){
            System.out.println("Valor: " + contador);
            contador++;
        }

        System.out.println();

        //Ciclo FOR
        for (int i = 0; i <= 10; ++i){
            System.out.println("Valor: " + i);
        }

        System.out.println();

        //Ciclo DoWhile
        var cont = 0;
        do {
            System.out.println("Valor de cont: " + cont);
            cont++;
        }while(cont <= 10);

        System.out.println();

        //Break and Continue
        for (int i = 0; i <= 10; ++i){
            if(i % 2 == 0)
                System.out.println("Valor: " + i);
            break;
        }

        System.out.println();

        for (int i = 0; i <= 10; ++i){
            if(i % 2 != 0) {
                continue;
            }
            System.out.println("Valor: " + i);
        }
    }
}