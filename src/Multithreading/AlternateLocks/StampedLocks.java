package Multithreading.AlternateLocks;

import java.util.concurrent.locks.*;


public class StampedLocks {
    static void main(String[] args) {

        Sharedresources sr  = new Sharedresources();

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

class Sharedresources {

    private int value = 0;

    StampedLock lock = new StampedLock();



    public int read() {

        long stamp = lock.tryOptimisticRead();

        int currentValue = value;

        try{
            Thread.sleep(1000);
        }catch (Exception e){

        }

        if(lock.validate(stamp) == false){
            // value change
            // fall over logic, try pessimistic read
            stamp = lock.readLock();
            try{
                currentValue = value;
            }finally {
                lock.unlockRead(stamp);
            }
        }

        System.out.println(Thread.currentThread().getName() + " reads value as " + currentValue);
        return currentValue;

    }

    public void write(int newValue) {
        long stamp = lock.writeLock();
        try {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }
            value = newValue;
            System.out.println(Thread.currentThread().getName() + " write the value " + value);
        } finally {
            lock.unlock(stamp);
        }
    }
}
