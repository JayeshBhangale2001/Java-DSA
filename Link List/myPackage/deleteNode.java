package myPackage;

class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
    }
}

public class deleteNode {
    public static Node<Integer> deleteNode(Node<Integer> head, int pos) {
        // Check if the list is empty
        if (head == null) {
            return null;
        }

        if (pos == 0) {
            // If the node to delete is at position 0 (head)
            head = head.next;
            return head;
        } else {
            int i = 0;
            Node<Integer> previousNode = head;

            // Iterate until i reaches pos - 1
            while (i < pos - 1 && previousNode.next != null) {
                i++;
                previousNode = previousNode.next;
            }

            // Check if pos is within the bounds of the list
            if (previousNode.next == null || previousNode.next.next == null) {
                return head; // Position out of bounds
            }

            // Delete the node at position pos
            previousNode.next = previousNode.next.next;
        }
        return head;
    }

    public static void main(String[] args) {
        // Example usage
        Node<Integer> head = new Node<>(1);
        head.next = new Node<>(2);
        head.next.next = new Node<>(3);
        head.next.next.next = new Node<>(4);

        System.out.println("Original List:");
        printLinkedList(head);

        int positionToDelete = 2;
        head = deleteNode(head, positionToDelete);

        System.out.println("\nList after deleting node at position " + positionToDelete + ":");
        printLinkedList(head);
    }

    // Helper function to print the linked list
    public static void printLinkedList(Node<Integer> head) {
        Node<Integer> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
