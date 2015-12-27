package linkedlist;

/**
 * Created by Abhinav on 12/25/2015.
 */

import java.util.Scanner;

public class SinglyLinkedlist {
    public static void main (String[] args){
        LinkedList  listOne = new LinkedList();
        listOne.insertAtStart(10);
        listOne.insertAtStart(20);
        listOne.insertAtStart(30);
        listOne.insertAtStart(40);
        listOne.insertAtStart(30);
        listOne.insertAtStart(40);
        listOne.insertAtStart(10);
        listOne.insertAtStart(40);
        listOne.insertAtStart(50);
        listOne.insertAtStart(70);
        listOne.insertAtStart(40);
        listOne.insertAtStart(40);
        listOne.insertAtStart(40);
        listOne.insertAtStart(40);
        listOne.display();
        listOne.deleteDuplicatesWithoutBuffer();
        listOne.display();
        listOne.deleteElementCountedfromLast(3);
        listOne.display();
        Node tr;
        tr =listOne.returnNodeatPos(3);
        listOne.deletenode(tr);
        listOne.display();
    }

}
