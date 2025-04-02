class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        s_string = set(s)

        for char in s_string:
            if t.count(char) != s.count(char):
                return False
        return True

