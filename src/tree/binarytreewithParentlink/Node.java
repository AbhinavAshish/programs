package tree.binarytreewithParentlink;

/**
 * Created by Abhinav on 1/11/2016.
 */
public class Node {
    int val;
    Node left;
    Node right;
    Node parent;
    public Node(int val){
        this.val=val;
        this.left=null;
        this.right=null;
        this.parent=null;
    }
}
