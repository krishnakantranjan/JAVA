package Multithreading;

public class LifeCycle {
    static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            System.out.println("My thread is " + Thread.currentThread().getName());
        });

        System.out.println(t1.getState()); // NEW

        t1.start();
        System.out.println(t1.getState()); // RUNNABLE

        System.out.println(t1.getState());


    }
}
