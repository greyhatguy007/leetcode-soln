class Solution:
    def isPalindrome(self, x: int) -> bool:
        return True if (str(x)[::-1]==str(x)) else False