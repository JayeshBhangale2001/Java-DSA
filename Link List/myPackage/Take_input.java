package myPackage;
import java.util.Scanner;

class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
    }
}

public class Take_input {

    public static Node<Integer> createLinkedList() {
        Node<Integer> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(20);
        Node<Integer> n3 = new Node<>(30);
        Node<Integer> n4 = new Node<>(40);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        return n1;
    }

    public static Node<Integer> takeInput() {
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();
        Node<Integer> head = null;

        while (data != -1) {
            Node<Integer> currentNode = new Node<>(data);

            if (head == null) {
                head = currentNode;
            } else {
                Node<Integer> tail = head;
                while (tail.next != null) {
                    tail = tail.next;
                }
                tail.next = currentNode;
            }
            data = s.nextInt();
        }
        return head;
    }

    public static void print(Node<Integer> head) {
        Node<Integer> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Creating a linked list using fixed data
        Node<Integer> headFixed = createLinkedList();
        System.out.println("Linked List created using fixed data:");
        print(headFixed);

        // Creating a linked list using user input
        System.out.println("Enter elements for a linked list (-1 to stop):");
        Node<Integer> headUserInput = takeInput();
        System.out.println("Linked List created from user input:");
        print(headUserInput);
    }
}
