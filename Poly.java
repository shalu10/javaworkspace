
class Vechical {

    protected void add (int a,int b)
    {
       System.out.println("Parent class Addition with 2 Parametes");
    }
    public void add(int a,float b,double c)
    {
        System.out.println("Parent class Addition with 3 Parametes");
    }
   
}

class Car extends Vechical {
    public void add (int a,int b)
    {
       System.out.println("Child class Addition with 2 Parametes");
    }
    public void add(int a,float b,double c)
    {
        System.out.println("Child class Addition with 3 Parametes");
    }

}

// class Bike extends Vechical {
//      public void display()
//     {
//         System.out.println("Bike classs calling");
//     }
// }
public class Poly {


    public static void main(String[] args) {

        // Car obj = new Car();

        // obj.add(10,20);
        // obj.add(10,20,30);

        // Vechical obj1 = new Vechical();
        // obj1.add(10,20);
        // obj1.add(10,20,30);

        Vechical obj = new Vechical();

        obj.add(10,20);
        obj.add(10,20,30);

        Vechical obj1 = new Car();

         obj1.add(10,20);
        // obj1.add(10,20,30);
        
    }
    
}




