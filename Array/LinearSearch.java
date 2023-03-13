package Array;

import java.util.Scanner;

public class LinearSearch {
    /*
     * linear search operation in Array (for unsorted array)
     * Time complexity:
     * Worst case - O(n)
     */
    public static int linearSearch(int[] arr, int reqElement) {
        for (int i = 0; i != arr.length; i++) {
            if (arr[i] == reqElement) {
                return i + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int len = scanner.nextInt();
        int[] arr = new int[len];
        if (arr.length == 0) {
            System.out.println("Size of array is zero.");
        }
        System.out.println("Enter Elements:");
        for (int i = 0; i != arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter the element which you want to search: ");
        int reqElement = scanner.nextInt();
        int position = linearSearch(arr, reqElement);
        if (position == -1) {
            System.out.println("Element not found.");

        } else {
            System.out.println("Element found at " + position + " position.");
        }
        scanner.close();
    }
}
