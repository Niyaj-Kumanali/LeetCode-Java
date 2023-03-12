package LeetCode;
//https://leetcode.com/problems/reverse-bits/
public class ReverseBits {
    public static void main(String[] args) {
        int n = 0b00000010100101000001111010011100;
        System.out.println(reverseBits(n));

    }

    public static int reverseBits(int n) {
        int reverse = 0;

        for (int i = 0; i < 32; ++i)
        {
            int last = n >> i & 1;
            if (last == 1)
            {
                int first = 1 << 31 - i;
                reverse |= first;
            }
        }
        return reverse;
    }
}
