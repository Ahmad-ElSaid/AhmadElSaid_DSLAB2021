/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singly_linked_list;

/**
 *
 * @author Bader
 */
public class TestSLL {

    /**
     * @param args the command line arguments //Testing my code here in main
     */
    public static void main(String[] args) {
        SLL myList = new SLL("Marc");
        myList.add("Ahmad");
        myList.add("Mahdi");
        myList.add("Khodor");
        myList.add("Ahmad");
        myList.add("Zeina");
        myList.add("Ahmad");

        System.out.println(myList.get(3));
        System.out.println(myList.get(1));

        System.out.println(myList.indexOf("Khodor"));

        System.out.println(myList.size());

        myList.print();

        System.out.println("Number of occurences of Ahmad: " + myList.getNumberOfOccurences("Ahmad"));

        //Testing of remove functions:
        
        //Try myList.remove(-1) to test function behavior if index is out of bounds
        //Try myList.remove("Bader") which is a non-existing element
        
        myList.remove();
        myList.print();

        myList.remove(1);
        myList.print();

        myList.remove(0);
        myList.print();

        myList.remove("Khodor");
        myList.print();

        System.out.println("Number of occurences of Ahmad: " + myList.getNumberOfOccurences("Ahmad"));
    }

}
