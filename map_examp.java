import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class map_examp {
    public static void main(String[] args) {
        HashMap<Integer,String> map =new HashMap<>();
        map.put(1, "Anju");
        map.put(2, "Ishu");
        map.put(3, "sri");

       System.out.println(map.get(2)); 
       System.out.println(map.containsKey(4) );

       System.out.println(map.keySet());
       System.out.println(map.values());
       System.out.println(map.entrySet());
       
       System.out.println(map);

       Set s = map.keySet();

       Collection c = map.values();

       Set pair = map.entrySet();

       Iterator itr = s.iterator();
    System.out.println("Key Iteration");
       while(itr.hasNext())
       {
        System.out.println(itr.next());
       }

       Iterator itr1 = c.iterator();
       System.out.println(" Value Iteration");
       while(itr1.hasNext())
       {
        System.out.println(itr1.next());
       }

       System.out.println(" key-Value Iteration");

       Iterator it = pair.iterator();

       while (it.hasNext()) {

        Map.Entry m =  (Entry) it.next();

        System.out.println(m.getKey() + " " + m.getValue());
        
       }

       for(Map.Entry m1 : map.entrySet())
       {
        System.out.println(m1.getKey() + " " + m1.getValue());
       }

       for(Integer key : map.keySet())
       {
        System.out.println(key);
       }
      

    }
    
}
