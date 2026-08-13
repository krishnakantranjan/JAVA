package Generics;

public class Basic {
    static void main(String[] args) {

        Box<Integer> b1 = new Box<Integer>(10); // Type argument
        Box<Integer> b2 = new Box<>(6);
        System.out.println(b1.getValue() + b2.getValue());


        Box<String> s = new Box<>("JAVA");
        System.out.println(s.getValue());

        Box<Boolean> b = new Box<>(true);
        System.out.println(b.getValue());
    }
}

class Box<T> { // Type parameter
    private T value;


    Box(T value){
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }




}
