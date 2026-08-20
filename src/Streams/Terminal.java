package Streams;

import java.util.*;
import java.util.stream.Stream;

public class Terminal {
    static void main(String[] args) {
        /*
            Collecting Result -> tolist(), collect()
            Reducing -> reduce(), sum(), max(), min(), average(), count()
            Searching/Matching -> findfirst(), findany(), anymatch(), allmatch(), nonematch()
            Iterations -> forEach(), forEachOrdered()
        */


        List<Integer> list = new ArrayList<>(List.of(1,12,11,9));


//        List<Integer> list2 = list.stream()
//                .map(x -> x + 1)
//                .toList();
////                .forEachOrdered(System.out::println);
//
//        System.out.println(list2);

        int fact = Stream.iterate(1, x -> x + 1)
                .limit(4)
                .reduce(1, (a, b) -> a * b);

        System.out.println(fact);


    }
}
