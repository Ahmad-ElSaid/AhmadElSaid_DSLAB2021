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
public interface QueueInterface {

    boolean isEmpty();

    void makeEmpty();

    //similar to insertAtFront
    void enqueue(Object value);

    //similar to removeFromBack
    void dequeue();

    void print();

}
