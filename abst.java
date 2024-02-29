abstract class  animals{
    void display() //non abstract method
    {
        System.out.println("Display called");
    }
    abstract void sound(); //abstract method
    
}

class Dog extends animals 
{
    void show()
    {
        display();
    }
    void sound() {
        System.out.println("barking");
    }    
}
 class  Cat extends animals{
    void sound() {
        System.out.println("meow");
    }

    
}
public class abst {
    public static void main(String[] args) {
        Dog obj = new  Dog();
        obj.show();
        obj.sound();
        Cat obj1 = new  Cat();
        obj1.sound();
    }
    
}
