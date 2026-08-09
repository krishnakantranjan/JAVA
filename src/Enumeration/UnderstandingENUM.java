package Enumeration;

import java.security.PrivateKey;

public class UnderstandingENUM {
    static void main(String[] args) {

    }
}

enum Direction {
    NORTH(0),
    EAST(90),
    SOUTH(180),
    WEST(270);

    private int degree;

    Direction(int degree){
        this.degree = degree;
    }

    public int getDegree(){
        return this.degree;
    }
}

//These code is compile by jvm
/*
class Direction extends Enum<Direction> {

    public static final Direction NORTH = new Direction();
    public static final Direction EAST = new Direction();
    public static final Direction SOUTH = new Direction();
    public static final Direction WEST = new Direction();

    private int degree;

    private Direction(int degree){
        this.degree = degree;
    }

    public int getDegree(){
        return this.degree;
    }

}
*/


