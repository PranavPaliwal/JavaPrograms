public class removeFirstinLL {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public static void addNode(int val) {
        if (head == null) {
            head = new Node(val);
            tail = head;
        } else {
            tail.next = new Node(val);
            tail = tail.next;
        }
    }

    public static Node removeFirst() {
        if (head == null) {
            System.out.println("List is Empty");
            return null;
        }

        Node temp = head;
        head = head.next;
        return temp;
    }

    public static void printLL() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        removeFirstinLL ll = new removeFirstinLL();

        ll.addNode(1);
        ll.addNode(2);
        ll.addNode(3);
        ll.addNode(4);
        ll.addNode(5);

        System.out.println("before");
        ll.printLL();

        Node removedNode = ll.removeFirst();
        if (removedNode != null) {
            System.out.println("Removed Node: " + removedNode.data);
        }

        System.out.println("after");
        ll.printLL();
    }
}
