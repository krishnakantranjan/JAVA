package Streams;

import java.util.*;
import java.util.stream.Stream;

public class Intermediate {
    static void main(String[] args) {

        List<Integer> list  = new ArrayList<>(List.of(1, 4, 11, 13, 34));

        /*
            filter -> check some condition
            map -> transform the data
            flatmap -> flt the collection
            peek ->  use for debugging
        */
        list.stream()
                .filter(x -> x > 10)
                .map(x -> x * 2)
                .peek(System.out::println)
                .sorted()
//                .sorted((a,b)-> b - a)
                .forEach(x -> System.out.println(x));


        List<List<Integer>> list2 = List.of(
                List.of(1, 2),
                List.of(3,4)
        );

//        list2.stream()
//                .flatMap(x -> x.stream())
//                .map(x -> x * 2)
//                .forEach(x -> System.out.println(x));


//        Stream.iterate(1, x -> x + 1)
//                .limit(100)
//                .skip(5) // skip 1 to 5
//                .forEach(System.out::println);

    }
}
