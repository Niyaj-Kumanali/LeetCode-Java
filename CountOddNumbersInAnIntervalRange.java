package LeetCode;
//https://leetcode.com/problems/count-odd-numbers-in-an-interval-range

public class CountOddNumbersInAnIntervalRange {
    public static void main(String[] args) {
        int low = 21, high = 22;
        System.out.println(countOdds(low, high));
    }

    public static int countOdds(int low, int high)
    {
        int diff = high - low;
        return low % 2 == 0 && high % 2 == 0? diff / 2: diff / 2 + 1;
    }

}
