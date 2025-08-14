import java.util.Scanner;
public class NeonNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sqr = n* n;
        int sum = 0;
        while (sqr > 0) {
            sum += sqr % 10;
            sqr = sqr / 10;
        }
        if (sum == n) {
            System.out.println(n + " is a Neon number.");
        } else {
            System.out.println(n + " is not a Neon number.");
        }
        sc.close();
    }
}