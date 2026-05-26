class Solution {
    // Rule: The longest word should be merged into the final
    public String mergeAlternately(String word1, String word2) {
        int wl1 = word1.length();
        int wl2 = word2.length();
        
        int i = 0, j = 0;

        StringBuilder result = new StringBuilder();

        while (i < wl1 || j < wl2) {
            if (i < wl1) result.append(word1.charAt(i));
            if (j < wl2) result.append(word2.charAt(j));
            i++; j++;
        }

        return result.toString();
    }
}