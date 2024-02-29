class StudentDetail {

        int rollno;//fields /instace variables
        String name;

        void display(){ //method
             System.out.println(rollno + " " + name);
             
            //    System.out.println(rollno + " " + name);
            

        }
}
public class Student {
    public static void main(String[] args) {

        StudentDetail s1 = new StudentDetail(); 
        StudentDetail s2 = new StudentDetail();
               s1.rollno =1;
               s1.name = "demo";
          

            s1.display();
            s2.display();
    }

    
}



