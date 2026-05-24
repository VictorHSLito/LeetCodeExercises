class Solution {
    // 1. To be palindrome the string need be the same in reverse
    // 2. What I can do is compare the first letters and the last ones to see if they matches
    // 2. a) If they matches, move on
    // 2. b) If they not, save the letter and continues the comparation
    // 3. After all the comparations, if the number of letter is the same, means we can remove that previous saved letter
    // and the world will be palindrome
    public boolean validPalindrome(String s) {
        int j = s.length() - 1;

        char[] charArray = s.toCharArray();

        for (int i = 0; i < j; i++, j--) {
            if (charArray[i] == charArray[j]) continue;

            return (removingPlusOneCharacter(charArray, i + 1, j) || removingPlusOneCharacter(charArray, i, j - 1));
        }

        return true;
    }

    private static boolean removingPlusOneCharacter(char[] array, int i, int j) {
        int l = j;
        for (int k = i; k < l; k++, l--) {
            if (array[k] != array[l]) return false;
        }

        return true;
    }
}