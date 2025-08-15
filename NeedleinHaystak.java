import java.util.Scanner;
public class NeedleinHaystak{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter haystack: ");
        String haystack = scanner.nextLine();
        System.out.print("Enter needle: ");
        String needle = scanner.nextLine();
        if (haystack.indexOf(needle) != -1) {
            System.out.println("Needle found!");
        } else {
            System.out.println("Needle not found.");
        }
        scanner.close();
    }
}