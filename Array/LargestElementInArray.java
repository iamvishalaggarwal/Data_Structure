package Array;

public class LargestElementInArray {
    /*
     * Approach_1 -- set the first index value as max and updating it on finding
     * another max element in array
     * TC = O(n)
     */
    public static int indexOfMaxElement_1(int[] arr, int len) {
        int index = -1;
        if (len == 0)
            return index;
        int maxElement = arr[0];
        for (int i = 1; i != len; i++) {
            if (arr[i] > maxElement) {
                maxElement = arr[i];
                index = i;
            }
        }
        return index;
    }

    /*
     * Approach_2 -- comparing each element with other elements for finding max
     * element index
     * TC = O(n^2)
     */
    public static int indexOfMaxElement_2(int arr[], int len) {
        for (int i = 0; i != len; i++) {
            boolean flag = true;
            for (int j = i + 1; j != len; j++) {
                if (arr[j] > arr[i]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 543, 45 };
        int len = arr.length;
        int index = indexOfMaxElement_1(arr, len);
        // int index = indexOfMaxElement_2(arr, len);
        if (index == -1) {
            System.out.println("No Element found!");
        } else
            System.out.println(arr[index] + " is the largest element in given array present at " + index + " index.");
    }
}
