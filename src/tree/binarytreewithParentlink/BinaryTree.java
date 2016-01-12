package tree.binarytreewithParentlink;

/**
 * Created by Abhinav on 1/11/2016.
 */
public class BinaryTree {

    static Node root;

    static void add(int val) {

        addNode(root, val);
    }

    static void addNode(Node node, int val) {

        if (root == null) {
            node = new Node(val);
            root = node;
            return;
        }


        if (node.val > val) {
            if (node.left == null) {
                Node temp = new Node(val);
                node.left = temp;
                temp.parent = node;
            } else {
                addNode(node.left, val);
            }
        } else {
            if (node.right == null) {
                Node temp = new Node(val);
                node.right = temp;
                temp.parent = node;
            } else {
                addNode(node.right, val);
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

    static int min;

    public int min(Node focusNode) {
        min = focusNode.val;
        //System.out.println(min);
        min = minutil(focusNode, min);

        return min;
    }

    public int minutil(Node focusNode, int min) {
        if (focusNode != null) {

            if (min > focusNode.val) {
                min = focusNode.val;
            }
            min = minutil(focusNode.left, min);
            min = minutil(focusNode.right, min);

        }
        return min;
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


    public void inorderSuccesor(Node focusNode) {

        if (focusNode.right != null) {
            System.out.println(min(focusNode.right));
        } else {

            while (true) {
                //int temp = focusNode.val;
                //focusNode = focusNode.parent;
                if (focusNode == root) {
                    System.out.println("No inorder Successor");
                    return;
                }
                Node tempNode = focusNode.parent;
                if (tempNode.left == focusNode) {
                    System.out.println(tempNode.val);
                    return;
                } else {
                    focusNode = focusNode.parent;
                }
            }
        }


    }

    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();


        tree.add(20);
        tree.add(8);
        tree.add(4);
        tree.add(12);
        tree.add(10);
        tree.add(14);
        tree.add(22);
        Node node = tree.findNode(root,20);
        tree.inorderSuccesor(node);


    }
}