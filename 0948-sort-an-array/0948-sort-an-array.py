class Solution:
    def sortArray(self, nums: List[int]) -> List[int]:
        merge_sort(nums)
        return nums

def merge_sort(arr):
    size = len(arr)

    if size < 2:
        return

    middle = size//2

    left_half = arr[:middle]
    right_half = arr[middle:]

    merge_sort(left_half)
    merge_sort(right_half)

    merge(arr, left_half, right_half)

def merge(arr, left, right):
    left_size = len(left)
    right_size = len(right)

    i = j = k = 0
    
    while (i < left_size and j < right_size):
        if (left[i] <= right[j]):
            arr[k] = left[i]
            i += 1
        else:
            arr[k] = right[j]
            j += 1
        k += 1

    while (i < left_size):
        arr[k] = left[i]
        i += 1
        k += 1
    
    while (j < right_size):
        arr[k] = right[j]
        j += 1
        k += 1
    


