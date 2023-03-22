package Recursion;

public class ReverseArrayUsingRecursion {
    public static void reverseArrayUsingRecursion(int arr[], int final_index, int initial_index) {
        if (final_index <= initial_index) {
            return;
        }
        arr[initial_index] = arr[initial_index] + arr[final_index];
        arr[final_index] = arr[initial_index] - arr[final_index];
        arr[initial_index] = arr[initial_index] - arr[final_index];
        reverseArrayUsingRecursion(arr, final_index - 1, initial_index + 1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 3, 4, 5 };
        int len = arr.length;
        reverseArrayUsingRecursion(arr, len - 1, 0);
        System.out.print("Reverse Array: ");
        for (int i = 0; i != len; i++)
            System.out.print(arr[i] + " ");
    }
}
