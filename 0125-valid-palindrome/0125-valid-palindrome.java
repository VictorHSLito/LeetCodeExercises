class Solution {
    public boolean isPalindrome(String s) {
        if (s.isBlank()) return true;

        String modifiedString = s.replaceAll("[^a-zA-Z0-9]", "").replace(",", "").toLowerCase();

        char[] charArray = modifiedString.toCharArray();

        int j = charArray.length - 1;

        for (int i = 0; i <= j; i++, j--) {
            if (charArray[i] != charArray[j]) return false;
        }

        return true;
    }
}