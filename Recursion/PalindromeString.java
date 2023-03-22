package Recursion;

import java.util.Scanner;

/*
Input: S = "abba"
Output: 1
Explanation: S is a palindrome
 */
public class PalindromeString {
    // Approach_1
    // follows swap and two pointer approach
    public static boolean isPalindrome_1(String str) {
        String dummyStr = str;
        int len = str.length();
        int i = 0;
        int j = len - 1;
        while (i < j) {
            str = str.replace(str.charAt(i), str.charAt(j));
            i++;
            j--;
        }
        return dummyStr.equals(str) ? true : false;
    }

    // Approach_2
    // checking first and last char is same or not and so on...
    public static boolean isPalindrome_2(String str) {
        int len = str.length();
        int i = 0;
        int j = len - 1;
        while (i < j) {
            char str_1 = str.charAt(i);
            char str_2 = str.charAt(j);
            if (str_1 != str_2) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    // Approach_3 Recursion
    // TC = O(n/2)
    public static boolean isPalindromeUsingRecursion(String str, int index) {
        int len = str.length();
        if (index >= len / 2)
            return true;
        if (str.charAt(index) != str.charAt(len - index - 1))
            return false;
        return isPalindromeUsingRecursion(str, index + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.next();

        // Approach_1
        // boolean isPalindrome = isPalindrome_2(str);
        // if (isPalindrome)
        // System.out.println("Palindrome String.");
        // else
        // System.out.println("Not a Palindrome String.");

        // Approach_2
        boolean isPalindrome = isPalindromeUsingRecursion(str, 0);
        if (isPalindrome)
            System.out.println("Palindrome String.");
        else
            System.out.println("Not a Palindrome String.");

        scanner.close();
    }
}
