package tree.binarytreeforsubtree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

/**
 * Created by Abhinav on 1/13/2016.
 */
public class BinaryTree {
    Node root;
    //Stack<Integer> stack1= new Stack<Integer>();
    public BinaryTree(int val) {
    addNode(root,val);
    }


    public void addNode(Node focusNode,int val) {
        if (root == null) {
            root = new Node(val);
        }else {
            if (focusNode.val>val){
                if (focusNode.left==null){
                    focusNode.left= new Node(val);
                }else{
                    addNode(focusNode.left,val);
                }
            }else{
                if (focusNode.right==null){
                    focusNode.right= new Node(val);
                }else{
                    addNode(focusNode.right,val);
                }

            }
        }

    }

    public void preorderTraverseTree(Node focusNode,ArrayList<Integer> arr) {

        if (focusNode != null) {
            //System.out.println(focusNode.val);
            arr.add(focusNode.val);
            preorderTraverseTree(focusNode.left, arr);
            preorderTraverseTree(focusNode.right,arr);

        }
    }
    static Node temp;

    public Node findNode(Node focusNode, int val) {

        if (focusNode != null) {
            if (focusNode.val == val) {
                temp = focusNode;
            }

            findNode(focusNode.left, val);
            findNode(focusNode.right, val);

        }
        return temp;
    }

    public void isSubtree(BinaryTree tree){
        temp= null;
        Node node = findNode(root,tree.root.val);
        if (node== null){
            System.out.println("The sub tree is not there");
        }else {
            ArrayList<Integer> arr1 = new ArrayList<Integer>();
            ArrayList<Integer> arr2= new ArrayList<Integer>();
            preorderTraverseTree(node,arr1);
            preorderTraverseTree(tree.root,arr2);
            if(arr1.equals(arr2)){
                System.out.println(" The subtree is present");
            }else{
                System.out.println(" The subtree is not");

            }

        }

    }
}
