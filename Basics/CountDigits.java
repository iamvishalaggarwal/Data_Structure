package Basics;

import java.util.Scanner;

/*
    Given a number N. Count the number of digits in N which evenly divides N.
    Note :- Evenly divides means whether N is divisible by a digit i.e. leaves a remainder 0 when divided.

    Input:
    N = 12
    Output:
    2
    Explanation:
    1, 2 both divide 12 evenly
 */
class CountDigits {
    public static int countDigits(int num) {
        int count = 0;
        int rem = 0;
        int n = num;
        while (n != 0) {
            rem = n % 10;
            if (rem != 0) {
                if (num % rem == 0) {
                    count++;
                }
            }
            n = n / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int digitsCount = countDigits(number);
        System.out.print("Digit Counts = " + digitsCount);
        scanner.close();
    }
}