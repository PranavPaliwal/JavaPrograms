 import java.util.*;

public class pushBottom {


    static void pushB(Stack <Integer> s, int data){

        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        // using recursion here
        pushB(s, data);
        s.push(top);
    }

    public static void main(String[] args) {
        Stack <Integer> s=new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        pushB(s, 0);
        while (!s.isEmpty()) {

            System.out.println(s.pop());
            
        }
    }
    
}
