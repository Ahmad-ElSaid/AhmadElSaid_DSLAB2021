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
public class LinkedQueue implements QueueInterface {

    private Node front;
    private Node back;
    private int size;

    public LinkedQueue() {
        makeEmpty();
    }

    public LinkedQueue(int size) {
        this.size = size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void makeEmpty() {
        this.size = 0;
        front = back = null;
    }

    //similar to insertAtFront
    @Override
    public void enqueue(Object value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            this.front = this.back = newNode;
        } else {
            newNode.setNext(this.front);
            this.front = newNode;
        }
        this.size++;
    }

    //similar to removeFromBack
    @Override
    public void dequeue() {
        if (isEmpty()) {
            throw new NullPointerException("Queue is empty. Cannot dequeue.");
        } else if (size == 1) {
            makeEmpty();
        } else {
            Node currentNode = this.front;
            while (currentNode.getNext() != this.back) {
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(null);
            this.back = currentNode;
            this.size--;
        }
    }

    @Override
    public void print() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            Node currentNode = this.front;
            while (currentNode != null) {
                System.out.print(currentNode.getValue() + "=> ");
                currentNode = currentNode.getNext();
            }
            System.out.println();
        }
    }

    //method for QUIZ
    public int indexOf(Object value) {
        int index = 0;
        Node currentNode = this.front;

        while (currentNode != null) {
            index++;
            if (currentNode.getValue().equals(value)) {
                return index;
            }
            currentNode = currentNode.getNext();
        }
        return -1;
    }

    public int getMin() {
        Node currentNode = this.front;
        int min = (int) currentNode.getValue();
        while (currentNode != null) {
            if ((int) currentNode.getValue() < min) {
                min = (int) currentNode.getValue();
            }
            currentNode = currentNode.getNext();
        }
        return min;
    }
}
