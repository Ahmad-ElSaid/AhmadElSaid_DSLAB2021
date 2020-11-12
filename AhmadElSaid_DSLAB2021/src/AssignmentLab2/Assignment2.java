package AssigNmentLab2;

import java.util.Arrays;


public class Assignment2 {

    public static String concat(int [] A1,int [] A2 ){
        
            int capacity = A1.length+A2.length;
            
            int size1=A1.length;
            int size2=A2.length;
            
            int[] ConcatArray = new int[capacity];
            
            System.arraycopy (A1, 0, ConcatArray ,0 , size1);
            System.arraycopy ( A2, 0, ConcatArray ,size1 , size2);
            
            return  Arrays.toString(ConcatArray); 
    }
    
    public static void main(String[] args) {
        
        int [] InputsArray1= {4,23,5,23,67};
        
        int [] InputsArray2 ={66,6,235,69,420};
        
            
            
        
        System.out.println(concat(InputsArray1,InputsArray2));
    }
    
}