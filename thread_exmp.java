class  Student implements Runnable {
    public void run()
    {
        for(int i =1;i<=5;i++)
        {
            System.out.println("Update Database");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
         
        }
    }
}
class printingData  extends Thread{
   public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
public class thread_exmp {
    public static void main(String[] args) throws InterruptedException {
        Runnable stud = new Student();
        printingData print = new printingData();
        Thread t = new Thread(stud);

        t.start();
        print.start();
        try{
            t.sleep(5000);
        }
        catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        

        t.stop();

        
       
        System.out.println("Ending");
        
    }
}
