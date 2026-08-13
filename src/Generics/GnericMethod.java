package Generics;

public class GnericMethod {
    static void main(String[] args) {

        Integer y = function(10);
        System.out.println(y);

        function2(10, 11);

    }

    public static <T> T function(T x){
        return x;
    }

    public static <T, U> void function2(T a, U b){
        System.out.println(a + " " + b);
    }
}
