class Node {
    public int data;
    public Node next;

    Node() {
        this.data = 0;
        this.next = null;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
    }

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

public class LenghtOfLinkedList {
    public static int length(Node head) {
        int count = 0; // Initialize a counter to keep track of the number of nodes

        // Traverse the linked list until the end (null is reached)
        while (head != null) {
            count++; // Increment the count for each node encountered
            head = head.next; // Move to the next node
        }

        return count; // Return the count, which represents the length of the linked list
    }

    public static void main(String[] args) {
        // Creating a linked list: 1 -> 2 -> 3 -> 4 -> null
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        // Calculating the length of the linked list
        int length = length(head);

        // Displaying the length of the linked list
        System.out.println("Length of the linked list is: " + length);
    }
}
