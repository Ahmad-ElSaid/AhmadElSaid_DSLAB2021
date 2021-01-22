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
public class BinaryTree {

    private BinaryNode root;

    public BinaryTree() {
        this.root = null;
    }

    public BinaryTree(BinaryNode root) {
        this.root = root;
    }

    public BinaryTree(Object value) {
        this.root = new BinaryNode(value);
    }

    public BinaryTree(Object value, Object leftValue, Object rightValue) {
        this.root = new BinaryNode(value, new BinaryNode(leftValue), new BinaryNode(rightValue));
    }

    public BinaryNode getRoot() {
        return this.root;
    }

    public boolean isEmpty() {
        return this.root == null;
    }

    public void makeEmpty() {
        this.root = null;
    }

    //Node => Left => Right
    public void printPreOrder() {
        if (root == null) {
            System.out.println("Binary Tree is empty");
        } else {
            printPreOrder(root);
        }
    }

    //Left => Node => Right
    public void printInOrder() {
        if (root == null) {
            System.out.println("Binary Tree is empty");
        } else {
            printInOrder(root);
        }
    }

    //Left => Right => Node
    public void printPostOrder() {
        if (root == null) {
            System.out.println("Binary Tree is empty");
        } else {
            printPostOrder(root);
        }
    }

    //recursive function, defined as private
    private void printPreOrder(BinaryNode root) {
        System.out.print(root.getValue() + "\t");

        if (root.getLeft() != null) {
            printPreOrder(root.getLeft());
        }

        if (root.getRight() != null) {
            printPreOrder(root.getRight());
        }
    }

    //recursive function, defined as private
    private void printInOrder(BinaryNode root) {
        if (root.getLeft() != null) {
            printInOrder(root.getLeft());
        }

        System.out.print(root.getValue() + "\t");

        if (root.getRight() != null) {
            printInOrder(root.getRight());
        }
    }

    //recursive function, defined as private
    private void printPostOrder(BinaryNode root) {
        if (root.getLeft() != null) {
            printPostOrder(root.getLeft());
        }

        if (root.getRight() != null) {
            printPostOrder(root.getRight());
        }

        System.out.print(root.getValue() + "\t");
    }

}
