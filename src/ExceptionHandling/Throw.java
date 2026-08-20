package ExceptionHandling;

public class Throw {


    public static void main(String[] args) {
        try{
            checkEligibility(0);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }

    private static void checkEligibility(int age){
        if(age <= 0) {
            // System.err.println("Age cannot be negative");
            throw new IllegalArgumentException("Age cannot be negative");
        }

        if(age >= 18){
            System.out.println("You are eligible for vote");
        }
    }


}
