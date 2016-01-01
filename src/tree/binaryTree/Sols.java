package tree.binaryTree;

import java.util.Stack;

/**
 * Created by Abhinav on 12/31/2015.
 */
public class Sols {
    public static void main(String[] args){
        BinaryTree btree = new BinaryTree();
        btree.insert(20);
        btree.insert(10);
        btree.insert(30);
        btree.insert(50);
        btree.insert(4);
        btree.insert(5);
        btree.insert(60);
        btree.insert(70);
        btree.insert(45);

        //btree.preorderTraversal();
        //btree.inorderTraversal();
        btree.postorder();
    }

}
