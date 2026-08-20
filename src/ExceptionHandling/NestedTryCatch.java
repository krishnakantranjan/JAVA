package ExceptionHandling;

import javax.lang.model.type.ArrayType;

public class NestedTryCatch {
    static void main(String[] args) {
        // Inner try handle exception
//        try{
//            System.out.println("Outer try start");
//            try {
//                System.out.println("Inner try start");
//
//                System.out.println(5 / 0);
//
//                System.out.println("Inner try end");
//
//            } catch (ArithmeticException e){
//
//                System.out.println("Divide by zero is not allow : Inner");
//            }
//            System.out.println("Outer try end");
//
//        } catch (ArithmeticException e){
//
//            System.out.println("Divide by zero is not allow : Inner");
//
//        }


        // Outer try handle exception
        try{
            System.out.println("Outer try start");
            try {
                System.out.println("Inner try start");

                System.out.println(5 / 0);

                System.out.println("Inner try end");

            } catch (NullPointerException e){

                System.out.println("Null is not allowed : Inner");
            }
            System.out.println("Outer try end");

        } catch (ArithmeticException e){

            System.out.println("Divide by zero is not allow : Outer");

        }
    }
}
