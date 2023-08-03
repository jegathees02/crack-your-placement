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
class Solution {
    public boolean rootToLeaf(TreeNode root, int targetSum, int sum) {
        if(root == null) return false;
        if(root.left == null && root.right == null) {
            sum += root.val;
            if(sum == targetSum) return true;
        }
        return rootToLeaf(root.left, targetSum,sum+root.val) || rootToLeaf(root.right,targetSum,sum+root.val);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;
        int sum = 0;
        return rootToLeaf(root, targetSum, sum);
    }
}