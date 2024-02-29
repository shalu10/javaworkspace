class demo{
    void show()
    {
        System.out.println("Demo class called");
    }
}

 interface demo1 {
    void show1();

    
}
class Book extends demo  implements Runnable,demo1

{
    public void run ()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("Update Database");
            try {
                Thread.sleep(3000 );
            } catch (InterruptedException e) {
             
            }
        }
       
    }


    public void show1() {
        System.out.println("Demo1 method called");

    }
}

class Print extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
        System.out.println(i);
        try {
            Thread.sleep(2000 );
        } catch (InterruptedException e) {
         
        }
        }
    }
}
public class thread_exam {
    public static void main(String[] args) throws InterruptedException  {
        Book book = new Book();
        Print print = new Print();
        Thread t = new Thread(book);
        t.start();
        print.start();
        // try{
        //     t.sleep(5000);
        // }
        // catch (InterruptedException e) {
         
        // }
        // t.stop();
        System.out.println("End of Program");
    }
}
