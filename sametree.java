class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null || p.val != q.val) {
            return false;
        } else {
            boolean lSol = isSameTree(p.left, q.left);
            if (lSol) {
                return isSameTree(p.right, q.right);
            } else {
                return false;
            }
        }
    }
}
