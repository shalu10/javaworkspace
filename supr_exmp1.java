//super can be used to invoke parent class method immediatly
class Vechical //parent class
{
    void display() //parent class method
    {
        System.out.println("Parent class called");
    }
}

class Car extends Vechical //child class Car inherit parent class Vechical
{
    void display() //child class method
    {
        System.out.println("Child class called");
    }

    void show()
    {
        display(); //invoke Car (Child class) class method

        // To access the parent method we need to use super keyword
        super.display(); // invoke Vechical (parent class) method
    }
    
}
//main class
public class supr_exmp1 {
    public static void main(String[] args) {
        Car obj = new Car(); // created instance for child class
        obj.show(); //method call
    }
    
}

/*
 * super can be used to invoke parent class method immediatly
 * ==========================================================
 *      Super keyword is used to invoke the parent class method
 *      It should be used if subclasss contain the same method as parent class
 *      It is used if method is overridden
 *  
 * 
 */

