package Streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class Source {
    static void main(String[] args) {

        String[] arr = {"krishna", "rohan", "aditya"};

        Stream<String> s = Arrays.stream(arr);
        s.forEach(x -> System.out.println(x));

        Stream<Integer> str = Stream.of(1,2,3,5);
        str = str.map(x -> x * 2);
        str.forEach(x -> System.out.println(x));

        Stream.iterate(1, x -> x + 1).limit(10).forEach(System.out::println);

    }
}
