/* Given an array arr containing non-negative integers. Count and return an array ans where ans[i] denotes the number of smaller elements on right side of arr[i].

Examples:

Input: arr[] = [12, 1, 2, 3, 0, 11, 4]
Output: [6, 1, 1, 1, 0, 1, 0]
Explanation: There are 6 smaller elements right after 12. There is 1 smaller element right after 1. And so on.
Input: arr[] = [1, 2, 3, 4, 5]
Output: [0, 0, 0, 0, 0]
Explanation: There are 0 smaller elements right after 1. There are 0 smaller elements right after 2. And so on.
 */


import java.util.ArrayList;

class countsmaller {
    int[] constructLowerArray(int[] arr) {
        int n = arr.length;
        int ans[] = new int[n];
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=n-1;i>=0;i--){
            if(list.isEmpty() || list.get(list.size()-1) < arr[i]){
                ans[i] = list.size();
                list.add(arr[i]);
            }else{
                int index = -1;
                int low = 0,high = list.size()-1;
                while(low<=high){ 
                    int mid = low+(high-low)/2;
                    if(arr[i]>list.get(mid)){
                        index = mid;
                        low = mid+1;
                    }else {
                        high=mid-1;
                    }
                }
                ans[i] = index+1;
                list.add(index+1,arr[i]);
            }
        }
        return ans;
    }
}


