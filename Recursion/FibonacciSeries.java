package Recursion;

import java.util.*;
/*
 Given a number N, find the first N Fibonacci numbers. The first two number of the series are 1 and 1.
 */

public class FibonacciSeries {
    // Approach_1
    // using loop and recursion
    public static int fib(int n) {
        if (n == 0)
            return 0;
        if (n == 1 || n == 2)
            return 1;
        return fib(n - 1) + fib(n - 2);
    }

    public static int[] printFibb(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = fib(i + 1);
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int[] fibArr = printFibb(number);
        System.out.println("Output :");
        for (int i = 0; i < number; i++) {
            System.out.print(fibArr[i] + " ");
        }
        scanner.close();
    }
}
