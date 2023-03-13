package Array;

public class ArraySortedOrNot {
    /*
     * Approach_1 -- comparing consecutive elements
     * TC = O(n)
     */
    public static boolean isArraySortedOrNot_1(int[] arr, int len) {
        if (len == 0 || len == 1) {
            return true;
        }
        for (int i = 0; i != len - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    /*
     * Approach_2 -- comparing each element with every other element
     * TC = O(n^2)
     */
    public static boolean isArraySortedOrNot_2(int[] arr, int len) {
        for (int i = 0; i != len; i++) {
            for (int j = i + 1; j != len; j++) {
                if (arr[i] > arr[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 3, 4 };
        int len = arr.length;
        boolean isArraySorted = isArraySortedOrNot_2(arr, len);
        if (isArraySorted) {
            System.out.println("Array is sorted :)");
        } else {
            System.out.println("Array is not sorted :(");
        }
    }
}
