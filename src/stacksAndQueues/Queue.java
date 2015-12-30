package stacksAndQueues;

import java.util.Stack;

/**
 * Created by Abhinav on 12/30/2015.
 */
public class Queue {
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public Queue() {
        stack1 = new Stack<Integer>();
        stack2 = new Stack<Integer>();

    }

    public void enqueue(int val) {
        if (stack1.isEmpty()) {
            while (!stack2.isEmpty()) {
                stack1.push(stack2.pop());
            }
            stack1.push(val);
        } else{
            stack1.push(val);
        }

    }

    public void dequeue(){
        if (stack2.isEmpty()){
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
            System.out.println(stack2.pop());
        }else{ System.out.println(stack2.pop());}

    }

    public void display(){
        if (stack2.isEmpty()){
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
            System.out.println(stack2);
        }else{ System.out.println(stack2);}
    }


}
