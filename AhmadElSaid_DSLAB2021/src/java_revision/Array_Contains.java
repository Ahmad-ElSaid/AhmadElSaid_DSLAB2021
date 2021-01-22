/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_revision;

/**
 *
 * @author Bader
 */
public class Array_Contains {
    
    public static void contains(int value, int[] array) {
        //Write logic here
        
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
         if(value == array[i]){
             found = true;
             break;
        }
        }
        
        if(found){
        System.out.println(value + "is found");
        } else {
        System.out.println(value + "is not found");
        }
    }
    
    public static void main(String[] args) {
        int [] array = {41, 6, 91, 24, 54, 78};
        //TODO: write a function called contains that tells me if a certain value if present inside the array or not
        contains(5, array);
        contains(91, array);
        
    }
}
