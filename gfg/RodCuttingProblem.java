package Recursion;

/*
* Maximise number of cuts in a rod if it can be cut only in given 3 sizes

* Given a rod of length N meters, and the rod can be cut in only 3 sizes A, B and C. The task is to maximizes the number of cuts in rod. If it is impossible to make cut then print -1.

    Input: N = 17, A = 10, B = 11, C = 3
    Output: 3
    Explanation:
    The maximum cut can be obtain after making 2 cut of length 3 and one cut of length 11.

    Input: N = 10, A = 9, B = 7, C = 11
    Output: -1
    Explanation:
    It is impossible to make any cut so output will be -1.
*/
public class RodCuttingProblem {
    // Approach_1
    // TC = O(3^n)
    // we can optimise it further using DP
    static int maxCuts(int n, int a, int b, int c) {
        if (n == 0)
            return 0;
        if (n <= -1)
            return -1;

        int res = Math.max(maxCuts(n - a, a, b, c),
                Math.max(maxCuts(n - b, a, b, c),
                        maxCuts(n - c, a, b, c)));

        if (res == -1)
            return -1;

        return res + 1;
    }

    public static void main(String[] args) {
        int n = 5, a = 2, b = 1, c = 5;

        System.out.println(maxCuts(n, a, b, c));

    }

}
