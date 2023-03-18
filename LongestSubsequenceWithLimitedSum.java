package LeetCode;//https://leetcode.com/problems/longest-subsequence-with-limited-sum/

import java.util.Arrays;

public class LongestSubsequenceWithLimitedSum {
    public static void main(String[] args)
    {
        int[] nums = {4,5,2,1};
        int[] queries = {3,10,21};
        System.out.println(Arrays.toString(answerQueries(nums, queries)));


        nums = new int[]{2, 3, 4, 5};
        queries = new int[]{1};
        System.out.println(Arrays.toString(answerQueries(nums, queries)));

        nums = new int[]{76478,102343,247573,477461,430399,260435,250631,785081,904724,392720};
        queries = new int[]{63736,339518,37262,108251,216825};
        System.out.println(Arrays.toString(answerQueries(nums, queries)));

        nums = new int[]{76478,102343,247573,477461,430399,260435,250631,785081,904724,392720};
        queries = new int[]{108251};
        System.out.println(Arrays.toString(answerQueries(nums, queries)));
    }

    public static int[] answerQueries(int[] nums, int[] queries) {
        int[] list = new int[queries.length];
        Arrays.sort(nums);

        int index = 0;
        for(int target: queries){

            int sum = 0;
            int i = 0;
            while(i <= nums.length - 1){
                sum += nums[i];
                if (sum > target){
                    list[index] = i;
                    break;
                }
                else
                    list[index] = nums.length;
                i++;
            }
            index++;
        }
        return list;
    }
}
