import java.util.Scanner;

public class calculator {
    static Scanner sc = new Scanner(System.in);
    public static boolean login() {
        System.out.println("Welcome Sowjanya to login");
        System.out.print("Enter username: ");
        String username = sc.nextLine();
        System.out.print("Enter password: ");
        String password = sc.nextLine();
        if(username.equals("sowjanya") && password.equals("password123")) {
            System.out.println("Login successful!\n");
            return true;
        } else {
            System.out.println("Invalid username or password. Exiting...");
            return false;
        }
    }public static void calculator() {
        while (true) {
            System.out.println("Calculator Menu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Choose an operation (1-5): ");
            int choice = sc.nextInt();
            if (choice == 5) {
                System.out.println("Exiting calculator. Goodbye!");
                break;
            }
            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();
            switch (choice) {
                case 1:
                    System.out.println("Result: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Result: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Result: " + (num1 * num2));
                    break;
                case 4:
                    if (num2 != 0) {
                        System.out.println("Result: " + (num1 / num2));
                    } else {
                        System.out.println("Cannot divide by zero!");
                    }
                    break;
                default:
                    System.out.println("Invalid choice! Please select 1-5.");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        if (login()) {
            calculator();
        }
        sc.close();
    }
}