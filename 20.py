class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        for c in s:
            if c in ['(','{','[']:
                stack.append(c)
            elif c ==')' and len(stack)!=0 and stack[-1]=='(':
                stack.pop()
            elif c ==']' and len(stack)!=0 and stack[-1]=='[':
                stack.pop()
            elif c =='}' and len(stack)!=0 and stack[-1]=='{':
                stack.pop()
            else:
                return False
        return stack==[]