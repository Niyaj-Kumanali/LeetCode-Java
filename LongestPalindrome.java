package LeetCode;
//https://leetcode.com/problems/longest-palindrome

public class LongestPalindrome {
    public static void main(String[] args) {
        String s = "abbccdd";
        System.out.println(longestPalindrome(s));
    }

    public static int longestPalindrome(String s) {
        int[] chars = new int[52];
        for (int i = 0; i < s.length(); i ++) {
            char c = s.charAt(i);
            if (c >= 'a' && c<= 'z')
                chars[c - 'a'] ++;
            else
                chars[c - 'A' + 26] ++;
        }
        int count = 0;
        for (int aChar : chars)
            count += aChar / 2;
        count = count * 2;
        return Math.min(s.length(), count + 1);
    }
}
