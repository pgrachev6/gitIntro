import java.io.FileInputStream;
import  java.io.IOException;

public class MyByteReader {

    public static void main(String[]args) {

        //this is the test comments
        try(FileInputStream myFile = new FileInputStream("abc.dat")){
            int byteValue;

            while ((byteValue = myFile.read()) !=-1){

                System.out.println(byteValue + "");
            }
        }catch (IOException ioe) {
            System.out.println("Could not read file: " + ioe.getMessage());
        }
    }
}