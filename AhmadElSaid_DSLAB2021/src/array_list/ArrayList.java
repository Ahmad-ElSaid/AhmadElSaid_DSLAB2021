/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_list;


public class ArrayList implements ArrayListInterface {

    // 1. define and initialize array of objects
    // 2. define initial capacity of array, e.g. 10 elements
    // 3. define currentSize of array, initially = 0
    // 4. implement ArrayList constructor
    // 5. implement abstract method of ArrayListInterface
    private Object[] array;
    private int currentSize = 0;

    public ArrayList(int capacity) {
        array = new Object[capacity];
    }

    @Override
    public int size() {
        return currentSize;
    }

    @Override
    public Object getElement(int index) {
        if (index > 0 || index < currentSize) {
            return array[index];
        } else {
            throw new IndexOutOfBoundsException(index);
        }
    }

    //this is the contain method previously implement, only it returns the index instead of true or false
    @Override
    public int indexOf(Object element) {
        for (int i = 0; i < currentSize; i++) {
            if (element == array[i]) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void add(Object newElement) {
        if (currentSize == array.length) {
            //expand array

            Object[] newArray = new Object[array.length * 2];
            /*
            it's less costly to multiply length of array by two, for example, when we want to expand the array
            than add it by one only each time
            because then we will have to expand the array on each add operation when the currentSize reaches the inital size set
             */
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            newArray[currentSize] = newElement;
            array = newArray;
            currentSize++;
        } else {
            array[currentSize] = newElement;
            currentSize++;
        }
    }

    //removing last element of array
    @Override
    public void remove() {
        if (currentSize != 0) {
            currentSize--;
            /*just be setting the currentSize to point to the element before,
            this means the array will not accessing the last element anymore, even though physically it's still there
            but to us it doesn't appear
            and then the next time we use the add function it will replaced by the new element and gone for good
             */
        }
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index >= currentSize) {
            throw new IndexOutOfBoundsException();
        } else {
            for (int i = index; i < currentSize - 1; i++) { //added -1 to avoid index out of bounds exception which is thrown when comparing last element with the element after it
                array[i] = array[i + 1];
                /*
                shifting backwards all elements after array[index] to replace it (and thus remove it) 
                and avoid empty spaces in the array
                 */
            }
            currentSize--;
        }
    }

    @Override
    public void remove(Object oldElement) {
        int index = indexOf(oldElement);
        if (index != -1) {
            remove(index);
            //not setting currentSize--; because it's already been done in the remove(int index) method
        } else {
            throw new NullPointerException("The element you're trying to remove could not be found.");
        }
    }

    //concats two ArrayLists
    @Override
    public ArrayList concat(ArrayList l2) {
        ArrayList l1 = this;

        for (int i = 0; i < l2.size(); i++) {
            l1.add(l2.getElement(i));
        }
        return l1;
    }

    //concat two arrays using System.arraycopy
    public Object[] concat(Object[] array1, Object[] array2) {
        int newSize = array1.length + array2.length;
        Object[] array3 = new Object[newSize];

        System.arraycopy(array1, 0, array3, 0, array1.length);
        System.arraycopy(array2, 0, array3, array1.length, array2.length);

        return array3;
    }

    public void print() {
        System.out.print("Index  : \t");
        for (int i = 0; i < currentSize; i++) {
            System.out.print((i) + "\t");
        }

        System.out.print("\nElement : \t");

        for (int i = 0; i < currentSize; i++) {
            System.out.print(array[i] + "\t");
        }

        System.out.println("\n");
    }

    //method for QUIZ
    public int getNumberOfOccurences(Object element) {
        int count = 0;
        for (int i = 0; i < currentSize; i++) {
            if (array[i].equals(element)) {
                count++;
            }
        }
        return count;
    }

    public void removeDuplicates_sorted() {
        //consider you have a sorted array
        for (int i = 0; i < currentSize - 1; i++) { //added -1 to avoid index out of bounds exception which is thrown when comparing last element with the element after it
            if (array[i].equals(array[i + 1])) {
                remove(i);
                i--; //decrement i in case a duplicate was found in order to check the value again for more than 2 duplicates
            }
        }
    }

    public void removeDuplicates() {
        for (int i = 0; i < currentSize; i++) {
            Object value = array[i];
            for (int j = i+1; j < currentSize; j++) { //starting from index 1
                if (value.equals(array[j])) {
                    remove(j); //remove element at index j
                }
            }
        }
    }

    public boolean containsAll(ArrayList list2) {

        //traversing list2 to check if all of its elements exist in my array
        for (int i = 0; i < list2.size(); i++) {
            Object currentElement = list2.getElement(i);

            if (this.indexOf(currentElement) == -1) {
                return false; //break the loop if only one element was not found
            }
        }
        return true; //return true if the loop has not been broken once => all elements have been found
    }
}
