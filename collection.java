import java.util.*;

 
public class collection {
    public static void main(String[] args) {
        // int a[]=new int[5];
        ArrayList <Integer> alist = new ArrayList<Integer>();
        for(int i=1;i<=10;i++ )
        {
            alist.add(i);
        }
        alist.add(100);
        alist.add(100);
        Iterator i = alist.iterator();

        System.out.println(i.next());
        System.out.println(i.next());
       
        while (i.hasNext()) 
        {
            i.remove();
            System.out.println(i.next());

        }







        System.out.println(alist);
        // System.out.println(alist.get(5));
        // alist.set(5, 100);
        // System.out.println(alist);


        // ArrayList<String> slist = new ArrayList<String>();
        // slist.add("Mango");
        // slist.add("Apple");
        // slist.add("Papaya");
        // slist.add("IceApple");

        // System.out.println(slist);
        // Collections.sort(slist);
        // System.out.println(slist);

        // for(Integer e: alist )
        // {
        //     System.out.println(e);
        // }

        // ArrayList list = new ArrayList();

        // list.add(1);
        // list.add("demo");
        // list.add('s');
        // System.out.println(list);

    }
}
