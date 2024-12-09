import java.util.*;

public class stackUsingTwoQueue {

    static class Stack {
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        static boolean isEmpty() {
            return q1.isEmpty() && q2.isEmpty();
        }

        static void push(int data) {
            if (!q1.isEmpty()) {
                q1.add(data);
            } else {
                q2.add(data);
            }
        }

        static int pop() {
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return -1;
            }

            int top = -1;
            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.remove();
                    if (q1.isEmpty()) {
                        break;
                    }
                    q2.add(top);
                }
            } else {
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    if (q2.isEmpty()) {
                        break;
                    }
                    q1.add(top);
                }
            }
            return top;
        }

        static int peek() {
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return -1;
            }
            int top = -1;
            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.peek();
                    q2.add(q1.remove());
                }
            } else {
                while (!q2.isEmpty()) {
                    top = q2.peek();
                    q1.add(q2.remove());
                }
            }
            return top;
        }
    }
        public static void main(String[] args) {
            Stack s=new Stack();
            s.push(5);
            s.push(6);
            s.push(7);
            s.push(8);

            while(!s.isEmpty()){
                System.out.println(s.peek());
                s.pop();
            }
        }
}