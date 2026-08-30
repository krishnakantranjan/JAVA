package Multithreading.ExecuterFramework;

import java.util.concurrent.*;

public class Demo2 {
    static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(2);

        Future<Integer> f1 = executor.submit(() -> {
            try {
                Thread.sleep(3000);
            } catch (Exception e) {

            }
            return 10;
        });

        try {
            System.out.println(f1.get());
        }catch (Exception e) {

        }

        executor.shutdown();
    }
}
