package Generics;

public class OnlyNumber {
    static void main(String[] args) {

        Box2<Number> b1 = new Box2<>();
        b1.value = 5;
        b1.printDouble();
    }
}

class Box2<T extends Number> {

    T value;

    public void printDouble(){
        System.out.println(value.doubleValue());
    }

}
