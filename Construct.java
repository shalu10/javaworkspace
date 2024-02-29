public class Construct {
    int a;
    boolean b;
    String name;

    Construct( int num, boolean value,String user_name)
    {
        a=num;
        b=value;
        name =user_name;
        System.out.println("a= "+a);
        System.out.println("b="+b);
        System.out.println("name="+name);

    }



    public static void main(String[] args) {

        Construct obj = new Construct( 10 , true ,"jai");

        Construct obj1 = new Construct( 11 , false ,"jai");
       
        
    }
}
