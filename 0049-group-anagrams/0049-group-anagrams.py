class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        hashMap = {}

        for string in strs:
            new_string = "".join(sorted(string))
            if new_string not in hashMap:
                hashMap[new_string] = [string]
            else:
                hashMap[new_string] = hashMap[new_string] + [string]

        return list(hashMap.values())