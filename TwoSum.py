# https://leetcode.com/problems/two-sum/



#Program that takes an array of int and returns sum of array values that equals target value
class Solution:
    def twoSum(self, nums, target):
        length = len(nums)
        for i in range(length):
            for j in range(i + 1, length):
                if nums[i] + nums[j] == target:
                    return [i, j]

nums = [2,7,11,15]
target = 9

print(Solution.twoSum(0,nums,target))
