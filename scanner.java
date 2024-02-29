import java.util.Scanner;
public class scanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a name :");
        String name = scan.nextLine();

        
        int number =scan.nextInt();
        scan.nextLine();

        System.out.println("Enter a lastname :");
        String lastname = scan.nextLine();

        System.out.println("Enter a float value :");
        float f= scan.nextFloat();

        System.out.println("Name :"+name);
        System.out.println("Number :"+number);
          System.out.println("Last name :"+lastname);
        System.out.println("Float value :"+f);
        

        scan.close();

        

   
        // System.out.println("Name is "+name);
        
    }
    
}
