from dataclasses import List
class Solution:
    def maximumWealth(self, accounts: List[List[int]]) -> int:
        ma=0
        for i in accounts:
            if sum(i)>ma:
                ma=sum(i)
        return ma