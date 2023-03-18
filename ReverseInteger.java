package LeetCode;
//https://leetcode.com/problems/reverse-integer/

public class ReverseInteger {
    public static void main(String[] args) {
        int x = 1534236469;
        System.out.println(reverse(x));
    }

    public static int reverse(int x) 
    {
        int rem;
        long reverse = 0;
        while(x != 0)
        {
            rem = x % 10;
            reverse = (reverse + rem) * 10;
            x /= 10;
        }
        reverse /= 10;
        if (reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE)
            return 0;
        return (int)reverse;
    }
}
