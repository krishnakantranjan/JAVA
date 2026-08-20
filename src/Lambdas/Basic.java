package Lambdas;

import java.util.*;

public class Basic {
    static void main(String[] args) {

        List<Student> list = new ArrayList<>();

        list.add(new Student("Krishna", 101, 98));
        list.add(new Student("Rohan", 103, 90));
        list.add(new Student("Aditya", 151, 95));
        list.add(new Student("Rohit", 131, 96));


//        Comparator<Student> c1 = new sortByName();
//        Comparator<Student> c2 = new sortByRollNo();

        // We can't pass logic here,
        // Instead make class and implement method then pass.
        // This is lengthy code.
        // Collections.sort(list, c1);

        // Anonymous class
        /*
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.marks - o2.marks;
            }
        });
        */


        Collections.sort(list, (s1, s2) -> s1.marks - s2.marks);


        for(Student s : list){
            System.out.println(s.name + ", " + s.rollNo + "," + s.marks);
        }
    }
}

class sortByName implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.name.compareTo(o2.name);
    }
}

class sortByRollNo implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.rollNo - o2.rollNo;
    }
}

class Student {
    String name;
    int rollNo;
    int marks;

    public Student(String name, int rollNo, int marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }
}
