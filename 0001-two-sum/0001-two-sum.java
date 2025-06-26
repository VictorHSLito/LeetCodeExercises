class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> valuesSeems = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int value = target - nums[i];
            if (valuesSeems.containsKey(value)) {
                return new int[] {valuesSeems.get(value), i};
            }
            else {
                valuesSeems.put(nums[i], i);
            }
        }

        return new int[] {};
    }
}