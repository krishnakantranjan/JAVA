package Multithreading.LockFreeConcurrency;

import java.util.concurrent.atomic.AtomicReference;

public class Demo {
    static void main(String[] args) {

        SeatBooking sb = new SeatBooking();



        Thread t1 = new Thread(() -> {
           boolean value = sb.bookSeat("Aditya");
            System.out.println("T1 say " + value);
        });
        Thread t2 = new Thread(() -> {
            boolean value = sb.bookSeat("Krishna");
            System.out.println("T2 says " + value);
        });

        t1.start();
        t2.start();

        try{
            Thread.sleep(2000);
        }catch (Exception e) {

        }


    }
}

class SeatBooking {
//    String seat = new String("EMPTY");

    AtomicReference<String> seat = new AtomicReference<>("EMPTY");

    boolean bookSeat(String name){
        String currentValue = seat.get();

        if(!currentValue.equals("EMPTY")){
            // already seat assigned
            return false;
        }

        return seat.compareAndSet("EMPTY", name);
    }
}
