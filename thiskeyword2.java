 //This can be passed as an arg in method call
 class Student{
    int rollno;
    String name;

    Student(int rollno,String name)
    {
        this.rollno=rollno;
        this.name = name;
        System.out.println(this.rollno+" " +this.name);
        functionCall(this); //method call 
        System.out.println(this.rollno+" " +this.name);
    }

    void functionCall(Student obj)
    {
        obj.rollno =2;
        obj.name="demo1";
    }

    
}
public class thiskeyword2 {

    public static void main(String[] args) {
        
        Student s1 = new Student(1, "demo");
    }
    
}
