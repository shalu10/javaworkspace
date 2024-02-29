public class thread1 {
    public static void main(String[] args) {
        
        Thread t = new Thread(()->
            {
               
                for(int i=0;i<=5;i++)
                {
                    System.out.println("Thread1 Called");
                }
                
            }
        );
        t.setPriority(Thread.MIN_PRIORITY);
         
        Thread t1 = new Thread(()->
            {
               
                for(int i=0;i<=5;i++)
                {
                    System.out.println("Thread2 Called");
                }
                
            }
        );
        t1.setPriority(Thread.MAX_PRIORITY);
        t.start();
        t1.start();
       
    }
}
