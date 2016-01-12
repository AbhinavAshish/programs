package tree.binarySearchTree;

import searching.BinarySearch;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by Abhinav on 1/10/2016.
 */
public class BinarySearchTree {
    static Node root;


    static void add(int[] arr, int f, int l) {
        //Node node1= node;
        int mid = (f + l) / 2;
       // System.out.println("first" + f);
        //System.out.println("mid" +  mid);
        //System.out.println("last" + l);
        //System.out.println(arr[mid]);
        addNode(root, arr[mid]);

        if (mid!=f){add(arr, f, mid - 1);}
           // System.out.println("hi");
         if(mid!=l){
            add(arr, mid + 1, l);

        }
    }

    static void addNode(Node node, int val) {

        if (root == null) {
            node = new Node(val);
            root = node;
            return;
        }

        Node focusnode = root;
        if (node.val > val) {
            if (node.left == null) {
                node.left= new Node(val);
            } else {
                node = node.left;
                addNode(node, val);
            }
        } else {
            if (node.right == null) {
                node.right= new Node(val);

            } else {
                node = node.right;
                addNode(node, val);
            }
        }


    }

    public void preorderTraverseTree(Node focusNode) {

        if (focusNode != null) {

            System.out.println(focusNode.val);
            preorderTraverseTree(focusNode.left);
            preorderTraverseTree(focusNode.right);

        }

    }

    static int MAX,MIN;

    public void preorderTraverseLink(Node focusNode) {

        if (focusNode != null) {

            System.out.println(focusNode.val);
            preorderTraverseTree(focusNode.left);
            preorderTraverseTree(focusNode.right);

        }
    }


    public static int heightoftree(){
        return height(root)-1;
    }

    private static int height (Node node) {
        int height = 0;
        if (node == null) {
            return height = 0;
        } else {
            height = Math.max(height(node.left), height(node.right)) + 1;
            return height;
        }
    }

    public static boolean isBST(){
        return isBST(root);
    }

    static boolean  isBST(Node node){
        return isBSTUtil(node ,MIN,MAX);
    }

    static int count=0;

    static boolean isBSTUtil(Node node, int MIN,int MAX){

        if (node == null){return true;}
        else{
            if (node.val<MIN || node.val>MAX){return false;}

            else{
                return (isBSTUtil(node.left,MIN,(node.val-1)) &&  isBSTUtil(node.right,(node.val+1),MAX));
            }

        }


    }
    static void createLinkedList(BinarySearchTree tree){
        int v= heightoftree();
        LinkedList<Integer> links[] = new LinkedList[v];

    }
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        int[] arr = {1, 5, 6, 4, 3, 2,7,8,9};
        //int[] arr = {1,2,3,4};
        Arrays.sort(arr);
        tree.add(arr, 0, arr.length - 1);
        //System.out.println(tree.root.val);
        //tree.preorderTraverseTree(tree.root);
        //System.out.println(root.val);
        MAX= 9;
        MIN= 1;
        System.out.println(tree.isBST());

    }
}
