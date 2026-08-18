package Collection;

import java.util.*;

public class QueueAndStack {
    static void main(String[] args) {


        Queue<Integer> queue = new ArrayDeque<>(); // Single Ended Queue

        queue.add(1); // exception(not safe)
        queue.offer(2); // false(safe)

//        System.out.println(queue.peek());
//
//
//        queue.remove();
//
//        System.out.println(queue.element());


        // Priority Queue

        PriorityQueue<Integer> minHeap = new PriorityQueue<>(); // Default (min heap)

        minHeap.add(10);
        minHeap.add(20);

        System.out.println(minHeap.peek());

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);

        maxHeap.add(30);
        maxHeap.add(50);

        System.out.println(maxHeap.peek());
    }
}
