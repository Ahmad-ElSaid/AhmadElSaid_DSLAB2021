/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

/**
 * QUEUE IMPLEMENTS FIFO STRUCTURE (FIRST-IN FIRST-OUT)
 *
 * @author Bader
 */
public class ArrayQueue implements QueueInterface {

    private Object[] array;
    private int back;

    public ArrayQueue() {
        //default values
        array = new Object[10];
        back = -1;
    }

    public ArrayQueue(int maxSize) {
        array = new Object[maxSize];
        back = -1;
    }

    @Override
    public boolean isEmpty() {
        return back + 1 == 0;
    }

    @Override
    public void makeEmpty() {
        back = -1;
    }

    public boolean isFull() {
        return back + 1 == array.length;
    }

    //similar to insertAtFront
    @Override
    public void enqueue(Object value) {
        if (isFull()) {
            expand();
        }
        //shift array forward to make space for insertion at front
        for (int i = back + 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = value;
        back++;
    }

    //similar to removeFromBack
    @Override
    public void dequeue() {
        if (isEmpty()) {
            throw new NullPointerException("Queue is empty. No values to remove.");
        } else {
            back--;
        }
    }

    public void expand() {
        Object[] newArray = new Object[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }

    @Override
    public void print() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            for (int i = 0; i < back + 1; i++) {
                System.out.print(array[i] + "=> ");
            }
            System.out.println();
        }
    }

    //method for QUIZ
    public int indexOf(Object value) {
        for (int i = 0; i < back + 1; i++) {
            if (array[i].equals(value)) {
                return i+1; //i+1 to display the positions starting from 1 and not 0
            }
        }
        return -1;
    }
}
