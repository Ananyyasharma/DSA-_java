class missingnumberarray
{
    int missingNumber(int n, int arr[]) {
        int sum_arr=0;
        for(int i = 0;i<arr.length;i++){
            sum_arr+=arr[i];
        }
        int sum_n=(n*(n+1))/2;
        return sum_n-sum_arr;
    }
}
