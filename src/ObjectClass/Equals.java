package ObjectClass;

public class Equals {
    static void main(String[] args) {

        Student s = new Student();
        s.name = "krishna";
        s.age = 22;

//        System.out.println(s.toString());

        Student s2 = new Student();
        s2.name = "krishna";
        s2.age = 22;

        System.out.println(s.equals(s2));
    }
}


