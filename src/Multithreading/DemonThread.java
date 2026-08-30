package Multithreading;

public class DemonThread {
    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            while (true){
                System.out.println("Running...");
            }
        });

        t1.setDaemon(true); // if it true then it get terminated with main thread (Ex - Garbage collection)
        t1.start();

        return;
    }
}
