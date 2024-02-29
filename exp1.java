public class exp1 {
    public static void main(String[] args) {
        try
        {
               
            try
            {
                int c =10/0;
            }
            catch(ArithmeticException e)
            {
                System.out.println(e);
            }
            try
            {
                int arr[]=new int[5];
                arr[6]=20;
            }
            catch(
                
            
            e)
            {
               System.out.println(e); 
            }
            String s =null;
            System.out.println(s.length());
            System.out.println("Outer try block called");

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println("End of program");
    }
    
}
