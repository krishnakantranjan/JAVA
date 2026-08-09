package Enumeration;

public class Basic {
    static void main(String[] args) {

        int status = PaymentStatus.SUCCESS;

        System.out.println(status);

        int status2 = 100; //  type safety

        if(status2 == 2) { //  what 2 mean here -> poor readability
            // do something
        }

        if(status == Role.ADMIN){ // No grouping of related entities
            // do something
        }
    }
}

// Payment status --> success, pending, failed

class PaymentStatus {
    public static final int SUCCESS = 1;
    public static final int FAILED = 0;
    public static final int PENDING = -1;
}

class Role {
    public static final int ADMIN = 1;
}
