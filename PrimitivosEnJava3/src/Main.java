public class Main{
    public static void main(String[] args){
        //BYTE 8bits
        byte numeroBye = (byte)100;// Elementos desde -127 a 128
        System.out.println(numeroBye);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);

        System.out.println();

        //SHORT 16bits
        Short numeroShort = (short)120;
        System.out.println(numeroShort);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);

        System.out.println();


        //INT 32bits
        int numeroInt = (int)120L; //Tipo superior de int, en este caso long
        System.out.println(numeroInt);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println();

        //LONG 64bits
        long numeroLong = 120;
        System.out.println(numeroLong);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);

        System.out.println();

    }
}