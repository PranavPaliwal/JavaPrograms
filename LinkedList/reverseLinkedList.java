public class reverseLinkedList {

    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static Node head;

    void add(int data){
        Node newNode =new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }


   static Node reverse(Node head){

    Node temp=null;
    Node curr=head;

    while(curr!=null){
        Node next=curr.next;
        curr.next=temp;
        temp=curr;
        curr=next;
        }
        return temp;
    }

     void print(Node head){
        if(head==null) return;

        Node temp=head;

        while (temp!=null) {
            System.out.print(temp.data);
            System.out.print("->");
            temp=temp.next;
            if(temp==null){
                System.out.println("null");
            }
        }
    }


    public static void main(String[] args) {

        reverseLinkedList ll=new reverseLinkedList();

        ll.add(7);
        ll.add(5);
        ll.add(3);
        ll.add(1);


        ll.print(head);
        
    }
    
}
