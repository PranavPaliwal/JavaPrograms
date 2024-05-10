public class Intersectionof2LL {
    public static class Node {
        int data;
        Node next;

        Node(int value) {
            this.data = value;
        }
    }

    public static Node intersection(Node head1, Node head2) {
        Node current1 = head1;
        Node current2 = head2;
        int m = 0;
        int n = 0;
        // Calculate the sizes of both linked lists
        while (current1 != null) {
            m++;
            current1 = current1.next;
        }
        while (current2 != null) {
            n++;
            current2 = current2.next;
        }
        current1 = head1;
        current2 = head2;
        // Traverse the longer list till they become of equal length
        if (m > n) {
            for (int i = 1; i <= m - n; i++) {
                current1 = current1.next;
            }
        } else {
            for (int j = 1; j <= n - m; j++) {
                current2 = current2.next;
            }
        }
        // Traverse both lists until an intersection node is found
        while (current1 != null && current2 != null) {
            if (current1 == current2) {
                return current1; // Found the intersection node
            }
            current1 = current1.next;
            current2 = current2.next;
        }
        return null; // No intersection found
    }

    public static void main(String[] args) {
        // Define the first linked list: 4 -> 1 -> 8 -> 4 -> 5
        Node l1 = new Node(4);
        l1.next = new Node(1);
        l1.next.next = new Node(8);
        l1.next.next.next = new Node(4);
        l1.next.next.next.next = new Node(5);
    
        // Define the second linked list: 5 -> 6 -> 1 -> 8 -> 4 -> 5
        Node l2 = new Node(5);
        l2.next = new Node(6);
        l2.next.next = new Node(1);
        l2.next.next.next = new Node(8);
        l2.next.next.next.next = new Node(4);
        l2.next.next.next.next.next = new Node(5);
    
        // Find the intersection node
        Node ans = intersection(l1, l2);
    
        // Print the result
        if (ans != null) {
            System.out.println("Intersection node value: " + ans.data);
        } else {
            System.out.println("No intersection found");
}
}
}