class Solution {
    // Since the array is sorted, what can I do with this information?
    // -> Maybe we can get the target and "cut" the search based on it value
    // The tests have exactly one solution
    public int[] twoSum(int[] numbers, int target) {
        if (numbers.length == 2) {
            return new int[] {1, 2};
        }

        int arrayLength = numbers.length - 1;

        int j = arrayLength;

        for (int i = 0; i < arrayLength; i++) {
            int find = target - numbers[j];
            for (int k = 0; k < j; k++) {
                if (numbers[k] == find) return new int[] {k + 1, j + 1};
            }
            j--;
        }

        return new int[] {1, 2};
    }
}