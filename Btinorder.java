import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

class Btinorder {
    /**
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res;
        try {
            res = new ArrayList<>();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        inorder(root, res);
        return res;        
    }

    /**
     * @param node
     * @param res
     */
    private void inorder(TreeNode node, List<Integer> res) {
        if (node == null) {
            return;
        }
        inorder(node.left, res);
        res.add(node.val);
        inorder(node.right, res);
    }    
}
