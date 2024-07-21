class reverseLinkedList{

    static class Node{

        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }


    public static Node head;
    public static Node tail;
    public static int size;


    public static void addNode(int val){
        if(head==null){
            head=new Node(val);
            tail=head;
            size++;
        }
        else{
            Node newNode=new Node(val);
            tail.next=newNode;
            tail=newNode;
            size++;
        }
    }

    public static Node reverseList(Node head){
        Node curr=head;
        Node temp=null;

        while(curr!=null){
            Node next=curr.next;
            curr.next=temp;
            temp=curr;
            curr=next;
        }
        return temp;
    }

    public static void printll(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" -> ");
            curr=curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        reverseLinkedList list=new reverseLinkedList();

        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        System.out.println(" before reverse");
        printll(head);
        System.out.println();
        System.out.println(" after reverse");
        head=reverseList(head);
        printll(head);

    }
}