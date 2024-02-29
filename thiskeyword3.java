// This can be used to invoke current class constructor
//CONSTRUCTOR CHAINING
class  Student {
    //instance variable
    int rollno;
    String name;
    float fee;
    String course;

    //constructor overLoading
    //constructor with 3 parameters
    Student(int rollno,String name,String course)
    {  
       this.rollno = rollno;
       this.name = name;
       this.course =course;
    }
     //constructor with 4 parameters
    Student(int rollno,String name,float fee,String course)
    {
        this(rollno,name,course); //calling parameterized constructor using this keyword
        this.fee =fee;
     
    }

  
    void display()
    {
        if(fee != 0.0)
        System.out.println(rollno+" " +name+" " + fee+" " +course);
        else
        System.out.println(rollno+" " +name+" " +course);

    }
    
}
public class thiskeyword3 {
    public static void main(String[] args) {

        Student s1 = new Student(1,"demo","java");

        Student s2 = new Student(2,"demo1",25000f,"java");
        s1.display();
        s2.display();
        
    }
    
}
/*
 * The constructor call is used to resuse the constructor from the constructor
 * Its maintain the chain between the constructor
 */