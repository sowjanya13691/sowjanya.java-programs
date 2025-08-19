import java.util.Scanner;

public class linkedlist {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }
    Node head;
    void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);
        if (position < 1) {
            System.out.println("Position should be >= 1");
            return;
        }
        if (position == 1) {
            newNode.next = head;
            head = newNode;
            System.out.println(data + " inserted at position " + position);
            return;
        }
        Node temp = head;
        for (int i = 1; i < position - 1; i++) {
            if (temp == null) {
                System.out.println("Position is out of bounds");
                return;
            }
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Position is out of bounds");
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        System.out.println(data + " inserted at position " + position);
    }
    void deleteAtPosition(int position) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (position < 1) {
            System.out.println("Position should be >= 1");
            return;
        }
        if (position == 1) {
            System.out.println(head.data + " deleted from position 1");
            head = head.next;
            return;
        }
        Node temp = head;
        for (int i = 1; i < position - 1; i++) {
            if (temp == null || temp.next == null) {
                System.out.println("Position is out of bounds");
                return;
            }
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("Position is out of bounds");
            return;
        }
        System.out.println(temp.next.data + " deleted from position " + position);
        temp.next = temp.next.next;
    }
    void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.print("Linked list: ");
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        linkedlist list = new linkedlist();
        int choice;
        do {
            System.out.println("\n1. Insert at position");
            System.out.println("2. Delete at position");
            System.out.println("3. Display list");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert: ");
                    int val = sc.nextInt();
                    System.out.print("Enter position to insert: ");
                    int posInsert = sc.nextInt();
                    list.insertAtPosition(val, posInsert);
                    break;
                    case 2:
                    System.out.print("Enter position to delete: ");
                    int posDelete = sc.nextInt();
                    list.deleteAtPosition(posDelete);
                    break;

                case 3:
                    list.display();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 4);

        sc.close();
    }
}