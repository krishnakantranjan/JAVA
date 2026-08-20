package Lambdas;


import java.util.*;
import java.util.function.*;

public class FuntcionalInterface {
    static void main(String[] args) {
        Function<Integer, Integer> square = x -> x * x;

        System.out.println(square.apply(5));

        Consumer<Integer> print = x -> System.out.println(x);
        print.accept(5);

        Supplier<Integer> randomValue = () -> (int) (Math.random() * 10);
        System.out.println(randomValue.get());


        Predicate<Integer> isEven = x -> x % 2 == 0;

        System.out.println(isEven.test(5));


        List<Integer> list = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9));
        List<Integer> l2 = new ArrayList<>();
        l2.add(8);

        l2.add(9);

        l2.forEach(x -> System.out.print(x + " "));


    }
}
