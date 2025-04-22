class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        hashmap = {}

        for word in strs:
            new_word = ''.join(sorted(word))
            if new_word not in hashmap.keys():
                hashmap[new_word] = [word]
            else:
                hashmap[new_word] += [word]
    
        return list(hashmap.values())