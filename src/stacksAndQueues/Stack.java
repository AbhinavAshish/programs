package stacksAndQueues;

/**
 * Created by Abhinav on 12/28/2015.
 */
public class Stack {
    private int[] stack;
    private int top;
    private int maxsize;
    private int min;
    public Stack(int maxsize) {
        this.maxsize = maxsize;
        stack = new int[maxsize];
        top = -1;
        min=5000;
    }

    public int top() {
        //stackNumber=stackNumber-1;
        //System.out.println("intop");
        if (top == -1) {
            System.out.println("Stack is empty");
            return 0;
        } else {
            return stack[top];
        }

    }

    public void push(int value) {

        if (top == maxsize - 1) {
            System.out.println("Stack is full");
        } else {
            top = top + 1;
            stack[top] = value;
            if (min>value){min=value;}
        }
    }

    public void pop() {

        if (top == -1) {
            System.out.println("Stack is Empty");
        } else{
            stack[top] = 0;
            top = top - 1;

        }

    }

    public int min(){
        if (min==5000){
            System.out.println("Stack is empty");
            return 0;
        }
        else{
            return min;
        }
    }
}
