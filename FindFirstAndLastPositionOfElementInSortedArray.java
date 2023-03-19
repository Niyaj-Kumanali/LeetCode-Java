package LeetCode;
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/


import java.util.Arrays;

public class FindFirstAndLastPositionOfElementInSortedArray {
    public static void main(String[] args)
    {
        int[] nums = {1};
        System.out.println(Arrays.toString(searchRange(nums, 1)));
    }

    public static int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            if (nums[start] == target && nums[end] == target )
                return new int[]{start, end};
            if (nums[start] < target)
                start++;
            if (nums[end] > target)
                end--;
        }
        return new int[]{-1,-1};
    }
}
