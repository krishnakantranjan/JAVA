package ImmutableClass;

public class Basic {
    static void main(String[] args) {
        College college = new College("NITP", "Patna");
        Student s = new Student("krishna", 22, college);

        System.out.println(s.getCollege().cname);

        s.getCollege().cname = "IITP";

        System.out.println(s.getCollege().cname);
    }
}

final class Student{
    private final String name;
    private final int age;
    private final College college;

    Student(String name, int age, College college) {
        this.name = name;
        this.age = age;
        this.college = new College(college.cname, college.address); // defensive copy
    }

    String getName(){
       return this.name;
    }

    int getAge(){
        return this.age;
    }

    College getCollege(){ // defensive copy
        return new College(this.college.cname, this.college.address);
    }

}

class College {
    String cname;
    String address;

    College(String cname, String address){
        this.cname = cname;
        this.address = address;
    }


}
