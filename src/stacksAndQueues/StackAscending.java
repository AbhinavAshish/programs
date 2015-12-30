package stacksAndQueues;

import java.util.Stack;

/**
 * Created by Abhinav on 12/30/2015.
 */
public class StackAscending {
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public StackAscending() {
        stack1 = new Stack<Integer>();
        stack2 = new Stack<Integer>();
    }

    public void enqueue(int val) {
        stack1.push(val);
    }

    public void ascending() {
        int counter1 = stack1.size();
        int counter2 = 0;
        int temp1, temp2;

        for (int i = 0; i <counter1; i++) {
            temp1 = stack1.pop();
            //counter1++;
            if (stack2.empty() || temp1 <= stack2.peek()) {
                stack2.push(temp1);
            } else {

                while (!stack2.isEmpty()) {
                    if (temp1 > stack2.peek()) {
                        temp2 = stack2.pop();
                        counter2++;
                        stack1.push(temp2);
                    } else {
                        break;
                    }
                }
                stack2.push(temp1);
                while (counter2 > 0) {
                    temp1 = stack1.pop();
                    stack2.push(temp1);
                    counter2--;
                }
            }
        }

        stack1=stack2;
    }


    public void display(){
        System.out.println(stack1);
        //System.out.println(stack2);
    }




}

