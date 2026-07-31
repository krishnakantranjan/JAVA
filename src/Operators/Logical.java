package Operators;

public class Logical {
    static void main(String[] args) {

        int a = 10;
        int b = 13;
        int c = 45;

//        boolean d = (a < b) & (a < c);
        boolean d = (a < b) && (a < c);
        System.out.println(d);
    }
}
