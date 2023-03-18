package LeetCode;
//https://leetcode.com/problems/search-in-rotated-sorted-array/


public class SearchInRotatedSortedArray {
    public static void main(String[] args)
    {
        int[] nums = {1,3};
        int target = 2;
        System.out.println(search(nums, target));
    }

//    public static int search(int[] nums, int target) {
//        for (int i=0; i<nums.length; i++)
//            if (nums[i] == target)
//                return i;
//        return -1;
//    }

    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int index;
        int pivot = findPivot(nums, start, end);
        if (target >= nums[start])
            index = binarySearch(nums, target, start, pivot);
        else
            index = binarySearch(nums, target, pivot+1, end);
        return index;
    }

    public static int binarySearch(int[] nums,int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target )
                return mid;
            if (nums[mid] < target)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }

    public static int findPivot(int[] nums, int start, int end)
    {
        if (end == 0 || nums[start] < nums[end])
            return end;
        while (start <= end)
        {
            int mid = start + (end - start)/2;
            if (mid < end && nums[mid] > nums[mid + 1])
                return mid;
            if (mid > start && nums[mid] < nums[mid - 1])
                return mid - 1;
            if (nums[mid] > nums[end] && nums[mid] < nums[mid + 1])
                start = mid + 1;
            else
                end = mid;
        }
        return -1;
    }

}
