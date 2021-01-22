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
public class BinaryNode {

    private Object value;
    private BinaryNode left;
    private BinaryNode right;

    public BinaryNode(Object value) {
        this.value = value;
        this.left = this.right = null;
    }

    public BinaryNode(Object value, BinaryNode left, BinaryNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public BinaryNode getLeft() {
        return left;
    }

    public void setLeft(BinaryNode left) {
        this.left = left;
    }

    public void setLeft(Object value) {
        this.left = new BinaryNode(value);
    }

    public BinaryNode getRight() {
        return right;
    }

    public void setRight(BinaryNode right) {
        this.right = right;
    }

    public void setRight(Object value) {
        this.right = new BinaryNode(value);
    }

    public boolean isLeaf() {
        return this.left == null && this.right == null;
    }
}
