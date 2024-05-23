class Intersectionof2LL {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node intersecitonNode(Node head1, Node head2){

        while(head2!=null){
            Node temp=head1;
            while(temp!=null){
                if(head2==temp){
                    return head2;
                }
                temp=temp.next;
            }
            head2=head2.next;
        }
        return null;
    }

    public static void main(String[] args) {
        Intersectionof2LL node=new Intersectionof2LL();

        Node head1,head2;

        head1=new Node(1);
        head2=new Node(2);
         
        Node newNode=new Node(3);
        head1.next=newNode;

        newNode =new Node(4);
        head2.next=newNode;

        newNode=new Node(8);
        head1.next.next=newNode;

        newNode=new Node(6);
        head1.next.next.next=newNode;

        newNode=new Node(5);
        head2.next.next=newNode;
        head1.next.next.next.next=newNode;

        newNode=new Node(10);
        head1.next.next.next.next.next=newNode;

        newNode=new Node(15);
        head2.next.next.next=newNode;



        Node head=node.intersecitonNode(head1, head2);
        System.out.println("Intersection node of the two Linked List is->"+head.data);
    }

}