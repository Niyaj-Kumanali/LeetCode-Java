package LeetCode;
//https://leetcode.com/problems/find-the-middle-index-in-array/


public class FindtheMiddleIndexinArray {
    public static void main(String[] args)
    {
        int[] nums = {2,3,-1,8,4};
        System.out.println(findMiddleIndex(nums));
    }

    public static int findMiddleIndex(int[] nums) {
        int total = 0, leftSum = 0;
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
