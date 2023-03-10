package LeetCode;
//https://leetcode.com/problems/median-of-two-sorted-arrays/


import java.util.Arrays;

public class MedianofTwoSortedArrays {
    public static void main(String[] args)
    {
        int[] num1 = {1,3};
        int[] num2 = {2,4};
        System.out.println(findMedianSortedArrays(num1, num2));


    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        int length = m + n;
        int[] nums = new int[length];

        System.arraycopy(nums1, 0, nums, 0, m);
        System.arraycopy(nums2,0,nums,m,n);
        Arrays.sort(nums);

        if (length % 2 == 1)
            return (double)nums[length/2];

        int prev = length/2;
        return (double)(nums[prev] + nums[prev - 1])/2;
    }
}
