package LeetCode;
//https://leetcode.com/problems/bulls-and-cows/

public class Bulls_and_Cows {
    public static void main(String[] args) {
        System.out.println(getHint("1123", "0111"));
    }

    public static String getHint(String secret, String guess) {
        int A = 0;
        int B = 0;
        int[] count1 = new int[10];
        int[] count2 = new int[10];

        for (int i = 0; i < secret.length(); ++i)
            if (secret.charAt(i) == guess.charAt(i))
                ++A;
            else {
                ++count1[secret.charAt(i) - '0'];
                ++count2[guess.charAt(i) - '0'];
            }

        for (int i = 0; i < 10; ++i)
            B += Math.min(count1[i], count2[i]);

        return String.valueOf(A) + "A" + String.valueOf(B) + "B";
    }
}