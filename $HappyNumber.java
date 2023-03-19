package LeetCode;
//https://leetcode.com/problems/happy-number/

public class $HappyNumber {
    public static void main(String[] args) {
        System.out.println(isHappy(19));
        System.out.println(isHappy2(19));

    }

    public static boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do{
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        }while(slow != fast);

        if (slow == 1)
            return true;
        return false;
    }

    public static int findSquare(int n){
        int square = 0;
        while(n != 0){
            int rem = n % 10;
            square += rem * rem;
            n = n/10;
        }
        return square;
    }

//    gives time limit exceeds error when its false
    public static boolean isHappy2(int n) {
        while (n != 1){
            int ans = 0;
            while(n != 0){
                int rem = n % 10;
                ans += rem * rem;
                n = n/10;
            }
            n = ans;
        }
        return true;
    }
}
