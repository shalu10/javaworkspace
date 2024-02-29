class demo{
    int rollno;
    int mark;
    demo(int  a,int b){
    //   rollno=12;
    //   mark=50;
    rollno=a;
    mark=b;
    }
    void display()
    {
        System.out.println("ROLLNO="+rollno+"\nMARK="+mark);
    }
    }
    public class t{
        public static void main(String[] args) {
            demo d=new demo(10,50);
        d.display();
        }
       


    }
