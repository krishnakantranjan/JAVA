package Multithreading.ExecuterFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class VirtualThreads {
    static void main(String[] args) {

//        Thread t1 = new Thread(() -> {
//            System.out.println("Real Thread");
//        });

//        Thread t1 = Thread.startVirtualThread(() -> {
//            System.out.println(Thread.currentThread());
//        });
//
//        try {
//            t1.join();
//        }catch (Exception e) {
//
//        }

        ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor();

        for(int i =  1; i <= 5; i++){
            executor.submit(() -> {
                System.out.println("Task executed by " + Thread.currentThread());
            });
        }

        try {
            Thread.sleep(3000);
        }catch (Exception e){

        }
        executor.shutdown();
    }
}
