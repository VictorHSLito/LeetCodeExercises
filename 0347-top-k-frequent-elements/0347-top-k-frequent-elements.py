class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        hashmap = {}
        results = []
        
        for num in nums:
            if num not in hashmap.keys():
                hashmap[num] = 1
            else:
                hashmap[num] += 1
        
        for key, value in hashmap.items():
            results.append([value, key])
        results.sort()

        r = []

        while len(r) < k:
            r.append(results.pop()[1])
        return r