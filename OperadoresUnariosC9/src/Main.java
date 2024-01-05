public class Main {
    public static void main(String[] args) {
        var a = 3;
        var b = -a;
        System.out.println(a);
        System.out.println(b);

        var c = true;
        var d = !c;
        System.out.println(c);
        System.out.println(d);

        //INCREMENTO
        //1. Preincremento
        var e = 3;
        var f = ++e;
        System.out.println(e);
        System.out.println(f);
        System.out.println();
        //2.Postincremento
        var x = 3;
        var y = x++;
        System.out.println(x);//Tendra 4, tenia pendiente el incremento
        System.out.println(y);//Tendra 3, guarda el valor anterior

        System.out.println();

        //DECREMENTO
        //1.Predecremento
        var m = 3;
        var n = --m;
        System.out.println(m);
        System.out.println(n);
        System.out.println();
        //2.Postdecremento
        var p = 3;
        var q = p--;
        System.out.println(p);
        System.out.println(q);
        System.out.println();


    }
}