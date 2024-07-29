class Solution {
    public int helper(int[] num) {
        int count = 0;
        for (int i : num) {
            if (i == 1) count++;
        }
        return count;
    }

    public int rowWithMax1s(int arr[][]) {
        int maxRowIndex = -1;
        int maxCount = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = helper(arr[i]);
            if (count > maxCount) {
                maxCount = count;
                maxRowIndex = i;
            }
        }
        return maxRowIndex;
    }
}


