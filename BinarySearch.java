package LeetCode;
//https://leetcode.com/problems/binary-search

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        System.out.println(search(nums, target));
    }

    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length -1;
        while (start <= end)
        {
            //mid = (start + end)/2 both are similar
            int mid = start + (end - start)/2;

            //if we found target on left side then there is no need to search at right
            if (target < nums[mid]) {
                end = mid - 1;
            }
            //if we found target on right side then there is no need to search at left
            else if (target > nums[mid]) {
                start = mid + 1;
            }
            //if it not found on either side then it is mid only
            else
                return mid;
        }
        //return -1 if not found
        return -1;
    }
}
