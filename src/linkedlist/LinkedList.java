package linkedlist;
import java.math.*;
import java.util.Arrays;
import java.util.Arrays.*;

/**
 * Created by Abhinav on 11/12/2015.
 */
public class LinkedList {
    protected Node start;
    protected Node end;
    public int size;


/* Constructor

 */

    public LinkedList() {
        start = null;
        end = null;
        size = 0;
    }

    public boolean isEmpty() {
        return start == null;
    }

    public int getSize() {
        return size;
    }

    public void insertAtStart(int val) {

        Node nptr = new Node(val, null);
        //System.out.println(nptr);
        size++;
        if (start == null) {

            start = nptr;
            end = start;

        } else {
            nptr.setLink(start);
            start = nptr;

        }
    }


    public void insertAtEnd(int val) {
        Node nptr = new Node(val, null);
        size++;
        if (end == null) {
            start = nptr;
            end = nptr;
        } else {
            end.setLink(nptr);
            end = nptr;

        }

    }

    public void insertAtPos(int val, int pos) {

        Node nptr = new Node(val, null);
        size++;
        Node temp = start;
        pos = pos - 1;
        for (int i = 1; i < size; i++) {
            if (i == pos) {
                nptr.setLink(temp.getLink());
                temp.setLink(nptr);
                break;
            }
            temp = temp.getLink();
        }
    }

    public void deleteAtPos(int pos) {
        if (pos == 1) {
            start = start.getLink();
            if (size == 1) {
                end = null;
            }
            size--;
        } else {
            Node temp1;
            Node temp2;
            temp1 = start;
            temp2 = start.getLink();
            for (int i = 2; i <= size; i++) {
                if (i == pos) {
                    temp1.setLink(temp2.getLink());
                    if (pos == size) {
                        end = temp1;
                    }
                    size--;
                    break;
                }
                temp1 = temp2;
                temp2 = temp2.getLink();

            }
        }
    }

    public void display() {
        if (size == 0) {
            System.out.println("Empty List");
            return;
        }
        if (start.getLink() == null) {
            System.out.println(start.getData());
            return;
        }

        Node ptr = start;
        while (ptr.getLink() != null) {
            System.out.print(ptr.getData() + "-->");
            ptr = ptr.getLink();

        }
        System.out.println(ptr.getData());

    }

    public void deleteDuplicatesWithoutBuffer() {
        Node temp1 = start;
        Node temp2 = start.getLink();

        for (int j = 1; j < size; j++) {
            temp2 = temp1.getLink();
            for (int i = j + 1; i <= size; i++) {
                if (temp1.getData() == temp2.getData()) {
                    deleteAtPos(i);
                    i--;

                }
                temp2 = temp2.getLink();
            }
            temp1 = temp1.getLink();
        }

    }


    public void deleteElementCountedfromLast(int k) {

        int val = size - k;
        deleteAtPos(val);
    }

    public Node returnNodeatPos(int pos) {
        Node temp = start;
        for (int i = 1; i <= size; i++) {
            if (i == pos) {
                return temp;
            }
            temp = temp.getLink();
        }
        temp = null;
        return temp;
    }

    public void deletenode(Node n) {
        Node temp = start;
        for (int i = 1; i <= size; i++) {
            if (temp == n) {
                deleteAtPos(i);
            }
            temp = temp.getLink();
        }
    }


    public void partition(int val) {
        Node temp = start;
        if (val < temp.getData()) {
            insertAtStart(val);
        } else {
            insertAtEnd(val);
        }
    }

    public void sortAtVal(int val) {

        Node altStart = null;
        Node altEnd = null;
        Node temp;
        for (int i=1;i<=size;i++) {
            temp = start;
            start= start.getLink();
            if (temp.getData() < val) {


                if (altStart == null) {
                    altStart = temp;
                    altEnd = temp;
                    temp.setLink(null);
                } else {
                    temp.setLink(altStart);
                    altStart = temp;

                }

            } else {

                if (altEnd == null) {
                    altStart = temp;
                    altEnd = temp;
                    temp.setLink(null);
                } else {
                    altEnd.setLink(temp);
                    altEnd = temp;
                    temp.setLink(null);
                }
            }

        }

        start= altStart;
        end = altEnd;
    }

    public int sum (){
        int sum=0;
        Node temp= start;
        for (int i=1;i<=size;i++){
            sum = (int) (sum + ((int)Math.pow(10,i-1))*temp.getData());
            temp=temp.getLink();
        }
        return sum;
    }
    public int reverseSum (){
        int sum=0;
        Node temp= start;
        for (int i=size;i>=1;i--){
            sum = (int) (sum + ((int)Math.pow(10,i-1))*temp.getData());
            //System.out.println(sum);
            temp=temp.getLink();
        }
        return sum;
    }

    //create a linked list with the value provided as its digits
    public void createnewList(int val){
        int valSize = String.valueOf(val).length();
        int temp;
        for (int i = 1; i<=valSize;i++){
            temp = val % 10;
            val = val /10;
            insertAtEnd(temp);
        }
    }

    //create a linked list with the value provided as its digits in reverse order
    public void createnewListReverse(int val){
        int valSize = String.valueOf(val).length();
        int temp;
        for (int i = 1; i<=valSize;i++){
            temp = val % 10;
            val = val /10;
            insertAtStart(temp);
        }
    }

    public boolean palindromeCheck(){
        int[] temp1 = new int[size/2];
        int[] temp2 = new int[size/2];
        Node temp=start;
        int val= size/2-1;
        for (int i = 0; i<size/2;i++){
            temp1[i]= temp.getData();
            temp= temp.getLink();
        }

        if(size%2 !=0 ){temp= temp.getLink();}

        for (int j = 0; j<size/2;j++) {
            temp2[val]=temp.getData();
            val--;
            temp= temp.getLink();
        }


        for (int j = 0; j<size/2;j++) {
            System.out.println(temp1[j]);
            System.out.println(temp2[j]);
        }

        return Arrays.equals(temp1, temp2);
    }


}





