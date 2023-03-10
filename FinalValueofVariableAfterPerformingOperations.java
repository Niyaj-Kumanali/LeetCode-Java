package LeetCode;//https://leetcode.com/problems/final-value-of-variable-after-performing-operations/

public class FinalValueofVariableAfterPerformingOperations {
    public static void main(String[] args)
    {
        String[] operations = { "--X","X++","X++" };
        System.out.println(finalValueAfterOperations(operations));

        operations = new String[]{"++X", "++X", "X++"};
        System.out.println(finalValueAfterOperations(operations));

        operations = new String[]{"X++","++X","--X","X--"};
        System.out.println(finalValueAfterOperations(operations));
    }

    public static int finalValueAfterOperations(String[] operations) {
        int result = 0;
        for (String str : operations)
            result += str.charAt(1) == '+' ? 1 : -1;
        return result;
    }

//    public int finalValueAfterOperations(String[] operations) {
//        int ans = 0;
//        for (String str : operations)
//        {
//            if (str.charAt(1) == '+') {
//                ans++;
//            } else
//                ans--;
//        }
//        return ans;
//    }
}
