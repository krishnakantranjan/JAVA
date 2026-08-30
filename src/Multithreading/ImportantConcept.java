package Multithreading;

public class ImportantConcept {
    static void main(String[] args) {
        /*
        Thread t1 = new Thread(() -> System.out.println(Thread.currentThread().getName()));

        t1.start(); // it create a thread.
        t1.run(); // if we only execute run then it only print main thread because cpu didn't create t1 thread yet.

        */

        /*

        // it prints random because thread is non-deterministic
        Thread t1 = new Thread(() -> {
            for(int i = 0; i <= 100; i++){
                if(i % 2 == 0){
                    System.out.println(i);
                }
            }
        });


        Thread t2 = new Thread(() -> {
            for(int i = 0; i <= 100; i++){
                if(i % 2 != 0){
                    System.out.println(i);
                }
            }
        });

        t1.start();
        t2.start();

        */


    }


}
