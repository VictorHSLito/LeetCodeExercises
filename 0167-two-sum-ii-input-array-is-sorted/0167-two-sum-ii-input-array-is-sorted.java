class Solution {
    // Since the array is sorted, what can I do with this information?
    // -> Maybe we can get the target and "cut" the search based on it value
    // The tests have exactly one solution
    public int[] twoSum(int[] numbers, int target) {
        int j = numbers.length - 1;

        for (int i = 0; i < j; ) {
            int currentSum = numbers[i] + numbers[j];
            
            if (currentSum == target) return new int[] {i + 1, j + 1};

            if (currentSum > target) {
                j--;
            }
            else {
                i++;
            }
        }

        return new int[] {1, 2};
    }
}