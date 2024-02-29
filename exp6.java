import java.util.Scanner;

public class exp6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter age :");
        int age= scan.nextInt();
        
        
        if(age<18)
        {
             throw new ArithmeticException();

            // try {
            //     throw new invalidAgeException();
            // } catch (invalidAgeException e) {
            //     // TODO Auto-generated catch block
            //     e.printStackTrace();
            // }
        }
        else
        {
            System.out.println("Eligible for voting");
        }
        System.out.println("End of program");
        
    }
}
