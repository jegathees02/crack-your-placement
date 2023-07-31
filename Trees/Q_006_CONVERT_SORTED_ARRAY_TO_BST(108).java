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
    public TreeNode createTree(int[] nums, int left, int right) {
        if(right < left) return null;
    
    int mid = (left+right)/2;
    TreeNode root = new TreeNode(nums[mid]);
    root.left = createTree(nums,left,mid-1);
    root.right = createTree(nums,mid+1,right);
    return root;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        int l = 0;
        int r = nums.length-1;
        return createTree(nums,l,r);
    }
}