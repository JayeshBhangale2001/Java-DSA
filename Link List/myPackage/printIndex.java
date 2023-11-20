package myPackage;

public class printIndex {
    public static int findNode(Node<Integer> head, int n) {
        int index = 0;
        while (head != null) {
            if (head.data == n) {
                return index;
            }
            index++;
            head = head.next;
        }
        return -1;
    }

    public static void main(String[] args) {
        // Example usage
        Node<Integer> head = new Node<>(1);
        head.next = new Node<>(2);
        head.next.next = new Node<>(3);
        head.next.next.next = new Node<>(4);

        int searchValue = 3;
        int foundIndex = findNode(head, searchValue);

        if (foundIndex != -1) {
            System.out.println("Node with value " + searchValue + " found at index " + foundIndex);
        } else {
            System.out.println("Node with value " + searchValue + " not found in the list.");
        }
    }
}
