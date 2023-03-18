package LeetCode;
//https://leetcode.com/problems/min-cost-climbing-stairs/


public class Min_Cost_Climbing_Stairs {
    public static void main(String[] args) {
        int[] cost = {10, 15, 20};
        System.out.println(minCostClimbingStairs(cost));
    }

    public static int minCostClimbingStairs(int[] cost) {
        final int n = cost.length;

        for (int i = 2; i < n; ++i)
            cost[i] += Math.min(cost[i - 1], cost[i - 2]);

        return Math.min(cost[n - 1], cost[n - 2]);
    }
}
