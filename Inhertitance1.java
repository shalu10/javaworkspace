class A
{
    public void display()
    {
        System.out.println("Class A Display function");
    }
}

class B extends A
{
    public void display1()
    {
        System.out.println("Class B Display function");
    }
}

class C extends B
{

    public void display2()
    {
        System.out.println("Class C Display function");
    }
}

public class Inhertitance1 {
    public static void main(String[] args) {

        C obj = new C();
        obj.display();
         obj.display1();

          obj.display2();
    }
    
}



