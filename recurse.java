public class recurse {
    static  int count =0;
    static void display()
    {
       
        count++;
        if(count<=5){
            System.out.println("Hello");
             display();
        }
        
    }
    public static void main(String[] args) {
        display();
    }
    
}
