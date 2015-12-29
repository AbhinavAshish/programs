package stacksAndQueues;

/**
 * Created by Abhinav on 12/28/2015.
 */
public class StackSolutions {
    public static void main(String[] args){
        TripleStack stack1 = new TripleStack(2);

        stack1.push(1,20);
        System.out.println(stack1.top(1));
        stack1.push(1,30);
        System.out.println(stack1.top(1));
        stack1.push(2,30);
        System.out.println(stack1.top(2));
        stack1.push(2,40);
        System.out.println(stack1.top(2));
        stack1.push(3,50);
        System.out.println(stack1.top(3));
        stack1.push(3,60);
        System.out.println(stack1.top(3));
        
        stack1.pop(1);
        System.out.println(stack1.top(1));
        stack1.pop(1);
        System.out.println(stack1.top(1));
        stack1.pop(2);
        System.out.println(stack1.top(2));
        stack1.pop(2);
        System.out.println(stack1.top(2));
        stack1.pop(3);
        System.out.println(stack1.top(3));
        stack1.pop(3);
        System.out.println(stack1.top(3));


    }
}
