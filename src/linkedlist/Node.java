package linkedlist;

/**
 * Created by Abhinav on 11/12/2015.
 */

import java.util.Scanner;

public class Node {
    public int data;
    public Node link;


    public Node() {
        link = null;
        data = 0;
    }

    public Node(int d, Node n) {
        data = d;
        link = n;
    }

    public Node(int d) {
        data = d;

    }

    public Node(Node n) {
        link = n;
    }

    public Node getLink() {
        return link;
    }

    public int getData() {
        return data;
    }

    public void setLink(Node n) {
        link = n;
    }

    public void setData(int d) {
        data = d;
    }

}
