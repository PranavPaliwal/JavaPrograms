// Not Using Extra Memeory using recursion
import java.util.*;

public class reverseStack {
    

    static void pushB(Stack<Integer> s, int val){

        if(s.isEmpty()){
            s.push(val);
            return;
        }
        int top=s.pop();
        pushB(s, val);
        s.push(top);
    }

    static void revStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        revStack(s);
        pushB(s, top);
    }

    static void printStack(Stack<Integer>s){

        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();


        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

       
        revStack(s);
        printStack(s);
        

    }
}
