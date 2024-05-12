// java code to initialize the linked list and Adding a node at the first, last and middle!



/*
Node Class:
The Node class is a static nested class representing a node in the linked list.
It has two fields: int data to store the data of the node, and Node next to store
the reference to the next node in the list.

The constructor public Node(int data) initializes a new node
 with the given data and sets the next reference to null.
  */

public class InitializingLinkedList {

    public static class Node{

        int data;
        Node next;

        public Node (int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;
    public static Node tail;

    public void add_first(int data){

        //Step 1: Create a new Node.
        //syntax- Class Name(Node) Object Name(newNode)= (keyword)new pass-data-in-constructor.
        Node newNode=new Node(data);


        if(head==null){
            head=tail=newNode;
            return;
        }


        //step 2: Assign next of newNode to head.
        newNode.next=head; //linking

        //step 3: Assign head to newNode.
        head=newNode;
    }

    public void add_last(int data){

        Node newNode=new Node(data);

        if(head == null){
        head=tail=newNode;
        return;
    }

    tail.next=newNode;
    tail=newNode;
    }

    public void printList(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }


    /* The main method creates an instance of the LinkedList class 
    and demonstrates the usage of add_first and add_last methods
     by adding nodes to the linked list.*/

    public static void main(String[] args) {

    InitializingLinkedList ll = new InitializingLinkedList();

    ll.add_first(2);
    ll.add_first(1);
    ll.add_last(3);
    ll.add_last(4);
    
    ll.printList(head);
    }
}
