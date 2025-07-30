class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums);
        return nums;
    }


    private static void mergeSort(int[] array) {
        int size = array.length;

        if (size < 2) {
            return;
        }

        int middle = size/2;

        int[] leftArray = new int[middle];
        int[] rightArray = new int[size-middle];

        for (int i = 0; i < middle; i++) {
            leftArray[i] = array[i];
        }

        for (int j = middle; j < size; j++) {
            rightArray[j-middle] = array[j];
        }

        mergeSort(leftArray);
        mergeSort(rightArray);

        merge(array, leftArray, rightArray);
    }


    private static void merge(int[] array, int[] leftArray, int[] rightArray) {
        int leftSize = leftArray.length;
        int rightSize = rightArray.length;

        int i = 0, j = 0, k = 0;
        while (i < leftSize && j < rightSize) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            }
            else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < leftSize) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < rightSize) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }
}