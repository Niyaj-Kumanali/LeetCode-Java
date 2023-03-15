package LeetCode;
//https://leetcode.com/problems/is-subsequence

public class IsSubsequence {
    public static void main(String[] args) {
        String s = "bar";
        String t = "bsras";
        System.out.println(isSubsequence(s, t));
    }

    public static boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        int slength = s.length();
        int tlength = t.length();
        if (slength > tlength)
            return false;


        while (i < slength && j < tlength)
        {
            if (s.charAt(i) == t.charAt(j))
            {
                i++;
                j++;
                continue;
            }
            j++;
        }
        return i == slength;
    }
}
