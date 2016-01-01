package tree.binaryTree;

import java.util.Stack;

/**
 * Created by Abhinav on 12/31/2015.
 */
public class BinaryTree {
    BinaryTreeNode root;
    int size;
    Stack<BinaryTreeNode> temp;

    public BinaryTree() {
        root = null;
        size = 0;
    }

    public void insert(int val) {
        root = insert(root, val);
    }

    public BinaryTreeNode insert(BinaryTreeNode node, int val) {

        if (node == null) {
            node = new BinaryTreeNode();
            node.setData(val);
            size++;
        } else {
            if (val > node.getData()) {
                node.setRight(insert(node.getRight(), val));
            } else {
                node.setLeft(insert(node.getLeft(), val));
            }

        }
        return node;

    }

    //getter for size
    public int getSize() {
        return size;
    }

    public void preorderTraversal() {
        temp = new Stack<BinaryTreeNode>();
        BinaryTreeNode ptr = new BinaryTreeNode();
        ptr = root;
        if (ptr == null) {
            System.out.println("the tree is empty");
        }

        while (ptr != null) {
            System.out.println("processed  value " + ptr.getData());

            if (ptr.getRight() != null) {
                temp.push(ptr.getRight());
            }
            ptr = ptr.getLeft();
            if (ptr == null && !temp.isEmpty()) {
                ptr = temp.pop();

            }
        }

    }


    public void inorderTraversal() {
        temp = new Stack<BinaryTreeNode>();
        BinaryTreeNode ptr = new BinaryTreeNode();
        ptr = root;

        if (ptr == null) {
            System.out.println("the tree is empty");

        }
        while (ptr != null) {


            while (ptr != null) {
                temp.push(ptr);
                ptr = ptr.getLeft();
            }

            while (true) {
                if (!temp.isEmpty()) {
                    ptr = temp.pop();
                    System.out.println("processed item  " + ptr.getData());
                    if (ptr.getRight() != null) {
                        ptr = ptr.getRight();
                        break;
                    }
                    if (ptr.getRight() == null && temp.isEmpty()) {
                        ptr = null;
                        break;
                    }
                } else {
                    break;
                }
            }

        }
    }

    public void postorder() {

        temp = new Stack<BinaryTreeNode>();
        BinaryTreeNode ptr = new BinaryTreeNode();
        ptr = root;

        if (ptr == null) {
            System.out.println("the tree is empty");

        }
        while (ptr != null) {

            while (ptr != null) {
                temp.push(ptr);
                if (ptr.getRight() != null) {
                    temp.push(ptr.getRight());
                    ptr.getRight().signholder = -1;
                }
                ptr = ptr.getLeft();

            }
            while (true) {
                if (!temp.isEmpty()) {
                    ptr = temp.pop();
                    if (ptr.signholder == -1) {
                        ptr.signholder=0;
                        break;
                    } else {
                        System.out.println("Processed Value " + ptr.getData());

                    }
                }
            }

        }
    }
}
