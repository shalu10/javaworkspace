
class Addition {
    int add (int a,int b)
    {
        return a+b;
    }
    double add(int a,float b,double c)
    {
        return a+b+c;
    }
       String add(String name ,String name1)
    {
        return name + " " + name1;
    }

}
public class Loading {

    
    public static void main(String[] args) {

        Addition obj = new Addition();
       System.out.println("Addition of 2 value ="+obj.add(10,20));
       System.out.println("Addition of 3 value ="+obj.add(10, 20.3f, 4.6));
       System.out.println("String value ="+obj.add("Demo","Page"));   
    }
    
}
 