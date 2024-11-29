import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionConcept {


    public static void main(String[] args){


        try {
            int i=10;
            System.out.println("Java");
            System.out.println(i / 0);
        }catch (Exception ae)
        {
            ae.fillInStackTrace();
        }
        finally {
            System.out.println("At the last everything closes");
        }
    }
}
