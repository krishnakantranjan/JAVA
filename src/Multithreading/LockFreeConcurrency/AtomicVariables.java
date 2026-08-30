package Multithreading.LockFreeConcurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicVariables {
    static void main(String[] args) {

        Counter c1 = new Counter();

        // t1 and t2 --> concurrency and parallel
        Thread t1 = new Thread(() -> {
            for(int i = 1; i <= 10000;  i++){
                c1.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for(int i = 1; i <= 10000;  i++){
                c1.increment();
            }
        });

        t1.start();
        t2.start();

        try{
            Thread.sleep(2000);
        }catch (Exception e) {

        }
        System.out.println(c1.count);
    }

}

class Counter {
    //int count = 0;

    AtomicInteger count = new AtomicInteger(0);

    void increment(){
        count.incrementAndGet();
    }
}
