package linkedlist;

/**
 * Created by Abhinav on 12/25/2015.
 */

import java.util.Scanner;

public class SinglyLinkedlist {
    public static void main (String[] args){
        LinkedList  listOne = new LinkedList();

        listOne.insertAtEnd(5);
        listOne.insertAtEnd(10);
        listOne.insertAtEnd(15);
        listOne.insertAtStart(15);
        listOne.insertAtPos(11,2);
        listOne.insertAtPos(12,4);
        listOne.display();
        listOne.deleteAtPos(1);
        listOne.display();
        listOne.deleteAtPos(2);
        listOne.display();
       listOne.deleteAtPos(4);
        listOne.display();
        listOne.deleteAtPos(1);
        listOne.display();
        System.out.println(listOne.size);
    }

}
