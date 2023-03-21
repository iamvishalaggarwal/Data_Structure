package Recursion;

import java.util.Scanner;;

public class PrintNto1 {
    public static void print(int N) {
        if (N == 0) {
            return;
        }
        System.out.print(N + " ");
        print(--N);
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
