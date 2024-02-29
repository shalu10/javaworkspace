//super can be used to invoke parent class constructor immediatly

class Vechical //parent class
{
    Vechical()//parent class constructor
    {
        System.out.println("Parent class called");
    }
}

class  Car extends Vechical {  //child class Car inherit parent class Vechical

    Car()//child class constructor
    {
        super();
        System.out.println("Child class called");
    }
}

//main class
public class supr_exmp2 { 
    public static void main(String[] args) {
        Car c = new Car(); // Calling Constructor
    }
    
}
/*
 * super can be used to invoke parent class constructor immediatly
 * ===============================================================
 *      => Super keyword is used to invoke the parent class constructor 
 *      => super() is added in each class constructor automatically by compiler if there is no super()
 * 
 */
