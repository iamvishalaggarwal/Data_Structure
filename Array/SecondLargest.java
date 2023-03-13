package Array;

public class SecondLargest {
    /*
     * Approach_1 (Brute Force) -- find the max element and then compare every
     * element with it to find the second largest
     * TC = O(2n)
     */
    public static int indexOfSecondMaxElement_1(int arr[], int len) {
        int index = -1;
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i != len; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        // as second largest is only find if the list has minimum 2 elements
        if (len < 2) {
            return index;
        }
        for (int i = 0; i != len; i++) {
            if (arr[i] != max && arr[i] > secondMax) {
                secondMax = arr[i];
                index = i;
            }
        }
        return index;
    }

    /*
     * Approach_2 -- set the first element as largest and if any other found then
     * update the largest and set the prev largest as the second largest
     * TC = O(n)
     */
    public static int indexOfSecondMaxElement_2(int arr[], int len) {
        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;
        int indexOfSecondLargest = -1;
        for (int i = 1; i != len; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
                indexOfSecondLargest = i - 1;
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
                indexOfSecondLargest = i;
            }
        }
        return indexOfSecondLargest;
    }

    public static void main(String[] args) {
        int[] arr = { -1, -1, -1, -2, 1, 2 };
        int len = arr.length;
        int index = indexOfSecondMaxElement_2(arr, len);
        // int index = indexOfMaxElement_2(arr, len);
        if (index == -1) {
            System.out.println("No Element found!");
        } else
            System.out.println("Second Largest element is " + arr[index] + " present at " + index + " index.");
    }
}
