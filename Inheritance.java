//parent class 
class Animals {
    String name;
    public void sound()
    {
        System.out.println("Barking");
    }
    
}
//child Class
class Dog extends Animals {
    public void display()
    {
        System.out.println("Name is :"+name);
    }
}

//child Class
class Cat extends Animals {
    public void display()
    {
        System.out.println("Name is :"+name);
    }
}

public class Inheritance {
 public static void main(String[] args) {

    Dog obj = new Dog();
    obj.name="Dobby";
    obj.display();
    obj.sound();

    Cat obj1 = new Cat();

     obj1.name="dsada";
    obj1.display();
    obj1.sound();

    
 }
    
}
