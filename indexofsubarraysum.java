class indexofsubarraysum {
    public static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        // code here
        ArrayList<Integer> al = new ArrayList<>();
        int sum = 0;
        int i = 0;

        for(int j=0;j<n;j++) {
            sum += arr[j];

            while (sum > s && i <= j) {
                sum -= arr[i];
                i++;
            }

            if (sum == s && i<=j) {
                al.add(i + 1);  // 1-based index for the start
                al.add(j + 1);  // 1-based index for the end
                return al;
            }

            
        }

        al.add(-1);  // No subarray found
        return al;
    
    }
    
}


