interface  student{
    void display(); // abstract method
}
interface language extends student {
    void getLanguage(String name);
}
 class childClass implements language {

    public void display() {

        System.out.println("Display method called");
    }
    public void getLanguage(String name) {
        System.out.println("Language :"+name);
    } 
}

public class interface_example {
    public static void main(String[] args) {

        childClass obj = new childClass();
        obj.display();
        obj.getLanguage("Java");
       
        
    }
}
