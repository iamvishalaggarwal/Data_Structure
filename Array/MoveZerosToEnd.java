package Array;

public class MoveZerosToEnd {
    /*
     * Approach_1 (Brute Force Approach) - add the non zero numbers into a temporary
     * array and then move these elements into original array and remaining places
     * will be zero
     * TC = O(2n)
     * SC = O(n)
     */
    public static void moveZerosToEnd_1(int arr[], int len) {
        int temp[] = new int[len];
        int j = 0;
        for (int i = 0; i != len; i++) {
            if (arr[i] != 0) {
                temp[j] = arr[i];
                j++;
            }
        }
        for (int i = 0; i != temp.length; i++) {
            arr[i] = temp[i];
        }
        for (int i = temp.length; i != len; i++) {
            arr[i] = 0;
        }
    }

    /*
     * Approach_2 (Better Approach) - count the number of zeros and then add them to
     * the last of the array
     * TC = O(2n)
     * SC = O(1)
     */
    public static void moveZerosToEnd_2(int arr[], int len) {
        int numberOfZeros = 0;
        int i = 0;
        for (int j = 0; j != len; j++) {
            if (arr[j] != 0) {
                arr[i] = arr[j];
                i++;
            } else {
                numberOfZeros++;
            }
        }
        while (i != len && numberOfZeros != 0) {
            arr[i] = 0;
            i++;
            numberOfZeros--;
        }
    }

    /*
     * Approach_3 (Optimal Approach) - Two pointer approach
     * find the index of first zero element and store it in j
     * then in next loop (starts from j+1) swap jth element and non zero element and
     * increase j by 1.
     * 
     * TC = O(2n)
     * SC = O(1)
     */
    public static void moveZerosToEnd_3(int arr[], int len) {
        int j = -1;
        for (int i = 0; i != len; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }
        for (int i = j + 1; i != len; i++) {
            if (arr[i] != 0) {
                // swap(arr[i], arr[j]);
                arr[i] = arr[i] + arr[j];
                arr[j] = arr[i] - arr[j];
                arr[i] = arr[i] - arr[j];
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 0, 4, 0, 0, 0, 3, 2 };
        int len = arr.length;
        System.out.print("Original Array = ");
        for (int i = 0; i != len; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        moveZerosToEnd_3(arr, len);
        System.out.print("After MoveZerosToEnd, Array = ");
        for (int i = 0; i != len; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
