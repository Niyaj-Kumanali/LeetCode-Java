package LeetCode;
//https://leetcode.com/problems/find-palindrome-with-fixed-length/

import java.util.ArrayList;
import java.util.Arrays;

public class FindPalindromeWithFixedLength {
    public static void main(String[] args) {
        int[] queries = {965598625,198268812,541725641,18,9,446798683,343077910,26,31};
        int intLength = 3;
        System.out.println(Arrays.toString(kthPalindrome(queries, intLength)));
    }
    public static long[] kthPalindrome(int[] queries, int intLength) {
        long[] res = new long[queries.length];
        ArrayList<Integer> palindromes = palindrome((int) Math.pow(10,intLength-1), (int) Math.pow(10,intLength));
        System.out.println(palindromes);
        for (int i=0; i< queries.length; i++)
            res[i] = queries[i]-1 < palindromes.size()?palindromes.get(queries[i]==0? queries[i]: queries[i]-1):-1;
        return res;
    }
    public static ArrayList<Integer> palindrome(int srange, int erange)
    {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=srange; i<erange; i++)
            if ( i == reversed(i))
                list.add(i);
        return list;
    }
    public static long reversed(int num) {
        long reverse = 0;
        while (num != 0) {
            reverse  = reverse * 10 + num % 10;
            num /=10;
        }
        return reverse;
    }

}
