from dataclasses import List
class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        if not nums:
            return 0
        max_o = 0
        c = 0
        for i in nums:
            if i == 1:
                c+=1
            else:
                max_o = max(c,max_o)
                c = 0
        return max(c,max_o)
        