package stacksAndQueues;

/**
 * Created by Abhinav on 12/28/2015.
 */
public class TripleStack {
    private int[] stack;
    private int[] top = new int[3];
    private int maxsize;

    public TripleStack(int maxsize) {
        this.maxsize=maxsize;
        stack = new int[maxsize*3];
        for (int i=0;i<3;i++){top[i]=-1;}
    }

    public int top(int stackNumber){
        stackNumber=stackNumber-1;
        //System.out.println("intop");
        if (top[stackNumber]==-1){
            System.out.println("Stack is empty");
            return 0;
        }
        if (stackNumber==0){ return stack[top[stackNumber]];}
        if (stackNumber==1){ return stack[top[stackNumber]+maxsize];}
        if (stackNumber==2){ return stack[top[stackNumber]+maxsize*2];}
        return 0;
    }

    public void push (int stackNumber,int value){

        stackNumber=stackNumber-1;
        if (top[stackNumber]== maxsize-1){
            System.out.println("Stack is full");
        }
        if (stackNumber==0 && top[stackNumber]!= maxsize-1){
            top[stackNumber]= top[stackNumber] + 1;
            stack[top[stackNumber]]= value;
        }

        if (stackNumber==1 && top[stackNumber]!= maxsize-1){
            top[stackNumber]= top[stackNumber] + 1;
            stack[top[stackNumber]+maxsize]= value;
        }

        if (stackNumber==2 && top[stackNumber]!= maxsize-1){
            top[stackNumber]= top[stackNumber] + 1;
            stack[top[stackNumber]+maxsize*2]= value;
        }
    }

    public void pop (int stackNumber){

        stackNumber=stackNumber-1;
        if (top[stackNumber]== -1){
            System.out.println("Stack is Empty");
        }
        if (stackNumber==0 && top[stackNumber]!= -1){
            stack[top[stackNumber]]= 0;
            top[stackNumber]= top[stackNumber] - 1;

        }

        if (stackNumber==1 && top[stackNumber]!= -1){
            stack[top[stackNumber]+maxsize]= 0;
            top[stackNumber]= top[stackNumber] - 1;
        }

        if (stackNumber==2 && top[stackNumber]!= -1){
            stack[top[stackNumber]+maxsize*2]= 0;
            top[stackNumber]= top[stackNumber] - 1;       }
    }

    public void display() {
        for (int i = 0; i < maxsize*3; i++) {
            System.out.println(stack[i]);
        }
    }
}
