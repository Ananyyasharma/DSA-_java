// User function Template for Java

import java.util.Arrays;

class missingarray{

    // Note that the size of the array is n-1
    int missingNumber(int n, int arr[]) {

        // Your Code Here
        Arrays.sort(arr);
        int a[]=new int[n];
        for(int i=0;i<n-1;i++){
            a[arr[i]-1]=arr[i];
        }
        for(int j=0;j<n;j++){
            if(a[j]==0)return j+1;
        }
        return 0;
    }
}
