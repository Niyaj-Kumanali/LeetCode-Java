package LeetCode;
//https://leetcode.com/problems/first-bad-version

public class First_Bad_Version {
    public static void main(String[] args) {

    }

    public static int firstBadVersion(int n) {
        int l = 1;
        int r = n;

        while (l < r) {
            final int m = l + (r - l) / 2;
            if (isBadVersion(m))
                r = m;
            else
                l = m + 1;
        }

        return l;
    }

//    just for not showing error
    private static boolean isBadVersion(int m) {
        return true;
    }
}
