package Multithreading.ExecuterFramework;

import java.util.concurrent.CompletableFuture;

public class AdvantageFutureClass {
    static void main(String[] args) {

//        CompletableFuture<Integer> f1 =
//                CompletableFuture.supplyAsync(() -> 10)
//                        .thenApply(result -> result * 2);

//        CompletableFuture<Void> f1 = CompletableFuture.supplyAsync(() -> 10)
//                .thenAccept(result -> System.out.println(result));

//        CompletableFuture<Void> f1 = CompletableFuture.supplyAsync(() -> 10).thenRun(() -> System.out.println("Done"));


                CompletableFuture<Integer> f1 =
                CompletableFuture.supplyAsync(() -> 10);

        CompletableFuture<Integer> f2 =
                CompletableFuture.supplyAsync(() -> 30);


        CompletableFuture<Void> result = f1.thenCombine(f2, (a, b) -> a + b)
                .thenAccept(result2 -> System.out.println(result2));



//        try{
//            System.out.println(f1.get());
//        }catch (Exception e){
//
//        }

    }
}
