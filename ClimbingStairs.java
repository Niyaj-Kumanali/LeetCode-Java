package LeetCode;
//https://leetcode.com/problems/climbing-stairs

public class ClimbingStairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(3));
    }

    public static int climbStairs(int n) {
        int[] noOfWays = new int[n + 1];
        noOfWays[0] = 1;
        noOfWays[1] = 1;
        for (int i = 2; i <= n; ++i)
            noOfWays[i] = noOfWays[i - 1] + noOfWays[i - 2];
        return noOfWays[n];
    }
}
