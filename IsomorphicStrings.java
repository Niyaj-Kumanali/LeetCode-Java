package LeetCode;
//https://leetcode.com/problems/isomorphic-strings

public class IsomorphicStrings {
    public static void main(String[] args) {
        String s = "bar";
        String t = "foo";
        System.out.println(isIsomorphic(s,t));
    }

    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length())
            return false;

        int[] s1 = new int[256];
        int[] s2 = new int[256];

        for (int i = 0; i < s.length(); i++) {
            if (s1[s.charAt(i)] != s2[t.charAt(i)])
                return false;

            s1[s.charAt(i)] = i + 1;
            s2[t.charAt(i)] = i + 1;
        }
        return true;
    }
}
