package myPackage;

import java.util.Scanner;

class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
    }
}

public class appendLastNtoFirst {

    public static Node<Integer> appendLastNToFirst(Node<Integer> head, int n) {
        if (head == null || n == 0) {
            return head;
        }

        int length = 0;
        Node<Integer> tail = head;

        // Find the length of the list
        while (tail.next != null) {
            tail = tail.next;
            length++;
        }
        length++; // Count the last node

        // If 'n' is greater than or equal to the length, no change needed
        if (n >= length) {
            return head;
        }

        int count = 0;
        Node<Integer> current = head;
        Node<Integer> prevNthFromEnd = null;

        // Find the node just before the 'N'th node from the end
        while (count < length - n) {
            prevNthFromEnd = current;
            current = current.next;
            count++;
        }

        // If 'prevNthFromEnd' is null, the head needs to be adjusted
        if (prevNthFromEnd == null) {
            return head;
        }

        // Adjust pointers to move the last 'N' nodes to the front
        tail.next = head; // Connect the current tail to the current head
        head = prevNthFromEnd.next; // Update head to the next of 'prevNthFromEnd'
        prevNthFromEnd.next = null; // Disconnect the sublist of the last 'N' nodes

        return head;
    }

    public static void printLinkedList(Node<Integer> head) {
        Node<Integer> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases

        while (t-- > 0) {
            Node<Integer> head = null;
            Node<Integer> tail = null;

            // Input linked list
            int data = scanner.nextInt();
            while (data != -1) {
                Node<Integer> newNode = new Node<>(data);
                if (head == null) {
                    head = newNode;
                    tail = newNode;
                } else {
                    tail.next = newNode;
                    tail = newNode;
                }
                data = scanner.nextInt();
            }

            int n = scanner.nextInt(); // Value of 'N'

            head = appendLastNToFirst(head, n); // Function call

            printLinkedList(head); // Output the resulting linked list
        }
        scanner.close();
    }
}
