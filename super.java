//super can be used to refer immediate parent class instance variable
class Vechical
{
    // String color = "red";

    // void display()
    // {
    //     System.out.println("Parent class called");
    // }
    Vechical()
    {
        System.out.println("Parent class called");
    }
}

class  Car extends Vechical {

    Car()
    {
        super();
        System.out.println("Child class called");
    }


    
    

    // String color ="blue";

    // void display()
    // {
    //     System.out.println(color);
    //     System.out.println(super.color);
    // }

    // void display()
    // {
    //     System.out.println("Child class called");
    // }

    // void show()
    // {
    //     display();
    //     super.display();
    // }
}


public class supr_exampl {
    public static void main(String[] args) {
        Car obj = new Car();
        // obj.show();

    }
    
}

/*
 * 
 * super Keyword
 * --------------
 *      Super keyword  --> Reference Variable which is used to refer immediate parent class obj
 * 
 * Usage of SUPER Keyword
 * ----------------------
 *      1.super can be used to invoke parent class method immediatly
 *      2.super can be used to invoke parent class constructor immediatly
 *      3.super can be used to refer immediate parent class instance variable
 * 
 */
