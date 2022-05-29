class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        import statistics
        nums = nums1+nums2
        return statistics.median(nums)
        