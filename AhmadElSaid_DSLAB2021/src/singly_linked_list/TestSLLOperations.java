/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singly_linked_list;

/**
 *
 * @author bader-aul
 */
public class TestSLLOperations {

    public static void testMergeFunction(SLL firstList) {
        SLL secondList = new SLL();
        secondList.add("Sirin");
        secondList.add("Hassan");
        secondList.add("Ahmad");

        SLL mergedList = SLL.merge(firstList, secondList);
        mergedList.print();
    }

    public static void testSetOperations() {
        SLL firstList = new SLL();
        SLL secondList = new SLL();

        firstList.add(1);
        firstList.add(2);
        firstList.add(3);
        firstList.add(5);
        firstList.add(7);
        firstList.add(11);
        firstList.add(13);

        System.out.println("Printing first list: ");
        firstList.print();

        secondList.add(1);
        secondList.add(3);
        secondList.add(5);
        secondList.add(7);
        secondList.add(9);
        secondList.add(11);
        secondList.add(13);
        secondList.add(15);
        secondList.add(17);
        secondList.add(19);
        secondList.add(21);

        System.out.println("Printing second list: ");
        secondList.print();

        System.out.println("Printing intersection of the two lists: ");
        SLL.intersect(firstList, secondList).print();

        System.out.println("Printing union of the two lists: ");
        SLL.union(firstList, secondList).print();

        System.out.println("Printing the elements found in second list but not in first (complement)");
        SLL.complement(firstList, secondList).print();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //function to test if our merge two linked lists function is working
        SLL myList = new SLL("Marc");
        myList.add("Ahmad");
        myList.add("Mahdi");
        myList.add("Khodor");
        myList.add("Ahmad");
        myList.add("Zeina");
        myList.add("Ahmad");
        testMergeFunction(myList);

        //function to test set operations
        testSetOperations();

    }

}
