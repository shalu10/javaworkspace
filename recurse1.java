public class recurse1 {

   static int factorial(int n)
    {
        if(n==1)
        {
            return 1;
        }
        else{
             return n*factorial(n-1);
        }
    }

    public static void main(String[] args) {
        int fact;
        fact =factorial(5);
        // int fact=1;
        // for(int i=1;i<=5;i++)
        // {
        //     fact *= i;
        // }
        System.out.println(fact);
        
        
    }
    
}
