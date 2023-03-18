package Basics;

import java.util.Scanner;

/*
 * A prime number is a whole number greater than 1 whose only factors are 1 and itself. 
 */
public class CheckForPrime {
    // Apprach_1 (Brute Force)
    // TC = O(n)
    public static boolean isPrimeNumber_1(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Approach_2
    // TC = O(sqrt(n))
    public static boolean isPrimeNumber_2(int num) {
        if (num < 2) {
            return false;
        }
        int numberOfFactors = 0;
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                numberOfFactors++;
                if (num % i != i) {
                    numberOfFactors++;
                }
            }
        }
        if (numberOfFactors == 2)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (isPrimeNumber_2(number)) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a prime number");
        }
        scanner.close();
    }
}
