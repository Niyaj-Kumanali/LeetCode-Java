package LeetCode;
//https://leetcode.com/problems/unique-paths

import java.util.Arrays;

public class Unique_Paths {
    public static void main(String[] args) {
        System.out.println(uniquePaths(3,2));
    }

    public static int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        Arrays.stream(dp).forEach(A -> Arrays.fill(A, 1));

        for (int i = 1; i < m; ++i)
            for (int j = 1; j < n; ++j)
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];

        return dp[m - 1][n - 1];
    }
}
