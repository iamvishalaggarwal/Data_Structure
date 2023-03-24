package gfg;

import java.util.*;

/*
* Power Set or Subsequences of string
* Given a string S, Find all the possible subsequences of the String in lexicographically-sorted order.

Example 1:

Input : str = "abc"
Output: "" a ab abc ac b bc c
Note:Blank is also a part of power set
Explanation : There are 8 subsequences that 
can be formed from abc.

Example 2:

Input: str = "aa"
Output: "" a a aa
Explanation : There are 4 subsequences that 
can be formed from aa.
 */
public class SubsequenceOfString {

    /*
     * Approach
     * 1. let str = ""
     * 2. every string has two choices e.g.,
     * str = "ABC"
     * str has two choices in step 1 --> str + "" and str + "A"
     * now this is so on....
     */
    static void printSubsequence(String str, String curr, int index) {

        if (index == str.length()) {
            if (curr != "")
                System.out.print(curr + " ");
            else
                System.out.print("_" + " "); // for showing blank only
            return;
        }

        printSubsequence(str, curr, index + 1);
        printSubsequence(str, curr + str.charAt(index), index + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any string : ");
        String str = scanner.next();
        printSubsequence(str, "", 0);
        scanner.close();

    }
}
