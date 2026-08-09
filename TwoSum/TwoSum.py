class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        for i,a in enumerate(nums):
            b = target-a
            if b in nums[(i+1):]:
                j = nums.index(b, (i+1))
                return [i,j]
        
        return [0,0]
