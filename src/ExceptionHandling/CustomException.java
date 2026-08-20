package ExceptionHandling;

public class CustomException {
    static void main(String[] args) {
        try{
            checkEligibility(0);
        }catch (InvalidAgeException e){
            System.err.println(e.getMessage());
            System.err.println("Enter age is " + e.getAge());
        }

    }

    private static void checkEligibility(int age) throws InvalidAgeException {
        if(age <= 0) {
            // System.err.println("Age cannot be negative");
            throw new InvalidAgeException("Age cannot be negative", age);
        }

        if(age >= 18){
            System.out.println("You are eligible for vote");
        }
    }
}

class InvalidAgeException extends Exception{

    private int age;
    public InvalidAgeException(String message, int age){
        super(message);
        this.age = age;
    }

    int getAge( ){
        return age;
    }
}
