/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_list;

import array_list.ArrayList;


public class TestMyArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create new ArrayList
        ArrayList testArray = new ArrayList(2);

        //test add function
        testArray.add("Java");
        testArray.add("Javascript");
        testArray.add("Java");
        testArray.add("Python");
        testArray.add("Swift");
        testArray.add("Java");
        testArray.add("Python");
        testArray.print();

        ArrayList testArray2 = new ArrayList(2);
        testArray2.add("Python");
        testArray2.add("Javascript");

        System.out.println("Are all elements of testArray2 found in testArray?\t" + testArray.containsAll(testArray2));
        
        testArray2.add("Ruby");
        System.out.println("Are all elements of testArray2 found in testArray?\t" + testArray.containsAll(testArray2));

        System.out.println("Number of occurences of Java: " + testArray.getNumberOfOccurences("Java"));
        System.out.println("Removing duplicates: ");
        testArray.removeDuplicates();
        testArray.print();

        //test remove function
        System.out.println("Removing last element:");
        testArray.remove();
        testArray.print();

        System.out.println("Number of occurences of Java: " + testArray.getNumberOfOccurences("Java"));

        //test remove element function
        System.out.println("Remove Javascript element");
        testArray.remove("Javascript");
        testArray.print();

        System.out.println("Number of occurences of Java: " + testArray.getNumberOfOccurences("Java"));

        //test remove index function
        System.out.println("Removing element at index 0");
        testArray.remove(0);
        testArray.print();

        System.out.println("Number of occurences of Java: " + testArray.getNumberOfOccurences("Java"));

        ArrayList testArray3 = new ArrayList(5);
        testArray3.add("London");
        testArray3.add("Paris");

        System.out.println("Concating another Arraylist:");
        testArray.concat(testArray3);
        testArray.print();

        System.out.println("Number of occurences of Java: " + testArray.getNumberOfOccurences("Java"));
    }
}
