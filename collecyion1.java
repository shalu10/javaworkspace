
import java.util.*;

class Student  {
    int rollNo;
    String name;
    int age;

    Student (int rollNo,String name,int age)
    {
        this.rollNo=rollNo;
        this.name=name;
        this.age=age;
    }

    
}
public class collecyion1 {
    public static void main(String[] args) {

        ArrayList<Student> sData = new ArrayList<Student>();
        Scanner s = new Scanner(System.in);
        for(int i=1;i<=4;i++)
        {
          
            System.out.println("enter the student id");
          int id =s.nextInt();
          System.out.println("enter the student age");

            int age = s.nextInt();
            System.out.println("enter the student name");
                                                                                           s.nextLine();
            String name = s.nextLine();
            
            Student stud = new Student(id, name, age);
           sData.add(stud); 
        
        }
        s.close();

        // Student s1 = new Student(1, "demo", 20);
        // Student s2 = new Student(2, "demo1", 21);
        // Student s3 = new Student(3, "demo2", 22);
        // Student s4 = new Student(4, "demo3", 23);

       
        // sData.add(s2);
        // sData.add(s3);
        // sData.add(s4);

        System.out.println(sData);

        for(Student s1 :sData)
        {
            System.out.println(s1.rollNo + " "+ s1.name + " "+s1.age);   
        }
    }
    
}
