package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Throws {
    static void main(String[] args) {

        try {
            readFile();
        }catch (FileNotFoundException e){
            System.err.println("File not found");
        }


    }

    private static void readFile() throws FileNotFoundException{
        FileReader fr = new FileReader("abc.txt");
    }
}
