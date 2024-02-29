import java.util.Scanner;

class exceptionDemo {

    void divideNumber(int a, int b) throws ArithmeticException,NullPointerException
    {
        int c =a/b;
        System.out.println("C value is :"+c);
    }

    
}

public class exp5 {
    public static void main(String[] args) {

        exceptionDemo obj = new exceptionDemo();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 numbers :");
       int x= scan.nextInt();
       int y= scan.nextInt();
    //    obj.divideNumber(x, y);
       try {
        obj.divideNumber(x,y);
       } catch (ArithmeticException e) {
            System.out.println("Please Enter Proper input ");
       }
       catch (NullPointerException e) {
        System.out.println("Please Enter Proper input ");
   }
        
    }
    
}
