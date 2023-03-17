package Basics;

import java.util.Scanner;

public class PalindromeProblem {
    public static void isPalindromeNumber(int num) {
        int rev = 0;
        int lastDigit;
        int n = num;
        while (num != 0) {
            lastDigit = num % 10;
            rev = rev * 10 + lastDigit;
            num = num / 10;
        }
        if (rev == n) {
            System.out.println("Palindrome Number.");
        } else
            System.out.println("Not a Palindrome Number.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        isPalindromeNumber(number);
        scanner.close();
    }
}
