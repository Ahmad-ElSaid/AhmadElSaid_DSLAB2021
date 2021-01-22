/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

/**
 *
 * @author Bader
 */
public class TestQueue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedQueue linkedQueue = new LinkedQueue();
        linkedQueue.enqueue(1);
        linkedQueue.enqueue(2);
        linkedQueue.enqueue(3);
        linkedQueue.enqueue(4);
        linkedQueue.enqueue(5);

        System.out.println("Linked Queue with 5 values: ");
        linkedQueue.print();
        
        System.out.println("Minimum value of queue is: " + linkedQueue.getMin());
        
        System.out.println("Position of #1 is: " + linkedQueue.indexOf(1));
        System.out.println("Position of #3 is: " + linkedQueue.indexOf(3));
        System.out.println("Position of #5 is: " + linkedQueue.indexOf(5));

        linkedQueue.dequeue();
        linkedQueue.dequeue();
        System.out.println("Linked Queue after dequeueing twice.");
        linkedQueue.print();
        
        System.out.println("Position of #3 is: " + linkedQueue.indexOf(3));
        System.out.println("Position of #0 is: " + linkedQueue.indexOf(0));
        
        System.out.println("===============================================");
        
        ArrayQueue arrayQueue = new ArrayQueue();
        arrayQueue.enqueue(10);
        arrayQueue.enqueue(20);
        arrayQueue.enqueue(30);
        arrayQueue.enqueue(40);
        arrayQueue.enqueue(50);

        System.out.println("Array Queue Queue with 5 values: ");
        arrayQueue.print();
        
        System.out.println("Position of #3 is: " + arrayQueue.indexOf(3));

        arrayQueue.dequeue();
        arrayQueue.dequeue();
        System.out.println("Array Queue after dequeueing twice.");
        arrayQueue.print();
        
        System.out.println("Position of #50 is: " + arrayQueue.indexOf(50));
        System.out.println("Position of #30 is: " + arrayQueue.indexOf(30));
    }
}
