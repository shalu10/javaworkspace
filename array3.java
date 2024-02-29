public class array3 {
    public static void main(String[] args) {
        
        int [][][] a={
                        {
                            {1,2,3},
                            {4,5,6},
                            {7,8,9},
                            {10,11,12}
                        },
                        {
                            {1,2,3},
                            {4,5,6},
                            {7,8,9}
                        }
                    } ;

            System.out.println("Array length :"+a.length);
             System.out.println("Array length :"+a[0].length);
            // System.out.println(a[0][0][0] +" "+ a[0][0][1]);
                
        for(int array=0;array<a.length;array++)
        {
            for(int row=0; row<a[array].length; row++)
            {
                for( int col=0; col < a[array][row].length;col++)
                {
                    System.out.print(a[array][row][col] + " ");
                    
                }
                System.out.println();
            }
            System.out.println();
        }
        

}
}
