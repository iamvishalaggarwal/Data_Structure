package Basics;

import java.util.Scanner;

/*
Input:
N = 5
Output:
21
Explanation:
F(1) = 1
F(2) = 1 + 2 = 3
F(3) = 1 + 3 = 4
F(4) = 1 + 2 + 4 = 7
F(5) = 1 + 5 = 6
ans = F(1) + F(2) + F(3) + F(4) + F(5)
    = 1 + 3 + 4 + 7 + 6
    = 21
 */
public class SumOfAllDivisors {
    // Approach_1 TC = O(n^2)
    public static int sumOfDivisors_1(int num) {
        /*
         * Since,
         * multiple of 1 = 1
         * So, sum = 1 (initally)
         */
        int totalOfAllDivisors = 1;
        for (int i = 2; i <= num; i++) {
            int sumOfDivisor = 1 + i; // mutiple can be 1 or itself
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    sumOfDivisor += j;
                }
            }
            totalOfAllDivisors += sumOfDivisor;
        }
        return totalOfAllDivisors;
    }

    // Apprach_2 TC = O(n^2)
    public static int sumOfDivisors_2(int num) {
        /*
         * Since,
         * multiple of 1 = 1
         * So, sum = 1 (initally)
         */
        int totalOfAllDivisors = 1;
        for (int i = 2; i <= num; i++) {
            int sumOfDivisor = 1 + i; // mutiple can be 1 or itself
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    sumOfDivisor += j;
                }
            }
            totalOfAllDivisors += sumOfDivisor;
        }
        return totalOfAllDivisors;
    }

    // Approach_3(Efficient approach) - TC = O(n)
    /*
     * Let n = 6,
     * => F(1) + F(2) + F(3) + F(4) + F(5) + F(6)
     * => 1 will occurs 6 times in F(1), F(2),
     * F(3), F(4), F(5) and F(6)
     * => 2 will occurs 3 times in F(2), F(4) and
     * F(6)
     * => 3 will occur 2 times in F(3) and F(6)
     * => 4 will occur 1 times in F(4)
     * => 5 will occur 1 times in F(5)
     * => 6 will occur 1 times in F(6)
     */
    public static int sumOfDivisors_3(int N) {
        int sum = 0;
        for (int i = 1; i <= N; ++i)
            sum += (N / i) * i;
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int sum = sumOfDivisors_3(number);
        System.out.print("Sum of all divisors = " + sum);
        scanner.close();
    }
}
