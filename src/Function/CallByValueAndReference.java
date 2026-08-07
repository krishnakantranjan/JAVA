package Function;


/*
There is no concept of call by reference in JAVA, We can feel in non-primitive.
*/
public class CallByValueAndReference {
    static void main(String[] args) {
//        int x = 4;
//        int y = 5;
//
//        System.out.println(x + " " + y);
//
//        callByValue(x, y);
//
//        System.out.println(x + " " + y);
//
//        Random r1 = new Random(4, 5);
//
//        System.out.println(r1.a + " " + r1.b);
//
//        callByRefernce(r1);

//        System.out.println(r1.a + " " + r1.b); // 14 15 -> Object variable store address not the value so both r1 and r point the same address.


//        int arr[] = {1,2,3,4};
//
//        System.out.println(arr[0]);
//        fun(arr);
//        System.out.println(arr[0]);

        Random r1 = new Random(4,5);
        Random r2 = new Random(r1); // Deep copy
        Random r3 = r1; // Sallow copy

        /*
        r1 and r2 point different address because of new keyword.
        but r1 and r3 point same address.
        */

    }

    static void fun(int arr[]){ // By default, non-primitive is pass by reference
        arr[0] = 10;
    }

    static void callByValue(int x, int y){
        x += 10;
        y += 10;
    }

    static void callByRefernce(Random r){
        r.a += 10;
        r.b += 10;
    }


}

class Random {
    int a, b;
    Random (int a, int b) {
        this.a = a;
        this.b = b;
    }

    Random(Random r){
        this.a = r.a;
        this.b = r.b;
    }
}
