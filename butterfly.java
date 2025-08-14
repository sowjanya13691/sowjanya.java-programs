public class butterfly {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            System.out.print("*".repeat(i));
            System.out.print(" ".repeat(2 * (n - i)));
            System.out.println("*".repeat(i));
        }
        for (int i = n-1; i >= 0; i--) {
            System.out.print("*".repeat(i));
            System.out.print(" ".repeat(2 * (n - i)));
            System.out.println("*".repeat(i));
        }
    }
}
