import java.util.Scanner;

public class stack {
    static final int MAX = 5;
    int top;
    int[] stack = new int[MAX];
    stack() {
        top = -1;
    }
    void push(int x) {
        if (top == MAX - 1) {
            System.out.println("Stack is full (Overflow)");
        } else {
            top++;
            stack[top] = x;
            System.out.println(x + " pushed into stack");
        }
    }
    void pop() {
        if (top == -1) {
            System.out.println("Stack is empty (Underflow)");
        } else {
            int popped = stack[top];
            top--;
            System.out.println(popped + " popped from stack");
        }
    }
    void peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Top element is: " + stack[top]);
        }
    }
    void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack elements:");
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        stack s = new stack();
        int choice;
        do {
            System.out.println("\n1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    int val = sc.nextInt();
                    s.push(val);
                    break;
                case 2:
                    s.pop();
                    break;
                case 3:
                    s.peek();
                    break;
                case 4:
                    s.display();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 5);
        sc.close();
    }
}