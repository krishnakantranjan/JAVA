package Multithreading;

public class Methods {
    static void main(String[] args) throws InterruptedException {
        /*
        // Thread.sleep(millisecond) -> TIME-WAITING
        System.out.println("Main thread starts");

        try {
            Thread.sleep(2000);
        }catch (InterruptedException e) {}

        System.out.println("Main thread ends");

        */

        /*
        // Join
        System.out.println("Main thread starts");

        Thread t1 = new Thread(() -> {
            try{
                Thread.sleep(2000);
            }catch (Exception e){}

            System.out.println("Thread-0 starts");
        });

        t1.start();

        t1.join(); // t1.join(2000) let the t1 thread first complete its execution, before join() code is non-deterministic

        System.out.println("Main thread ends");

        */


        /*
        // yield() --> it give cpu time to other thread which having same priority.
        // OS can reject this request

        */


        /*
        // interrupt() --> sends a signal to thread that it should stop doing what its doing.
        // it doesn't stop it just give signal to thread (default false)

        Thread t1 = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()){
                System.out.println("Running");
            }
        });

        t1.start();

        Thread.sleep(2000);
        t1.interrupt();

        */

        // isAlive() ->   false <-- start --> true <-- terminate --> false

        // currentThread() -> reference of current running thread



    }
}
