package Generics;

public class PairDemo {
    static void main(String[] args) {

        Pair<Integer, String> p = new Pair<>(1, "JAVA");

        System.out.println(p.first + " " + p.second);
    }
}

class Pair<T, U> {
    T first;
    U second;

    public Pair(T first, U second){
        this.first = first;
        this.second = second;
    }
}
