package Recursion;

import java.util.Scanner;

/*
 *
Input:
N=5
Output:
225
Explanation:
13+23+33+43+53=225 
 * 
 */
public class SumOfSeries {
    public static long sumOfSeries(long N) {
        if (N == 1) {
            return 1;
        }
        return (long) Math.pow(N, 3) + sumOfSeries(N - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();
        System.out.print("Sum of cubes of series = " + sumOfSeries(number));
        scanner.close();
    }
}
