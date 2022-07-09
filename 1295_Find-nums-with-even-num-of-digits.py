from dataclasses import List
class Solution:
    def findNumbers(self, nums: List[int]) -> int:
        a = 0
        for i in nums:
            if(len(str(i))%2==0):
                a+=1
        return a