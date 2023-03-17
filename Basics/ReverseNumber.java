package Basics;

import java.util.Scanner;

public class ReverseNumber {
    public static int reverseNumber(int num) {
        int rev = 0;
        int lastDigit;
        while (num != 0) {
            lastDigit = num % 10;
            rev = rev * 10 + lastDigit;
            num = num / 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int reverse = reverseNumber(number);
        System.out.print("Reverse Number = " + reverse);
        scanner.close();
    }
}
