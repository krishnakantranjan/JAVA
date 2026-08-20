package ExceptionHandling;

public class ExceptionMathodChain {
    static void main(String[] args) {

        System.out.println("Step 1");

        methodA(5, 0);


    }

    public static void methodA(int a, int b){
        methodB(a, b);
    }

    public static void methodB(int a, int b){

        try {
            System.out.println(a / b);
        }catch (ArithmeticException e){
            System.out.println("Divide by 0 not allowed");
        } finally {
            System.out.println("This run always");

            // Used for clean up code (Optional)
        }

        System.out.println("Step 2"); // will not print
    }
}
