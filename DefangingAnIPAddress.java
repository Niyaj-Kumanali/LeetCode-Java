package LeetCode;//https://leetcode.com/problems/defanging-an-ip-address/


public class DefangingAnIPAddress {
    public static void main(String[] args)
    {
        String address = "1.1.1.1";
        System.out.println(defangIPaddr(address));
    }


    public static String defangIPaddr(String address) {
        String str = "";
        char[] arr = address.toCharArray();
        for(char i: arr) {
            if (i == '.')
                str += "[.]";
            else
                str += i;
        }
        return str;
    }
}