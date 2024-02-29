public class array {
    public static void main(String[] args) {
        int [] age={20,30,40,50};

    System.out.println("Array Size :" + age.length);

        System.out.println(age[0]);
        for(int i=0;i<age.length;i++)
        {
            System.out.println("Age :"+age[i]);
        }

        for(int a : age )
        {
            System.out.println(a);
        }
    }
    
}
