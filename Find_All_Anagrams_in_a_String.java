package LeetCode;
//https://leetcode.com/problems/find-all-anagrams-in-a-string

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Find_All_Anagrams_in_a_String {
    public static void main(String[] args) {
        System.out.println(findAnagrams("ababa", "ab"));
    }

//    Time limit Exceeded
//    public static List<Integer> findAnagrams(String s, String p) {
//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i < s.length() - p.length() + 1; i++) {
//            if (anagram(s.substring(i, i+p.length()), p))
//                list.add(i);
//        }
//        return list;
//    }
//
//    public static boolean anagram ( String str1, String str2 ) {
//        char[] strOne = str1.toCharArray ();
//        char[] strTwo = str2.toCharArray ();
//        int[] arr = new int[ strOne.length ];
//        Arrays.sort ( strOne );
//        Arrays.sort ( strTwo );
//        boolean flag = false;
//        for ( int i = 0; i < strOne.length; i++ ) {
//            if ( strOne[ i ] == strTwo[ i ] )
//                arr[ i ]++;
//            if ( arr[ i ] == 0 )
//                flag = true;
//        }
//        if ( flag )
//            return false;
//        return true;
//    }

    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        int[] count = new int[128];
        int required = p.length();

        for (final char c : p.toCharArray())
            ++count[c];

        for (int l = 0, r = 0; r < s.length(); ++r) {
            if (--count[s.charAt(r)] >= 0)
                --required;
            while (required == 0) {
                if (r - l + 1 == p.length())
                    ans.add(l);
                if (++count[s.charAt(l++)] > 0)
                    ++required;
            }
        }

        return ans;
    }
}
