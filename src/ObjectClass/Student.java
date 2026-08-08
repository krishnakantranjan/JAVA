package ObjectClass;


class Student {
    String name;
    int age;

    @Override
    public String toString(){
        return name + "," + age;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;

        if(obj == null) return false;

        if(obj.getClass() != this.getClass()) return false;

        ObjectClass.Student s = (ObjectClass.Student) obj;

        return (this.name == s.name && this.age == s.age);
    }
}

