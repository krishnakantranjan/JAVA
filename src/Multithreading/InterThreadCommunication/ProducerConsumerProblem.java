//package Multithreading.InterThreadCommunication;
//
//public class ProducerConsumerProblem {
//    static void main(String[] args) {
//
//        Box box = new Box();
//
//        Thread t1 = new Thread(() -> {
//            for(int i = 1; i <= 20; i++){
//                try {
//                    Thread.sleep(100);
//                }catch (Exception e){}
//                box.producer(i);
//            }
//        });
//
//        Thread t2 = new Thread(() -> {
//            for(int i = 1; i <= 20; i++) {
//                try {
//                    Thread.sleep(70);
//                } catch (Exception e) {
//                }
//                box.consumer();
//            }
//        });
//
//        t1.start();
//        t2.start();
//    }
//}
//
//class Box {
//    volatile Integer item; // resolved null value consumption
//    volatile Boolean flag = false;
//
//    // synchronized resolved race condition but if consumer enter then it create deadlock condition.
//    synchronized void producer(int value){
//        while(flag == true) {
//            // do nothing
//        }
//        item = value;
//        flag = true;
//        System.out.println("Producer produces " + item);
//    }
//
//    synchronized void consumer() {
//        while (flag == false){
//            // do nothing
//        }
//        System.out.println("Consumer consumes " + item);
//        item = null;
//        flag = false;
//    }
//}

package Multithreading.InterThreadCommunication;

public class ProducerConsumerProblem {
    static void main(String[] args) {

        Box box = new Box();

        Thread t1 = new Thread(() -> {
            for(int i = 1; i <= 20; i++){
                try {
                    Thread.sleep(100);
                    box.producer(i);
                }catch (Exception e){}

            }
        });

        Thread t2 = new Thread(() -> {
            for(int i = 1; i <= 20; i++) {
                try {
                    Thread.sleep(100);
                    box.consumer();
                } catch (Exception e) {
                }

            }
        });

        t1.start();
        t2.start();
    }
}

class Box {
    volatile Integer item;
    volatile Boolean flag = false;

    synchronized void producer(int value) throws InterruptedException {
        while(flag == true) {
            wait();
        }
        item = value;
        flag = true;
        System.out.println("Producer produces " + item);
//        notify(); // cause deadlock
        notifyAll(); // for multi thread of same type
    }

    synchronized void consumer() throws InterruptedException {
        while (flag == false){
            wait();
        }
        System.out.println("Consumer consumes " + item);
        item = null;
        flag = false;
//        notify();
        notifyAll();
    }
}