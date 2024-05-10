import java.util.*;

// Stcak Implementation Using Linked List!

public class stackusingLL {


    static class Node{
        int data;
        Node next;
        Node (int data){
            this.data=data;
            this.next=null;
        }
    }

    static class stack{

        static Node head=null;

        public static boolean isEmpty(){
            return head==null;
        }
        public static void push(int data){

            Node newNode=new Node(data);

            if(isEmpty()){
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;

        }
        public static int pop(){

            if(isEmpty()){
                return -1;
            }
            int top=head.data;
            head=head.next;
            return top;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        
        stack s=new stack();
        s.push(6);
        s.push(5);
        s.push(4);
        s.push(3);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
            
        }
    }
    
}