// This can be used to refer current class instance variables
class  Student {
    //instance variables
    int rollno;
    String name;
    float fee;
    String course;

    Student(int rollno,String name,float fee,String course)
    {
    // If there is ambiguity between the instance variables and parameters this keyword resolves the problem of ambiguity
       this.rollno = rollno;
       this.name = name;
       this.course =course;
       this.fee =fee;
    }

    void display()
    {
        System.out.println(rollno+" " +name+" " + fee+" " +course);
    }
    
}
public class thiskeyword {
    public static void main(String[] args) {

        Student s1 = new Student(2,"demo1",25000f,"java");
        s1.display();
        
    }
    
}

/*
 * 
 *      this keyword (reference variable)
 *      =============
 *              "this" keyword is used to refer the current object inside the method or constructor
 *    
 *      Usage of java "this" keyword
 *      -----------------------------
 * 
 *          1. This can be used to refer current class instance variables
 *          2. This can be used to invoke current class method implicitly
 *          3. This can be used to invoke current class constructor
 *          4. This can be passed as an arg in method call         
 *          5. This can be passed as an arg in constructor call
 */
