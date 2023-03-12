# https://leetcode.com/problems/palindrome-number/

class Solution:
    def isPalindrome(self, x):
        x = str(x)
        reverse = x[::-1]
        length = len(x)
        for i in range(length//2):
            if x[i] != reverse[i]:
                return False
        return True


x = 1234567898765432
print(Solution.isPalindrome(0, x))

