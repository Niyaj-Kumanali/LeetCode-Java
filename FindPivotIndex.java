package LeetCode;
//https://leetcode.com/problems/find-pivot-index


public class FindPivotIndex {
    public static void main(String[] args)
    {
        int[] nums = {1,7,3,6,5,6};
        System.out.println(pivotIndex(nums));
    }
    public static int pivotIndex(int[] nums) {
        int total = 0;
        int leftSum = 0;
        for (int x: nums)
            total += x;
        for (int i = 0; i < nums.length; ++i) {
            if (leftSum == total - leftSum - nums[i])
                return i;
            leftSum += nums[i];
        }
        return -1;
    }
}
