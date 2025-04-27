class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums);
        return nums;
    }

    private static void mergeSort(int [] array) {
        int length = array.length;
        if (length < 2) {
            return;
        }

        int middle = length / 2;

        int[] halfLeftArray = new int[middle];
        int[] halfRightArray = new int[length - middle];

        for (int i = 0; i < middle; i++) {
            halfLeftArray[i] = array[i];
        }

        for (int i = middle;  i < length;  i++) {
            halfRightArray[i - middle] = array[i];
        }

        mergeSort(halfLeftArray);
        mergeSort(halfRightArray);

        merge(array, halfLeftArray, halfRightArray);
    }

    private static void merge(int[] inputArray, int[] leftArray, int[] rightArray) {
        int leftSize = leftArray.length;
        int rightSize = rightArray.length;

        int i = 0, j = 0, k = 0;

        while (i < leftSize && j < rightSize) {
            if (leftArray[i] <= rightArray[j]) {
                inputArray[k] = leftArray[i];
                i++;
            }
            else {
                inputArray[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < leftSize) {
            inputArray[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < rightSize) {
            inputArray[k] = rightArray[j];
            j++;
            k++;
        }
    }
}