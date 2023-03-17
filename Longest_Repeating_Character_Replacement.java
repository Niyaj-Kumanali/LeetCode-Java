package LeetCode;
//https://leetcode.com/problems/longest-repeating-character-replacement/

public class Longest_Repeating_Character_Replacement {
    public static void main(String[] args) {
        System.out.println(characterReplacement("ABAB", 2));
    }

    public static int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int maxCount = 0;
        int maxLength = 0;

        int i = 0;

        for (int j = 0; j < s.length(); j++) {
            count[s.charAt(j) - 'A'] += 1;
            maxCount = Math.max(maxCount, count[s.charAt(j) - 'A']);
            while (j - i + 1 - maxCount > k) {
                count[s.charAt(i) - 'A'] -= 1;
                i++;
            }
            maxLength = Math.max(maxLength, j - i + 1);
        }
        return maxLength;
    }
}
