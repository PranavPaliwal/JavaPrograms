// java code for addInTheMiddle
public class addInTheMiddle {
    
    public static class Node{

        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;
    public static int size;

    public void addf(int data){
        Node newNode= new Node(data);
        size++;

        if(head==null){
        head=newNode;
        return;
        }
        newNode.next=head;
        head=newNode;
    }

    
    public void add(int index,int data){
        Node newNode=new Node(data);
        size++;
        if(index==0){
            addf(data);
            return ;
        }
        Node temp=head;
        int i=0;
        while(i<index-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }

    public void printll(){
        if(head==null){
            System.out.println("ll's head is Null");
        }
        while(head!=null){
            System.out.print(head.data+"->");
            head=head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        addInTheMiddle ll=new addInTheMiddle();

        ll.add(0,1);
        ll.add(1, 2);
        ll.printll();
    }
}
