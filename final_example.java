
 class parentClass {

   final String name ="demo";

//    parentClass(String name)
//     {   
//         this.name = name;
//     }

   final void finalMethods()
    {
        System.out.println("Final method called");
    }
}


 class childClass extends parentClass {

    // childClass(String name) {
    //     super(name);
    //     //TODO Auto-generated constructor stub
    // }
   final void finalMethods1()
    {
        super.finalMethods();
        System.out.println("Final1 method called");
    }

    
}



public class final_example {
public static void main(String[] args) {
    // parentClass obj = new parentClass("demo");
    // obj.name = "demo1";
    // System.out.println(obj.name);

     

    childClass obj = new childClass();
    obj.finalMethods();
    
}
}
