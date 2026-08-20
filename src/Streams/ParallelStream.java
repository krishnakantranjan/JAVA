package Streams;

import java.util.*;

public class ParallelStream {
    static void main(String[] args) {

        List<Integer> list = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9));


        // Sequential Stream
//        list.stream()
//                .map(x -> x * 2) // stateless
//                .sorted() // stateful
//                .forEach(System.out::println);

        // Parallel Stream
        list.parallelStream()
                .map(x -> x * 2)
                .forEach(System.out::println);
    }
}
