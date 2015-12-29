package stacksAndQueues;

import java.util.*;
import java.util.Arrays.*;

/**
 * Created by Abhinav on 12/28/2015.
 */
public class SetofStacks {
    ArrayList<Stack> stacks = new ArrayList<Stack>();
    public int capacity;

    public SetofStacks(int capacity) {
        this.capacity = capacity;
    }

    public Stack getLastStack() {
        if (stacks.size() == 0) {
            return null;
        }
        return stacks.get(stacks.size() - 1);
    }

    public void push(int val) {
        Stack last = getLastStack();
        if (last != null && !last.isFull()) {
            last.push(val);
        } else {
            last = new Stack(capacity);
            last.push(val);
            stacks.add(last);
        }
    }

    public void pop() {
        Stack last = getLastStack();
        //System.out.println(last);
        if (last == null) {
            System.out.println("The list is empty");
        } else {
            last.pop();
            if (last.isEmpty()) {
                stacks.remove(stacks.size() - 1);
            }
        }
    }

//Rempving from different subssets of stack
    public void popAt(int index){
        Stack stack = stacks.get(index-1);
        //System.out.println(stack);
        if (stack==null){
            System.out.println("the list is empty");
        }else {
            stack.pop();
            if (stack.isEmpty()) {
                stacks.remove(index-1);
            }
        }
    }




    public void display(){
        Stack last = getLastStack();

        if (last==null) {
            System.out.println("List is empty");
        }else {
            System.out.println(last.top());
        }


    }


}


