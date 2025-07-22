class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] newArray = new int[nums.length * 2];

        int k = 0;

        for (int i =0; i < nums.length; i++) {
            newArray[i] = nums[i];
        }

        for (int j = nums.length; j < newArray.length; j++) {
            newArray[j] = nums[k];
            k++;
        }

        return newArray;
    }
}