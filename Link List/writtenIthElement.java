class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
    }
}

public class writtenIthElement {

    public static void printIthNode(Node<Integer> head, int i) {
        Node<Integer> temp = head;
        int j = 0;
        while (temp != null) {
            if (i == j) {
                System.out.println(temp.data);
            }
            j++;
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        // Creating nodes
        Node<Integer> node1 = new Node<>(1);
        Node<Integer> node2 = new Node<>(2);
        Node<Integer> node3 = new Node<>(3);
        Node<Integer> node4 = new Node<>(4);
        Node<Integer> node5 = new Node<>(5);

        // Linking nodes
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        // Head of the linked list
        Node<Integer> head = node1;

        // Calling the printIthNode method
        int i = 2; // Example: printing the 3rd node (index 2)
        System.out.println("Value at index " + i + ":");
        writtenIthElement.printIthNode(head, i);
    }
}
