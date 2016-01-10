package tree.binarySearchTree;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

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

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        int[] arr = {1, 5, 6, 4, 3, 2,7,8,9};
        Arrays.sort(arr);
        tree.add(arr, 0, arr.length - 1);
        //System.out.println(tree.root.val);
        tree.preorderTraverseTree(tree.root);
    }
}
