public class array2 {
    public static void main(String[] args) {
        // int [][] a = new int[3][3];
        int a[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9},
            {10,11,12}
        };
          int b[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9},
            {10,11,12}
        };
        int result[][]=new int[3][3];
        System.out.println(a[0].length);
         System.out.println(a.length);

        for(int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                System.out.print(a[i][j]);
                result[i][j]=a[i][j]+b[i][j];
            }
            System.out.println();
        }


    }
}
