package ExceptionHandling;

public class Basic {
    static void main(String[] args) {

        System.out.println("Step 1");
        try {
            int a = 5;
            int b = 0;
            System.out.println(a / b);

        } catch (ArithmeticException e){
            System.out.println("Division by 0");
        }

        System.out.println("Step 2");

//        System.out.println(a / b);

//        methodA(a, b);


    }
//
//    public static void methodA(int a, int b){
//        methodB(a, b);
//    }
//
//    public static void methodB(int a, int b){
//        System.out.println(a / b);
//    }
}
