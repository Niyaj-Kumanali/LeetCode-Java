package LeetCode;//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/

import java.util.Arrays;

public class HowManyNumbersAreSmallerThantheCurrentNumber {
    public static void main(String[] args)
    {
        int[] nums = {8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] list = new int[nums.length];
        for (int i=0; i <= nums.length-1; i++)
        {
            list[i] = smallerCount(nums, nums[i]);
        }

        return list;
    }

    public static int smallerCount(int[] nums, int target)
    {
        int count = 0;
        for (int i=0; i <= nums.length-1; i++)
        {
            if (nums[i] < target)
                count++;
        }
        return count;
    }
}
