abstract class student {
    abstract void display1();
    void show()
    {
        System.out.println("Show method called");
    }
}
class childClass extends student {

    void display1() {
      System.out.println("Display 1 Called");
    }
}
 class childclass1 extends student {
    void display1() {
        System.out.println("Display 1 Called !!!!!!!!!!!");
      }
    
}
public class abst_example {
    public static void main(String[] args) {
        student obj = new childClass();
        obj.display1();
        obj.show();
        student obj1 = new childclass1();
        obj1.display1();
    }
}
