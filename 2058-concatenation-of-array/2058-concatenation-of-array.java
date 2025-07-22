class Solution {
    public int[] getConcatenation(int[] nums) {
        
        int[] newArray = new int[nums.length * 2];
        int k = nums.length;

        for (int i =0; i < nums.length; i++) {
            newArray[i] = newArray[i + k] = nums[i];
        }

        return newArray;
    }
}