package Multithreading;

public class Creation {
    static void main(String[] args) {
//        MyThread t1 = new MyThread();
//        t1.start();

//        MyRunnable r1 = new MyRunnable();
//        Thread t1 = new Thread(r1);

        // Runnable interface is functional interface
//         Thread t1 = new Thread(() ->System.out.println("Thread is running"));

//         t1.start();


//        System.out.println(Thread.currentThread().getName());
//        System.out.println(Thread.currentThread().getId());


        Thread t1 = new Thread(() -> {
            System.out.println("My thread is " + Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getId());
        });

        t1.start();

    }
}

/*
t1.start() -> JVM asks OS a create a new thread --> Thread gets stack/pc space
Thread execute run()
*/


//class MyThread extends Thread {
//
//    @Override
//    public void run() {
//        System.out.println("Thread is running");
//    }
//}

class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread is running");
    }
}
