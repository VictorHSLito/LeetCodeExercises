class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        valores_vistos = {}
        for index, value in enumerate(nums):
            search = target - value
            if value in valores_vistos:
                return (index, valores_vistos[value])
            else:
                valores_vistos[search] = index


        