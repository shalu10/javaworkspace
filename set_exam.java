import java.util.*;

public class set_exam {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(3);
        ll.add(2);
        ll.add(3);
        ll.add(1);
        ll.add(7);

        System.out.println( ll.toArray());

       

        LinkedHashSet lh = new LinkedHashSet<>(ll);

        System.out.println(lh);
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        set.add(1);
        set.add(10);
        set.add(2);
        set.add(8);
        set.add(5);
        set.add(7);
        set.add(8);
        
      System.out.println(set);
    }
    
}
