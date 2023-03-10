package LeetCode;
//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

import java.util.Arrays;

public class TwoSumIIInputArrayIsSorted {
    public static void main(String[] args)
    {
        int[] nums = {2,3,4};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
    public static int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i<numbers.length; i++)
            for (int j = i+1; j<numbers.length; j++)
                if (numbers[i] + numbers[j] == target)
                    return new int[]{i+1, j+1};
        return new int[]{-1, -1};
    }
}


