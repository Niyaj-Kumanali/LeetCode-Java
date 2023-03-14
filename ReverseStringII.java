package LeetCode;
//https://leetcode.com/problems/reverse-string-ii/


public class ReverseStringII {
    public static void main(String[] args) {
        String s = "abcdef";
        int k = 3;
        System.out.println(reverseStr(s, k));
    }

    public static String reverseStr(String s, int k) {
        char[] str = s.toCharArray();
        int length = str.length;
        for (int i = 0; i < length - 1; i+= 2*k) {
            if (i+k <= length)
                reverse(str, i, i+k-1);
            else
                reverse(str, i, length-1);
        }
        return new String(str);
    }

    public static void reverse(char[] s, int start, int end) {
        while (start < end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }
}
