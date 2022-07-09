import numpy as np
from dataclasses import List
class Solution:
    def sortedSquares(self, l: List[int]) -> List[int]:
        l=np.array(l)
        l=np.square(l)
        return np.sort(l)