package src.main.java.oops.concepts;

public class LinkedList {
    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;

        }
    }

    public static void main(String[] args) {
        Node ten = new Node(10);

        Node twenty = new Node(20);
        Node thirty = new Node(30);
        Node fourty = new Node(40);
        Node fifty = new Node(50);

        ten.next = twenty;
        twenty.next = thirty;
        thirty.next = fourty;
        fourty.next = fifty;

        Node head = ten;
        printLL(head);
        System.out.println();

        changeNodeData(head, 30, 100);
        printLL(head);

    }

    private static void changeNodeData(Node head, int data, int newData) {
        while (head != null) {
            if (head.val == data)
                ;
            head.val = newData;
            break;

        }
        head = head.next;

    }

    public static void printLL(Node head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
    }
}