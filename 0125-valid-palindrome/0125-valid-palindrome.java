class Solution {
    public boolean isPalindrome(String s) {
        if (s.isBlank()) return true;

        int stringSize = s.length();

        String modifiedString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        modifiedString = modifiedString.replace(",", "");

        char[] charArray = modifiedString.toCharArray();

        int j = charArray.length - 1;

        for (int i = 0; i <= j; i++, j--) {
            if (charArray[i] != charArray[j]) return false;
        }

        return true;
    }
}