package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class RemoveOuterParentheses {
    public static void main(String[] args) {
        String s = "(())";
        System.out.println(removeOuterParentheses(s));
    }

    public static String removeOuterParentheses(String s) {
        char[] arr = s.toCharArray();
        int start = 0;
        List<Integer> indexs = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(') {
                start++;
            } else if (arr[i] == ')') {
                start--;
            }
            if (indexs.size() % 2 == 0 && start == 1) {
                indexs.add(i + 1);
            } else if (indexs.size() % 2 != 0 && start == 0) {
                indexs.add(i);
            }
        }
        String res = "";
        for (int i = 0; i < indexs.size(); i += 2) {
            res += s.substring(indexs.get(i), indexs.get(i + 1));
        }
        return res;
    }
}
