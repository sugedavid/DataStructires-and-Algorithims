package Trees;

public class MaximumDepthBinaryTree {
	
	//	 Definition for a binary tree node.
	public class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode() {}
       TreeNode(int val) { this.val = val; }
       TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
	}
	  
	public int maxDepth(TreeNode root) {
        
        // TC: 0(n)
        // SC: 0(1)
        if(root == null){
            return 0; // base case
        }
        else if (root.right == null && root.left == null){
            return 1;
        }
        else{
            return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
        }
        
    }

}
