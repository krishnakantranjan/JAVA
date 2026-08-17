package Collection;

import java.util.*;

public class Demo {
    static void main(String[] args) {

        List<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        Iterator<Integer> it = list.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }



    }
}
