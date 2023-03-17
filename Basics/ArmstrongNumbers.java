package Basics;

import java.util.Scanner;

/*
Input: N = 370
Output: "Yes"
Explanation: 370 is an Armstrong number
since 33 + 73 + 03 = 370.
Hence answer is "Yes"

Enter a number: 1634
Armstrong Number.
 */
public class ArmstrongNumbers {
    public static void isArmstrongNumber(int num) {
        int n = num;
        int numberOfDigits = (int) Math.log10(num) + 1;
        int lastDigit = 0;
        int sum = 0;
        while (num != 0) {
            lastDigit = num % 10;
            sum += (int) Math.pow(lastDigit, numberOfDigits);
            num = num / 10;
        }
        if (n == sum) {
            System.out.println("Armstrong Number.");
        } else {
            System.out.println("Not an Armstrong Number.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        isArmstrongNumber(number);
        scanner.close();
    }
}
