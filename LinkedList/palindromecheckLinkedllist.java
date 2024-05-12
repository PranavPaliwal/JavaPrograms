//Java code to check that a Linked List is a palindrome or not!!!!

public class palindromecheckLinkedllist {
    public static class Node{
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
     

    //Method to reverse a Linked list!
    public Node reverse(Node head){

        if(head==null)
        return null;

        Node temp=null;
        Node curr=head;

        while(curr!=null){
            Node nextNode=curr.next;
            curr.next=temp;
            temp=curr;
            curr = nextNode;
        }
        return temp;
    }

    //Method to find a Middle element of the linked list (using slow fast pointer)
    public Node Mid(Node head){

        if(head==null)
        return null;

        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public void addf(int data){
        Node newNode= new Node(data);
        size++;

        if(head==null){
        head=tail=newNode;
        }
        newNode.next=head;
        head=newNode;
    }


    public void addl(int data){
        Node newNode=new Node(data);
        size++;

        if(head==null){
            head=tail=newNode;
        return;
        }
        tail.next=newNode;
        tail=newNode;
    }


    //Method to check
    public boolean checkpalindrome(Node head){


        if(head==null || head.next==null)
        return true;

        // step 1= find mid.

        Node mid=Mid(head);

        // step 2=reverse 2nd half

        Node right=reverse(mid);
        Node left=head;

        // step 3= check both halves.

        while(right!=null){
            if(left.data != right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }

    public void printll(Node head){
        if(head==null){
            System.out.println("ll's head is Null");
        }
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }

    public static void main(String[] args) {
        Linkedllist ll=new Linkedllist();
        ll.addf(1);
        ll.addl(2);
        ll.addl(2);
        ll.addl(1);
        ll.printll(head);
        System.out.println();
        System.out.println(ll.checkpalindrome(head));
    }
}
