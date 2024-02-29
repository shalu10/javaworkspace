//This can be used to invoke current class method implicitly
class Student
{
    void display()
    {
        System.out.println("Display method called");
    }
    void show()
    {
        System.out.println("Show method called");
        this.display(); // similar to display()
    }
}
public class thisKeyword1 {
    public static void main(String[] args) {
        Student s1 =new Student();
        s1.show();
        
    }
}
/*
 * If you dont use the this keyword,complier automatically add this keyword while invoking the method
 * 
 */
