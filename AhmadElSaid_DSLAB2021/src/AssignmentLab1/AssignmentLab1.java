

package AssignmentLab1;


import java.util.Scanner;

public class AssignmentLab1 {
    
    public static boolean isAscending(int[] Asc){
      
        for(int i=0;i<Asc.length-1;i++)
        {
            if(Asc[i]>Asc[i+1])
                
                return false;
            
        }
                return true;
    
}

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        int Input = 6;
        int[] Array= new int[Input];
        for(int j=0;j<Input;j++){
            
            System.out.println("Enter A Number \n");
            Array[j] = s.nextInt();
            
        }
       if(isAscending(Array) == true)
           
           System.out.println("This Array is in Ascending Order");
       
        else
           
           System.out.println("This Array in NOT in an Ascending Order");
    }
}