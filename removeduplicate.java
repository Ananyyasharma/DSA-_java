class Solution {
    String removeDups(String str) {
        // code here
        String ans = new String();
        for(char c : str.toCharArray()) {
            if(ans.indexOf(c) == -1) {
                ans+=c;
            }
        }
        return ans;
    }
}
