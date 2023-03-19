package LeetCode;//https://leetcode.com/problems/find-target-indices-after-sorting-array/


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTargetIndicesAfterSortingArray {
    public static void main(String[] args)
    {
        int[] nums = {1,2,2,3,2};
        System.out.println(targetIndices(nums, 2));
    }

    static List<Integer> targetIndices(int[] nums, int target)
    {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++)
            if (target == nums[i])
                list.add(i);
        return list;
    }

}
