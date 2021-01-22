/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binary_tree;

/**
 *
 * @author bader-aul
 */
public class TestBinaryTree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BinaryTree myTree = new BinaryTree(1, 2, 3);

        myTree.getRoot().getLeft().setLeft(4);
        myTree.getRoot().getLeft().setRight(5);

        System.out.println("Printing PreOrder: ");
        myTree.printPreOrder();

        System.out.println();

        System.out.println("Printing InOrder: ");
        myTree.printInOrder();

        System.out.println();

        System.out.println("Printing PostOrder: ");
        myTree.printPostOrder();

        System.out.println();

        System.out.println("Sum of values in tree is: " + myTree.sum());

    }

}
