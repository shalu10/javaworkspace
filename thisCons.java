// This can be used to invoke current class constructor
class Student {

    Student() //default constructor
    {
        this(5); //calling parameterized constructor
        System.out.println("Default constructor");
    }
    Student(int rollno) //parameterized constructor
    {
        // this(); // calling default constructor
        System.out.println("Rollno :"+rollno);
    }

    
}
public class thisCons {
    public static void main(String[] args) {

        Student s1 = new Student(); //instance created for default constructor
        
    }
    
}
