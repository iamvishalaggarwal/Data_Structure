package Array;

import java.util.Scanner;

public class ArrayInsertion {
    /*
     * insert operation in Array
     * Time complexity:
     * Best case - O(1) - when you want to insert at the end
     * Worst case - O(n)
     */
    public static boolean insertion(int[] arr, int number, int index) {
        if (index > arr.length) {
            return false;
        }
        for (int i = arr.length - 1; i != index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = number;
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.print("Enter length of array: ");
        int len = scanner.nextInt();
        System.out.println("Enter Elements:");
        for (int i = 0; i != len; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Your Array: ");
        for (int i = 0; i != len; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("Enter the element you want to insert:");
        int number = scanner.nextInt();
        System.out.print("Enter the position of element you want to insert:");
        int position = scanner.nextInt();
        boolean isInserted = insertion(arr, number, position - 1);
        if (isInserted) {
            System.out.println("Element is Added Successfully :)");
            System.out.print("Array: ");
            len++;
            for (int i = 0; i != len; i++) {
                System.out.print(arr[i] + " ");
            }
        } else {
            System.out.println("Sorry, Array is full now.");
        }
        scanner.close();
    }
}
