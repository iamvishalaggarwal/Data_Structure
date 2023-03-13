package Array;

// working
public class RemoveDuplicates {
    /*
     * Approach_1(Brute Force) - create auxilary space and add all unique elements
     * into it and then assign them into the original array.
     * TC = O(2n)
     * Auxiliary space = O(n)
     */
    public static int removeDuplicates_1(int arr[], int len) {
        int newArr[] = new int[len];
        int numberOfUniqueElements = 0;
        int i = 0;
        newArr[numberOfUniqueElements] = arr[i];
        numberOfUniqueElements++;
        for (i = 1; i != len; i++) {
            if (arr[i] != arr[i - 1]) {
                newArr[numberOfUniqueElements] = arr[i];
                numberOfUniqueElements++;
            }
        }
        for (int j = 0; j != numberOfUniqueElements; j++) {
            arr[j] = newArr[j];
        }
        return numberOfUniqueElements;
    }

    /*
     * Approach_2 - two pointer approach, in which we place one pointer at index 1
     * and another at index 0 if pointer ith element is equal to jth element -->
     * move j to next index else move i and insert the element to this position
     * 
     * TC = O(n)
     * SC = O(1)
     */
    public static int removeDuplicates_2(int arr[], int len) {
        int i = 0;
        for (int j = 1; j != len; j++) {
            if (arr[j] != arr[i]) {
                arr[i + 1] = arr[j];
                i++;
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int[] arr = { 1 };
        int len = arr.length;
        int numberOfUniqueElements = removeDuplicates_2(arr, len);
        System.out.println("Number of unique elements in array = " + numberOfUniqueElements);
        System.out.print("Array = ");
        for (int i = 0; i != numberOfUniqueElements; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
