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
    public static long sumOfSeries_1(long N) {
        // Approach_1 (functional)
        if (N == 1) {
            return 1;
        }
        return (long) Math.pow(N, 3) + sumOfSeries_1(N - 1);
    }

    public static long sumOfSeries_2(long N, long sum) {
        // Approach_1 (parameterised)
        if (N < 1) {
            return sum;
        }
        return sumOfSeries_2(N - 1, sum + (long) Math.pow(N, 3));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();
        // Approach_1
        System.out.println("Sum of cubes of series (way 1) = " + sumOfSeries_1(number));
        // Approach_2
        System.out.print("Sum of cubes of series (way 2) = " + sumOfSeries_2(number, 0));
        scanner.close();
    }
}
