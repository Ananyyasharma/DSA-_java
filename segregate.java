lass segregate{
    void segregate0and1(int[] arr) {
        int s = 0;
        int l = arr.length - 1;
        while (s < l) {
            if (arr[s] == 0) {
                s++;
            } else if (arr[s] == 1) {
                if (arr[l] == 0) {
                    int temp = arr[s];
                    arr[s] = arr[l];
                    arr[l] = temp;
                    l--;
                    s++;
                } else {
                    l--;
                }
            }
        }
    }
}
