public class circularQueueUsingArray {
    static class Queue{
        static int arr[];
        static int size;
        static int rear;
        static int front;

        public Queue(int n){
            arr=new int[n];
            size=n;
            rear=-1;
            front=-1;
        }

        static boolean isEmpty(){
            return rear==-1 && front==-1;        
        }

        static boolean isFull(){
            return (rear+1)%size==front;
        }

        static void add(int data){
            if(isFull()){
                System.out.println("-- Queue is Full --");
                return;
            }

            if(front == -1){
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;
        }

        static int remove(){
            if(isEmpty()){
                System.out.println("-- Queue is Empty --");
                return -1;
            }
            int first=arr[front];
            
            if(rear==front){
                front=rear=-1;
            }
            else{
            front=(front+1)%size;
            }
            return first;
        }

        static int peek(){
            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue q=new Queue(3);

        q.add(1);
        q.add(2);
        System.out.println(q.peek());
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
        q.remove();
        
    }

}
