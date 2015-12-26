package linkedlist;

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

}




