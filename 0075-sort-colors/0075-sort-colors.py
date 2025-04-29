class Solution:
    def sortColors(self, nums: List[int]) -> None:
        i = 0
        size = len(nums)
        for i in range(size):
            j = i + 1
            for j in range(size):
                if nums[i] <= nums[j]:
                    nums[i], nums[j] = nums[j], nums[i]