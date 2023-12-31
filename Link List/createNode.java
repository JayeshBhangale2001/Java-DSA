
public class createNode {

    public static Node<Integer> createLinkedList() {
        Node<Integer> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(20);
        Node<Integer> n3 = new Node<>(30);
        Node<Integer> n4 = new Node<>(40);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        return n1; // Returning the head of the linked list
    }

    public static void main(String[] args) {

        Node<Integer> head = createLinkedList();

        // Now you can use the 'head' node to traverse the linked list
        Node<Integer> currentNode = head;
        while (currentNode != null) {
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
    }
}
