//Contructor OverLoading
public class Construct1 {

    int id;
    String name;
    int age;

    Construct1 (int i,String n)
    {
        id = i;
        name = n;
    }
    Construct1 (int i,String n,int a)
    {
        id =i;
        name = n;
        age =a;
    }

    void display()
    {
        System.out.println(id+" "+name+" "+age);
    }

    public static void main(String[] args) {

        Construct1 obj = new Construct1(1, "demo");
        Construct1 obj1 = new Construct1(1, "demo1",10);

         obj.display();
         obj1.display();
         


    }
    
}
