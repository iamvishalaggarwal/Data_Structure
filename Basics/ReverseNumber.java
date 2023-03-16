package Basics;

import java.util.Scanner;

public class ReverseNumber {
    public static void reverseNumber(int num) {
        String binaryForm = Integer.toBinaryString(num);
        System.out.print("binaryForm = " + binaryForm);
        int reqZeroCount = 32 - binaryForm.length();
        System.out.print("\nreqZeroCount = " + reqZeroCount);
        long zeroInt = (long) Math.pow(10, reqZeroCount);
        System.out.print("\nzeroInt = " + zeroInt);
        String reqBinaryForm = binaryForm.concat(String.valueOf(zeroInt));
        System.out.print("\nreqBinaryForm = " + reqBinaryForm);
        int firstIndex = reqBinaryForm.charAt(0);
        int lastIndex = reqBinaryForm.charAt(reqBinaryForm.length() - 1);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        reverseNumber(number);
        // int digitsCount = reverseNumber(number);
        // System.out.print("Digit Counts = " + digitsCount);
        scanner.close();
    }
}
