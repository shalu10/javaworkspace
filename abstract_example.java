//abstract class

abstract class student {
    abstract void display(); // abstract method
    void show() //non abstract method
    {
        System.out.println("Show method called");
    }
}
class childClass extends student { //subclass inherit the abstarct class using extends keyword

    void display() { //implementation of abstract class
      System.out.println("Display 1 Called");
    }
}
public class abstract_example {
    public static void main(String[] args) {
        childClass obj = new childClass();
        obj.display(); //abstract method call
        obj.show(); // non- abstract method call
        
    }
}
/*
 * Abstraction
 * ===========
 *      Abstraction is a process of hiding an implementation details and show only functionality to an user
 * 
 * To Achieve Abstraction
 * ----------------------
 *          1.Abstract class
 *          2.Interface
 * 
 *  Abstract class
 * ----------------
 *      A class which is declared as a abstract is known as abstract class
 *      It has both Abstract & non Abstract method
 *      It cannot be instantiated ( we cannot create object for abstract class)
 *
 *   Syntax
 * ----------
 *      abstract class class_name
 *      {
 *          //fields & methods
 *      }
 *
 *  Abstract Method
 * -----------------
 *      A method which is declared as abstract and does not have an implementation is known as abstract method
 *  Syntax
 * -------
 *      abstract return_type method_name();
 */ 
