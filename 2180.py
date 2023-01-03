class Solution(object):
    def countEven(self, num):
        result = 0
        for i in range(1, num+1):
            L = [int(c) for c in str(i)]
            if sum(L) % 2 ==0:
                result += 1
        return result