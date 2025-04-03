class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        s = set(strs)
        hashMap = {}
        menor = strs[0]
        string = ""
        # Acha a menor palavra dentro do conjunto
        for palavra in strs:
            if len(palavra) < len(menor):
                menor = palavra

        for index in range(len(menor)):
            prefixo = menor[:index+1]
            if not all(palavra.startswith(prefixo) for palavra in s):
                return menor[:index]
        
        return menor
