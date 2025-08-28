class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        Arrays.sort(nums);

        int count = 1;
        int max = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] + 1) {
                count++;
            }

            else if (nums[i] == nums[i-1]) 
                continue;

            else {
                if (count >= max) {
                    max = count;
                }
                count = 1;
            }
        }

        if (count >= max) max = count;

        return max;
    }
}