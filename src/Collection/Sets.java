package Collection;

import java.util.*;

public class Sets {
    static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(15);

        System.out.println(set.contains(20)); // true;
        set.remove(15);

        System.out.println(set.contains(15));


        // Constructor

        Set<Integer> set1 = new HashSet<>();

        Set<Integer> set2 = new HashSet<>(100);

        Set<Integer> set3 = new HashSet<>(100, 0.8f);

        Set<Integer> set4 = new HashSet<>(List.of(1,2,3,4,5,6,7,8,9));




    }
}
