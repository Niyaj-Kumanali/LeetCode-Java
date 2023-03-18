package LeetCode;
//https://leetcode.com/problems/subarray-sums-divisible-by-k/

public class SubarraySumsDivisiblebyK {
    public static void main(String[] args) {
        int[] nums = {4,5,0,-2,-3};
        int k = 1823;
        System.out.println(subarraysDivByK(nums, k));
    }

    public static int subarraysDivByK(int[] nums, int k) {
        int[] count = new int[k];
        count[0] = 1;
        int prev = 0;
        int ans = 0;
        for (int num : nums) {
            prev = (prev + num % k + k) % k;
            ans += count[prev]++;
        }
        return ans;
    }
}
