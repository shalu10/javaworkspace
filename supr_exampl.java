//super can be used to refer immediate parent class instance variable
class Vechical //parent class
{
    String color = "red"; //parent class instance Variable
}

class  Car extends Vechical { //child class Car inherit parent class Vechical

    String color ="blue";  //child class instance Variable

    void display() //method
    {
        System.out.println(color); // print color of car class

        // To access the parent property we need to use super keyword
        System.out.println(super.color); //print color of vechical class (parent class)
    }

}

//main class
public class supr_exampl {
    public static void main(String[] args) {
        Car obj = new Car(); // created instance for child class
        obj.display(); //method call

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
 * super can be used to refer immediate parent class instance variable
 * ===================================================================
 * 
 *    => we can use super keyword to access the data member or fileds of parent class
 *    => It is used if parent class & child class has same fields /instance vaiables
 * 
 */
