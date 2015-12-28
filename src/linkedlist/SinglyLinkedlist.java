package linkedlist;
import java.util.Arrays.*;
/**
 * Created by Abhinav on 12/25/2015.
 */

import java.util.Scanner;

public class SinglyLinkedlist {
    public static void main (String[] args){


        LinkedList listFive= new LinkedList();
        listFive.insertAtStart(1);
        listFive.insertAtStart(2);
        listFive.insertAtStart(3);
        listFive.insertAtStart(4);
        listFive.insertAtStart(2);
        listFive.insertAtStart(1);
        System.out.println(listFive.palindromeCheck());

        CircularLinkedList listFour= new CircularLinkedList();
        listFour.insertAtStart(1);
        listFour.insertAtStart(2);
        listFour.insertAtStart(3);
        listFour.insertAtStart(4);
        listFour.insertAtStart(5);
        //listFour.makeCircular(2,2);
        //listFour.displayCircular();
        //System.out.println(listFour.findCircular(listFour.));


        /*
        LinkedList  listOne = new LinkedList();
        LinkedList  listTwo = new LinkedList();
        LinkedList listThree = new LinkedList();


        listOne.insertAtStart(1);
        listOne.insertAtStart(2);
        listOne.insertAtStart(3);
        listOne.insertAtStart(4);
        listOne.insertAtStart(5);
        listOne.display();
        System.out.println(listOne.reverseSum());

        listTwo.insertAtStart(6);
        listTwo.insertAtStart(7);
        listTwo.insertAtStart(8);
        listTwo.insertAtStart(9);
        listTwo.insertAtStart(3);
        listTwo.display();
        System.out.println(listTwo.reverseSum());

        listThree.createnewListReverse(listOne.reverseSum() + listTwo.reverseSum());
*/
        //listThree.display();
        //listOne.deleteDuplicatesWithoutBuffer();
        //listOne.display();
        //listOne.deleteElementCountedfromLast(3);
        //listOne.display();
        //Node tr;
        //tr =listOne.returnNodeatPos(3);
        //listOne.deletenode(tr);
        //listOne.display();
        //listOne.sortAtVal(35);
        //listOne.display();

    }

}
