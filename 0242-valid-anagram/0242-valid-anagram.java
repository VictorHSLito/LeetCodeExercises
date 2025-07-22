class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        HashSet<Character> set = new HashSet<>();

        for (Character c: s.toCharArray()) {
            set.add(c);
        }

        for (Character c: set) {
            int countS = countCharInString(s, c);
            int countT = countCharInString(t, c);
            if (countS != countT) return false;
        }
        return true;
    }

    private int countCharInString(String str, char ch) {
        int count = 0;

        for (char c: str.toCharArray()) {
            if (c == ch) {
                count++;
            }
        }

        return count;
    }
}