class Solution:
    def isPalindrome(self, s: str) -> bool:
        a = ''
        for c in s:
            if c.isalnum():
                a += c.lower()
        return a == a[::-1]