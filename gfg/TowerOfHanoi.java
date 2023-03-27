package gfg;

import java.util.Scanner;

/*
 * TOWER OF HANOI PROBLEM
 * The tower of Hanoi is a famous puzzle where we have three rods and N disks. The objective of the puzzle is to move the entire stack to another rod. You are given the number of discs N. Initially, these discs are in the rod 1. You need to print all the steps of discs movement so that all the discs reach the 3rd rod. Also, you need to find the total moves.
 *  Note: The discs are arranged such that the top disc is numbered 1 and the bottom-most disc is numbered N. Also, all the discs have different sizes and a bigger disc cannot be put on the top of a smaller disc. Refer the provided link to get a better clarity about the puzzle.
 *  
 * Rules:
 - only move one disk at a time
 - no longer disk above smaller
 - only the top disk can move

 * ALGORITHM
        START
        Procedure Tower_Of_Hanoi(disk, source, dest, helper)
                IF disk == 1, THEN
                        move disk from source to dest             
                ELSE
                        Tower_Of_Hanoi (disk - 1, source, helper, dest)     
                        move disk from source to dest          
                        Tower_Of_Hanoi (disk - 1, helper, dest, source)     
                END IF   
        END Procedure


 Input:
N = 2
Output:
move disk 1 from rod 1 to rod 2
move disk 2 from rod 1 to rod 3
move disk 1 from rod 2 to rod 3
3
Explanation: For N=2 , steps will be
as follows in the example and total
3 steps will be taken.
 * 
 * Time complexity : O(2n-1) or O(2n)
 */

public class TowerOfHanoi {
    public static int toh(int n, int source, int destination, int auxiliary) {
        int moves = 0;
        if (n == 1) {
            System.out.println("move disk 1 from rod " + source + " to rod " + destination);
            moves = 1;
        } else {
            moves += toh(n - 1, source, auxiliary, destination);
            System.out.println("move disk " + n + " from rod " + source + " to rod " + destination);
            moves += 1;
            moves += toh(n - 1, auxiliary, destination, source);
        }
        return moves;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of discs : ");
        int n = scanner.nextInt();
        int moves = toh(n, 1, 3, 2);
        System.out.println("Number of moves = " + moves);
        scanner.close();
    }
}
