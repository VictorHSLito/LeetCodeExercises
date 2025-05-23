class Solution:
    def sortColors(self, nums: List[int]) -> None:
        left = i = 0
        right = len(nums) - 1
        
        while i <= right:
            if nums[i] == 0:
                nums[i], nums[left] = nums[left], nums[i]
                left += 1
            elif nums[i] == 2:
                nums[i], nums[right] = nums[right], nums[i]
                right -= 1
                i -= 1
            i += 1
            
