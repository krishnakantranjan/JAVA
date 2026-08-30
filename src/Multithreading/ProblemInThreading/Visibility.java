package Multithreading.ProblemInThreading;

public class Visibility {

    static volatile boolean flag = false; // volatile ensure that every thread read from ram not from cache
    static void main(String[] args) {

        Thread t1= new Thread(() -> {
            try {
                Thread.sleep(1000);
            }catch (Exception e){

            }
            flag = true;
        });

        Thread t2 = new Thread(() ->{
            while(!flag){

            }
            System.out.println("Thread 2 finished");
        });

        t1.start();
        t2.start();
    }
}
