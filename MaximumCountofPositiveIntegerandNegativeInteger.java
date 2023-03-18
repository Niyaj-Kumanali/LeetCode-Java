package LeetCode;//https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/

public class MaximumCountofPositiveIntegerandNegativeInteger
{
    public static void main(String[] args)
    {
        int[] nums1 = {-4,-3,-2,-1,0,0,4,5, 6};
        int[] nums2 = {-2, -1 ,2,3, 4};
        int[] nums3 = {0,0,0,0};
        int[] nums4 = {0,0,0,3};
        int[] nums5 = {-1,0,0,0};
        int[] nums6 = {-2,-1,0,0,3};
        int[] nums7 = {-2,-1,-1,1,2,3};
        int[] nums8 = {-3,-2,-1,0,0,1,2};
        int[] nums9 = {5,20,66,1314};



        System.out.println("1 : " + maximumCount(nums1));
        System.out.println("2 : " + maximumCount(nums2));
        System.out.println("3 : " + maximumCount(nums3));
        System.out.println("4 : " + maximumCount(nums4));
        System.out.println("5 : " + maximumCount(nums5));
        System.out.println("6 : " + maximumCount(nums6));
        System.out.println("7 : " + maximumCount(nums7));
        System.out.println("8 : " + maximumCount(nums8));
        System.out.println("9 : " + maximumCount(nums9));

    }

    public static int maximumCount(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        if(nums[start] == 0 && nums[end] == 0 )
            return 0;
        if (nums[0] >= 0)
            end = 0;
        if (nums[nums.length - 1] == 0)
            start = nums.length - 1;


        while (true)
        {

            if ( nums[0] < 0 || nums[nums.length-1] > 0 ) {

                if (start < nums.length-1 && nums[start] <= 0)
                    start++;
                if (end > 0 && nums[end] >= 0)
                    end--;
                if (nums[end] <= 0 && nums[start] > 0)
                    break;
                if (end == 0 && start == nums.length - 1 )
                    break;
                if (nums[0] > 0 || nums[nums.length-1] < 0)
                    break;
            }
        }
        int posCount = count(nums, start, nums.length - 1);
        int negCount = count(nums, 0, end);

        if (posCount > negCount)
            return posCount;
        return negCount;
    }

    public static int count(int[] nums, int start , int end)
    {
        int count = 0;
        for(int i = start; i <= end; i++)
            count++;
        return count;
    }
}
