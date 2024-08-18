package LeetCode;
//https://leetcode.com/problems/largest-rectangle-in-histogram/


public class LargestRectangleInHistogram {
    public static void main(String[] args) {

    }

    public static int largestRectangleArea(int[] heights) {
        int res = 0;
        for (int i=0; i< heights.length; i++){
            int max = 0;
            int element = heights[i];
            for (int j = i; j < heights.length; j++) {
                max += element;
                if(heights[j] < element)
                    break;
            }

            for (int j = 0; j < i; j++) {

            }
            if (res < max)
                res = max;
        }
        return 0;
    }
}
