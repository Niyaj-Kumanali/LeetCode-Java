# https://leetcode.com/problems/valid-palindrome/

class Solution:
    def isPalindrome(self, x):
        x = x.lower()
        temp = ""
        for i in range(len(x)):
            if x[i] >= chr(48) and x[i] <= chr(57) or x[i] >= chr(97) and x[i] <= chr(122):
                temp += x[i]
        reverse = temp[::-1]
        return temp == reverse


x = "a."
print(Solution.isPalindrome(0, x))