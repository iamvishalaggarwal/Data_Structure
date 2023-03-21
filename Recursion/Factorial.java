package Recursion;

import java.util.Scanner;

public class Factorial {
    public static long factorial(long num) {
        if (num == 0 || num == 1)
            return 1;
        return num * factorial(num - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();
        System.out.println("Factorial = " + factorial(number));
        scanner.close();
    }
}
