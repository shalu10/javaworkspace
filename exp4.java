import java.io.*;

public class exp4 {
    public static void main(String[] args) {
        
        // File file = new File("abc.txt");
        // FileInputStream fs = new FileInputStream(file);
        int age = 21;
        // try{
            if(age<18)
            {
                throw new invalidAgeException();
            }
        // }catch(invalidAgeException e)
        {
            System.out.println("Invalid Age");
        // }

        System.out.println("end of program");
        
    }
}