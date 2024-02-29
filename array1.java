import java.util.Scanner;

public class array1 {
    public static void main(String[] args) {
        String name [] = new String[3];
        Scanner scanner = new Scanner(System.in);

        // for(int i=0;i<name.length;i++)
        // {
        //     System.out.print("Enter a name :");
        //     name[i]= scanner.nextLine();
           
        // }

        for(String names : name)
        {
            System.out.println("enter a name :");
            names = scanner.nextLine();
            System.out.println("Name :"+names);
        }
        scanner.close();
    }
}
