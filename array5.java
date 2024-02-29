import java.util.Arrays;
import java.util.Collections;

public class array5 {
    public static void main(String[] args) {
        int []array={5,2,89,45,34,9,28}; // length->7 index :6
        // Arrays.sort(array,1,4);
        // Arrays.sort(array); //ascending
        // Arrays.sort(array,Collections.reverseOrder()); //decending
        // int [] newArray=array;
       int [] newArray= Arrays.copyOf(array, 10);
       newArray[7]=455;
       newArray[8]=10;
       newArray[9]=66;
    // array[2]=-3;

        for(int i=0;i<newArray.length;i++)
        {
            System.out.print(newArray[i] + " ");
        }
    }
    
}
