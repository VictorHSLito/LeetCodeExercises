class Solution {
    public int removeElement(int[] nums, int val) {
        int j = nums.length - 1;
        int count = 0;

        for (int i = 0; i <= j; i++) {
            if (nums[i] == val) {
                while (j > i && nums[j] == val) {
                    j--; 
                }

                if (i >= j) {
                    break;
                }

                else {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    i--;
                    j--;
                }
            }
            else {
                count++;
            }
        }

        for(int num: nums) {
            System.out.println(num);
        }

        return count;
    }
}