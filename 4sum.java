/*Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:

0 <= a, b, c, d < n
a, b, c, and d are distinct.
nums[a] + nums[b] + nums[c] + nums[d] == target
You may return the answer in any order.

 

Example 1:

Input: nums = [1,0,-1,0,-2,2], target = 0
Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
Example 2:

Input: nums = [2,2,2,2,2], target = 8
Output: [[2,2,2,2]]
 

Constraints:

1 <= nums.length <= 200
-109 <= nums[i] <= 109
-109 <= target <= 109 */

import java.util.*;
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
         Arrays.sort(nums);
         List<List<Integer>> q=new ArrayList<>();
         int n=nums.length;
         for(int i=0;i<n-3;i++)
         {
             if(i>0&&nums[i]==nums[i-1])
             {
                 continue;
             }
             for(int j=i+1;j<n;j++)
             {
                 if(j>i+1&&nums[j]==nums[j-1])
                 {
                     continue;
                 }
                 int k=j+1;
                 int l=n-1;
                 while(k<l)
                 {
                    long sum = nums[i];
                    sum += nums[j];
                    sum += nums[k];
                    sum += nums[l];
                    if(target==sum)
                    {
                        ArrayList<Integer> al=new ArrayList<>();
                        al.add(nums[i]);
                        al.add(nums[j]);
                        al.add(nums[k]);
                        al.add(nums[l]);
                        Collections.sort(al);
                        q.add(al);
                        k++;
                        l--;

                    
                    while(k<l&&nums[l]==nums[l+1])
                    {
                        l--;
                    }
                    while(k<l&&nums[k]==nums[k-1])
                    {
                        k++;
                    }
                    }
                    else if(sum<target)
                    {
                        k++;
                    }
                    else
                    {
                        l--;
                    }
                 }
             }
         }

         return q;
           
        }
      
       
    
}