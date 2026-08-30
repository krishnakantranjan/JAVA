package Multithreading.AlternateLocks;

import java.util.concurrent.locks.*;


public class ReaderWriterProblem {
    static void main(String[] args) {

        SharedResources sr  = new SharedResources();

        Thread r1 = new Thread(() -> sr.read());
        Thread r2 = new Thread(() -> sr.read());
        Thread r3 =  new Thread(() -> sr.read());

        Thread w1 = new Thread(() -> sr.write(8));
        Thread w2 = new Thread(() -> sr.write(9));
        Thread w3 =  new Thread(() -> sr.write(3));

        r1.start();
        r2.start();
        r3.start();

        w1.start();
        w2.start();
        w3.start();


    }
}

class SharedResources {

    private int value = 0;

    ReadWriteLock rwLock = new ReentrantReadWriteLock();

    Lock rl = rwLock.readLock();
    Lock wl = rwLock.writeLock();

    public int read() {
        rl.lock();
        try {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }
            System.out.println(Thread.currentThread().getName() + " read the value " + value);
            return value;
        } finally {
           rl.unlock();
        }

    }

    public void write(int newValue) {
        wl.lock();
        try {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }
            value = newValue;
            System.out.println(Thread.currentThread().getName() + " write the value " + value);
        } finally {
            wl.unlock();
        }
    }
}
