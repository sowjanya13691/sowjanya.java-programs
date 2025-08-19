import java.util.Scanner;
public class ArrayOperations {
    private int[] data;
    private int size;
    public ArrayOperations(int capacity) {
        data = new int[capacity];
        size = 0;
    }
    public int getSize() {
        return size;
    }
    public int get(int index) {
        if (index >= 0 && index < size) {
            return data[index];
        } else {
            System.out.println("Invalid index.");
            return -1;
        }
    }
    public void set(int index, int value) {
        if (index >= 0 && index < size) {
            data[index] = value;
        } else {
            System.out.println("Invalid index.");
        }
    }
    public void insertAt(int index, int value) {
        if (size == data.length) {
            System.out.println("Array is full.");
            return;
        }
        if (index < 0 || index > size) {
            System.out.println("Invalid index.");
            return;
        }
        for (int i = size; i > index; i--) {
            data[i] = data[i - 1];
        }
        data[index] = value;
        size++;
        System.out.println("Inserted " + value + " at index " + index);
    }
    public void deleteAt(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index.");
            return;
        }
        System.out.println("Deleted element: " + data[index]);
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        size--;
    }
    public void linearSearch(int target) {
        for (int i = 0; i < size; i++) {
            if (data[i] == target) {
                System.out.println("Element found at index " + i);
                return;
            }
        }
        System.out.println("Element not found.");
    }
    public void binarySearch(int target) {
        int low = 0;
        int high = size - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (data[mid] == target) {
                System.out.println("Element found at index " + mid);
                return;
            } else if (data[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println("Element not found.");
    }
    public void bubbleSort() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
        System.out.println("Array sorted using Bubble Sort.");
    }
    public void display() {
        if (size == 0) {
            System.out.println("Array is empty.");
            return;
        }
        System.out.print("Array elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayOperations array = new ArrayOperations(100); // capacity of 100
        int choice, index, value;
        do {
            System.out.println("\n--- Array Operations Menu ---");
            System.out.println("1. Insert at index");
            System.out.println("2. Access element (get)");
            System.out.println("3. Modify element (set)");
            System.out.println("4. Delete at index");
            System.out.println("5. Linear Search");
            System.out.println("6. Binary Search (requires sorted array)");
            System.out.println("7. Bubble Sort");
            System.out.println("8. Display Array");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter index to insert at: ");
                    index = sc.nextInt();
                    System.out.print("Enter value to insert: ");
                    value = sc.nextInt();
                    array.insertAt(index, value);
                    break;
                    case 2:
                    System.out.print("Enter index to access: ");
                    index = sc.nextInt();
                    value = array.get(index);
                    if (value != -1) {
                        System.out.println("Element at index " + index + " is: " + value);
                    }
                    break;
                    case 3:
                    System.out.print("Enter index to modify: ");
                    index = sc.nextInt();
                    System.out.print("Enter new value: ");
                    value = sc.nextInt();
                    array.set(index, value);
                    break;
                    case 4:
                    System.out.print("Enter index to delete: ");
                    index = sc.nextInt();
                    array.deleteAt(index);
                    break;
                    case 5:
                    System.out.print("Enter value to search (Linear): ");
                    value = sc.nextInt();
                    array.linearSearch(value);
                    break;
                    case 6:
                    System.out.print("Enter value to search (Binary): ");
                    value = sc.nextInt();
                    array.binarySearch(value);
                    break;
                    case 7:
                    array.bubbleSort();
                    break;
                    case 8:
                    array.display();
                    break;
                    case 0:
                    System.out.println("Exiting program.");
                    break;
                    default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 0);
        sc.close();
    }
}