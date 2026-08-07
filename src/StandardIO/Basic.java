package StandardIO;
import java.io.IOException;
public class Basic {
    static void main(String[] args) throws IOException {

//        int x = System.in.read();
//        System.out.println(x); // give ASCII value -> 65
//        System.out.println((char)x); // we can convert -> A

        String s = "";
        int n = 6;
        while(n != 0){
            int x = System.in.read();
            s += (char)x;
            n--;
        }
        System.out.println(s);
    }
}
