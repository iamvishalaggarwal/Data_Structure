package Basics;

import java.util.Scanner;

public class LCMandGCD {
    static Long gcd(Long num_1, Long num_2) {
        if (num_1 == 0) {
            return num_2;
        }
        if (num_1 < num_2) {
            num_1 = num_1 + num_2;
            num_2 = num_1 - num_2;
            num_1 = num_1 - num_2;
        }
        return gcd(num_1 - num_2, num_2);
    }

    static Long[] lcmAndGcd(Long num_1, Long num_2) {
        Long[] arr = new Long[2];
        Long gcd = gcd(num_1, num_2);
        long lcm = (num_1 * num_2) / gcd;
        arr[0] = lcm;
        arr[1] = gcd;
        return arr;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        Long num_1 = scanner.nextLong();
        System.out.print("Enter second number: ");
        Long num_2 = scanner.nextLong();
        Long[] lcmAndGcd = lcmAndGcd(num_1, num_2);
        System.out.println("LCM of " + num_1 + " and " + num_2 + " = " + lcmAndGcd[0]);
        System.out.print("GCD of " + num_1 + " and " + num_2 + " = " + lcmAndGcd[1]);
        scanner.close();
    }
}
