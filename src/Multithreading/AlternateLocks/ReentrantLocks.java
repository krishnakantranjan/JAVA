package Multithreading.AlternateLocks;


import java.util.concurrent.locks.*;

public class ReentrantLocks {
    static void main(String[] args) {

        Resource r1 = new Resource();
        Thread t1 = new Thread(() -> r1.m1());

        Thread t2 = new Thread(() -> r1.m1());

        Thread t3 = new Thread(() -> r1.m1());

        t1.start();
        t2.start();t3.start();

    }
}

class Resource {

    Lock lock = new ReentrantLock();

    void m1(){
        lock.lock();

        System.out.println(Thread.currentThread().getName() + " Entered");

        try {
            Thread.sleep(2000);
        } catch (Exception e) {

        }

        System.out.println(Thread.currentThread().getName() + " Exited");
        lock.unlock();
    }
}
