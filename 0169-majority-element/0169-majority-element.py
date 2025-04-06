class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        hashMap = {}

        for number in nums:
            if number not in hashMap:
                hashMap[number] = 1
            else:
                hashMap[number] += 1

        max_key = max(hashMap, key=hashMap.get)    
        return max_key
