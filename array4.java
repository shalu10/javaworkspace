import java.util.Scanner;

public class array4 {
    public static void main(String[] args) {
        
        int a[][]=new int [3][3];
        
        Scanner scanner = new Scanner(System.in);

        for(int i=0 ; i < a.length;i++)
        {
            for(int j=0 ; j< a[i].length;j++)
            {
                System.out.print("Enter a [" + i + "]["+ j+"] :" );
                a[i][j]=scanner.nextInt();
            }
        }


          for(int i=0 ; i < a.length;i++)
        {
            for(int j=0 ; j< a[i].length;j++)
            {
                System.out.print(a[i][j] + " " );
            }
            System.out.println();
        }
    }
    
}
