public class Solution {

 

    public static BinaryTreeNode<Integer> lcaOfThreeNodes(BinaryTreeNode<Integer> root, int node1, int node2, int node3) {

 

        if ((root == null) || (root.data == node1 || root.data == node2 || root.data == node3)) {

 

            return root;

 

        }

 

        BinaryTreeNode<Integer> leftAns = lcaOfThreeNodes(root.left, node1, node2, node3);

 

        BinaryTreeNode<Integer> rightAns = lcaOfThreeNodes(root.right, node1, node2, node3);

 

        if (leftAns != null && rightAns != null)

 

            return root;

 

        else if (leftAns != null)

 

            return leftAns;
			        else

 

            return rightAns;

 

    }

 

}



 





