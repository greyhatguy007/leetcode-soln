from typing import List
class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        length = len(nums)
        for i in range(length):
            diff = target - nums[i]         
            if diff in nums[i+1:]: 
                index = nums[i + 1:].index(diff)+i+1
                return [i, index]
            