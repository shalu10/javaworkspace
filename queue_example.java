import java.util.LinkedList;
import java.util.Queue;


public class queue_example {

    public static void main(String[] args) {
        Queue<Integer> q= new LinkedList<>();
        q.add(1);
        q.add(2);
        q.offer(3);
       


        
        
        System.out.println(q);
        System.out.println( q.peek());
        System.out.println( q.poll());
        System.out.println(q);

    }
    
}
