package LeetCode;
//https://leetcode.com/problems/remove-duplicates-from-sorted-array/

import java.util.Arrays;

public class RemoveDuplicatesfromSortedArray {
    public static void main(String[] args)
    {
        int[] nums = new int[]{98,99,99,100,100};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int count = nums.length;
        for (int i = 0; i<nums.length; i++)
            if (nums[i] != Integer.MAX_VALUE)
                for (int j=i+1; j<nums.length; j++)
                    if (nums[i] == nums[j]) {
                        nums[j] = Integer.MAX_VALUE;
                        count--;
                    }
        Arrays.sort(nums);
        return count;
    }
}
