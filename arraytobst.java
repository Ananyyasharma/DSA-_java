import java.util.Arrays;

class arraytobst {
    public Node sortedArrayToBST(int[] nums) {
       // Code here
       if(nums.length == 0) return null;
       if(nums.length == 1) return new Node();
       int mid = (nums.length-1)/2;
       Node node = new Node();
       node.left = sortedArrayToBST(Arrays.copyOfRange(nums, 0, mid));
       node.right = sortedArrayToBST(Arrays.copyOfRange(nums, mid+1, nums.length));
       return node;
   }

}