package Recursion;

import java.util.Scanner;

/*
 * Given a number, N. Find the sum of all the digits of N
 
Input:
N = 12
Output:
3
Explanation:
Sum of 12's digits:
1 + 2 = 3
 */

public class SumOfDigits {
    public static int findSumOfDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + findSumOfDigits(n / 10);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int sum = findSumOfDigits(number);
        System.out.println("Sum of digits = " + sum);
        scanner.close();
    }
}
