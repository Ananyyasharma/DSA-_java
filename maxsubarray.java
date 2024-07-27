public class Solution {

    

    public static long maxSubarraySum(int[] arr, int n) {

        // write your code here

        if(n==0) return 0;

        int max=arr[0];//1

        int sum=arr[0];

        for(int i=1;i<arr.length;i++){

            sum+=arr[i];//1+2

            if(sum>=max){

                max=sum;

            }

            

        }

        

        return Math.max(max,arr[n-1])<0?0:Math.max(max,arr[n-1]);

    }

 

}


