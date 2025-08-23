class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;

        while (j < n) {
            int boundary = m + j;

            while (i < boundary && nums1[i] <= nums2[j]) {
                i++;
            }

            for (int k = m + j; k > i; k--) {
                nums1[k] = nums1[k - 1];
            }

            nums1[i] = nums2[j];

            i++;
            j++;
        }
    }
}
