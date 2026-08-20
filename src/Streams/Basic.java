package Streams;

import java.util.*;
import java.util.stream.*;

public class Basic {
    static void main(String[] args) {

        List<Integer> list = new ArrayList<>(List.of(1, 2, 5, 12, 14, 8, 23, 5));

//        Stream<Integer> s = list.stream();

//        s= s.filter(x -> x > 10);
//        s = s.map(x -> x * 2);
//        s.forEach(x -> System.out.print(x + " "));

        list.stream()
                .filter(x -> x > 10)
                .map(x -> x * 2)
                .forEach(x -> System.out.print(x + " "));


    }
}
