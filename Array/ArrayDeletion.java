package Array;

import java.util.Scanner;

public class ArrayDeletion {
    /*
     * delete operation in Array
     * Time complexity:
     * Best case - O(1) - when you want to delete at the end
     * Worst case - O(n)
     */
    public static int deletion(int[] arr, int number) {
        int index = 0;
        for (int i = 0; i != arr.length; i++) {
            if (arr[i] == number) {
                index = i;
                break;
            }
        }
        if (index == 0) {
            return -1;
        }
        for (int i = index; i != arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = 0;
        return index;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int len = scanner.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter Elements : ");
        for (int i = 0; i != len; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Your Array: ");
        for (int i = 0; i != len; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("Enter the element you want to delete: ");
        int element = scanner.nextInt();
        int index = deletion(arr, element);
        if (index == -1)
            System.out.println("Element not found!");
        else {
            len--;
            System.out.println("Element found at " + (index + 1) + " location.");
            System.out.print("Array after deletion : ");
            for (int i = 0; i != len; i++) {
                System.out.print(arr[i] + " ");
            }
        }
        scanner.close();
    }
}
