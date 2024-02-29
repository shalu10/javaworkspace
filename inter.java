interface animals {
    void sound();
}
interface  birds extends animals{
    void bread();
    
}

class Dog implements birds
{

    public void sound() {
        System.out.println("Barking");
    }

    public void bread() {
        System.out.println("Parrot");
    }
   
}
public class inter {

    public static void main(String[] args) {
            Dog obj = new Dog();
            obj.sound();
            obj.bread();
    
    }
    
}
