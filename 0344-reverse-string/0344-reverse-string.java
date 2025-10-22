class Solution {
    public void reverseString(char[] s) {
        int length = s.length - 1;

        for(int i = 0, j = length; i <=j; i++, j--) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
    }
}