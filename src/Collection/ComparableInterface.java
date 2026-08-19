package Collection;

import java.util.*;

public class ComparableInterface {
    static void main(String[] args) {

        List<Student> list = new ArrayList<>();

        list.add(new Student("Aditya", 98));
        list.add(new Student("Rohit", 95));
        list.add(new Student("Rohan", 96));


        Collections.sort(list); // ascending order

        for(Student s : list){
            System.out.println(s.name + ", " + s.marks);
        }
//        System.out.println(list);

        List<Integer> l2 = new ArrayList<>();

        l2.add(3);
        l2.add(5);
        l2.add(2);

        Collections.sort(l2);

        System.out.println(l2);


    }
}

class Student implements Comparable<Student> {
    String name;
    int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student o) {
        return this.marks - o.marks;
    }
}