class linkedlist{
    
    class Node{
        int val;
        Node next;

        public Node(int val){
            this.val=val;
            this.next=null;
        }
    }
    public Node head;
    public Node tail;

    public void add(int data){
        if(head==null){
            head=new Node(data);
            tail=head;
            return;
        }
        tail.next=new Node(data);
        tail=tail.next;
    }
    void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String args[]){
        linkedlist l=new linkedlist();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.print();
    }

}