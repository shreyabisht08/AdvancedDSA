/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false; // base case
        
        // If it's a leaf node, check if the remaining target equals its value
        if (root.left == null && root.right == null) {
            return targetSum == root.val;
        }
        
        // Recurse on left and right subtrees with reduced target
        return hasPathSum(root.left, targetSum - root.val) ||
               hasPathSum(root.right, targetSum - root.val);
    }

   
}
