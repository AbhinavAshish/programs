package tree.binarytreeforsubtree;

/**
 * Created by Abhinav on 1/13/2016.
 */
public class TreeImplementation {
    public static void main(String[] args){
        BinaryTree tree = new BinaryTree(20);
        tree.addNode(tree.root, 20);
        tree.addNode(tree.root, 8);
        tree.addNode(tree.root, 4);
        tree.addNode(tree.root, 12);
        tree.addNode(tree.root, 10);
        tree.addNode(tree.root, 14);
        tree.addNode(tree.root, 22);
        BinaryTree b2 = new BinaryTree(8);
        b2.addNode(b2.root,4);
        b2.addNode(b2.root,12);
        b2.addNode(b2.root,10);
        b2.addNode(b2.root,14);

        tree.isSubtree(b2);

    }

}
