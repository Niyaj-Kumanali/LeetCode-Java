package LeetCode;
//https://leetcode.com/problems/number-of-1-bits/

public class Numberof1Bits {
    public static void main(String[] args) {
        int n = 0b00000000000000000000000000001011;
        System.out.println(hammingWeight(n));
    }

    public static int hammingWeight(int n) {
        int count = 0;
        for (int i = 0; i < 32; i++) {
            int digit = n >> i & 1;
            if (digit == 1)
                count++;
        }
        return count;
    }
}
