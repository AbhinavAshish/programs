package linkedlist;

/**
 * Created by Abhinav on 12/28/2015.
 */
public class CircularLinkedList {

    protected Node start;
    protected Node end;
    public int size;


/* Constructor

 */

    public CircularLinkedList() {
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

    public void displayCircular() {
        if (size == 0) {
            System.out.println("Empty List");
            return;
        }
        if (start.getLink() == null) {
            System.out.println(start.getData());
            return;
        }

        Node ptr = start;
        System.out.println(size);
        for (int i = 1; i <= size + 4; i++) {
            System.out.print(ptr.getData() + "-->");
            ptr = ptr.getLink();

        }
        System.out.println(ptr.getData());

    }


    public void makeCircular(int pos1, int pos2) {
        Node temp1, temp2;
        temp1 = start;
        temp2 = start;

        for (int i = 1; i < size; i++) {
            if (i < pos1) {
                temp1 = temp1.getLink();
            }
            if (i == pos2) {
                temp2.setLink(temp1);
                break;
            }

            temp2 = temp2.getLink();
        }

    }


    public int findCircular() {
        Node temp1 = start;
        Node temp2 = start.getLink();
        for (int j = 1; j < size; j++) {
            for (int i = j+1; i <= size; i++) {
                if (temp1 == temp2) {
                 return j;
                }
                temp2=temp2.getLink();
            }
            temp1=temp1.getLink();
            temp2=temp1.getLink();
        }
    return 0;
    }

}