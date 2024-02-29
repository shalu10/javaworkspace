public class exp2 {
    public static void main(String[] args) {
        try
        {
            try
            {
               try {
                int c =10/0;
               } catch (NullPointerException e) {
                System.out.println(e);
                // TODO: handle exception
               }
               
               
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println(e);
            }
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
    }
}
