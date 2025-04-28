class Solution {
    int getElementIndex(int[] array, int target) {
        int l = 0;
        int h = array.length - 1;
        
        while (l <= h) {
            int mid = l + (h - l) / 2;
            
            if (target == array[mid]) {
                return mid;
            }
            
            if (array[l] <= array[mid]) { // Left half sorted
                if (array[l] <= target && target < array[mid]) {
                    h = mid - 1;
                } else {
                    l = mid + 1;
                }
            } else { // Right half sorted
                if (array[mid] < target && target <= array[h]) {
                    l = mid + 1;
                } else {
                    h = mid - 1;
                }
            }
        }
        
        return -1;
    }
}
