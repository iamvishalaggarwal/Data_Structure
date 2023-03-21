package Recursion;

import java.util.Scanner;

class Print1ToNWithoutLoop {

    public static void print(int N) {
        if (N == 0) {
            return;
        }
        print(N - 1);
        System.out.print(N + " ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("Output :");
        print(number);
        scanner.close();
    }
}