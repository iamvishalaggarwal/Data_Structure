package Basics;

import java.util.Scanner;

/*
Example 1:
Input: num1 = 4, num2 = 8
Output: 4
Explanation: Since 4 is the greatest number which divides both num1 and num2.

Example 2:
Input: num1 = 3, num2 = 6
Output: 3
Explanation: Since 3 is the greatest number which divides both num1 and num2.
 */
public class GCDorHCF {
    // Approach_1
    // TC = O(n)
    public static int gcd_1(int num_1, int num_2) {
        int gcd = 1;
        for (int i = 2; i <= Math.min(num_1, num_2); i++) {
            if (num_1 % i == 0 && num_2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    // Approach_2 - as we have to find highest so if we move from high to low then
    // we might have a better complexity
    // TC = O(min(n1,n2)
    public static int gcd_2(int num_1, int num_2) {
        int gcd = 1;
        for (int i = Math.min(num_1, num_2); i >= 2; i--) {
            if (num_1 % i == 0 && num_2 % i == 0) {
                gcd = i;
                break;
            }
        }
        return gcd;
    }

    /*
     * Euclidean Algo
     * It states that -
     * gcd(a,b) == gcd (a-b,b) ( a > b)
     * So, can do this ==> gcd(a,b) == gcd (a%b,b) ( a > b) ==> gcd == b
     * 
     * Logic --
     * greater % smaller --> if one of them is zero --> other is gcd
     * 
     * TC = O(log(min(a,b)))
     */
    public static int gcd_3(int num_1, int num_2) {
        if (num_1 == 0) {
            return num_2;
        }
        if (num_1 < num_2) {
            num_1 = num_1 + num_2;
            num_2 = num_1 - num_2;
            num_1 = num_1 - num_2;
        }
        return gcd_3(num_1 % num_2, num_2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num_1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num_2 = scanner.nextInt();
        int gcd = gcd_3(num_1, num_2);
        System.out.print("GCD of " + num_1 + " and " + num_2 + " = " + gcd);
        scanner.close();
    }
}