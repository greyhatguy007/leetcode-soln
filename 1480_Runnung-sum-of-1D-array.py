from dataclasses import List
class Solution:
    def runningSum(self, nums: List[int]) -> List[int]:
        ans = []
        for i in range(1,len(nums)+1):
            ans.append(sum(nums[:i]))
        return ans