package tree.binaryTree;

/**
 * Created by Abhinav on 12/31/2015.
 */
public class BinaryTreeNode {
    private BinaryTreeNode left, right;
    private int data;
    int signholder=0;

    public BinaryTreeNode() {
        this.left = null;
        this.right = null;
        data = 0;

    }

    public BinaryTreeNode getLeft() {
        return left;
    }

    public void setLeft(BinaryTreeNode left) {
        this.left = left;
    }

    public void setRight(BinaryTreeNode right) {
        this.right = right;
    }

    public void setData(int data) {
        this.data = data;
    }

    public BinaryTreeNode getRight() {
        return right;
    }

    public int getData() {
        return data;
    }

}
