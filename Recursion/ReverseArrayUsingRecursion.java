package Recursion;

public class ReverseArrayUsingRecursion {
    static void swap_array_elements(int arr[], int initial_index, int final_index) {
        arr[initial_index] = arr[initial_index] + arr[final_index];
        arr[final_index] = arr[initial_index] - arr[final_index];
        arr[initial_index] = arr[initial_index] - arr[final_index];
    }

    // Appoach_1 (Two pointer approach + recursion )
    // two variables use
    public static void reverseArrayUsingRecursion_1(int arr[], int final_index, int initial_index) {
        if (final_index <= initial_index) {
            return;
        }
        swap_array_elements(arr, initial_index, final_index);
        reverseArrayUsingRecursion_1(arr, final_index - 1, initial_index + 1);
    }

    // Approach_2
    // using one variable
    public static void reverseArrayUsingRecursion_2(int index, int arr[]) {
        if (index >= arr.length / 2)
            return;
        swap_array_elements(arr, index, arr.length - index - 1);
        reverseArrayUsingRecursion_2(index + 1, arr);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 2, 0, 2, 3, 4, 5 };
        int len = arr.length;
        // Approach_1
        // reverseArrayUsingRecursion_1(arr, len - 1, 0);

        // Approach_2
        reverseArrayUsingRecursion_2(0, arr);

        System.out.print("Reverse Array: ");
        for (int i = 0; i != len; i++)
            System.out.print(arr[i] + " ");
    }
}
