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
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums == null || nums.length == 0){
            return null;
        }
        return helper(nums, 0, nums.length-1);
        
    }
    
    public static TreeNode helper(int[] nums, int low, int high){
        if(low > high){
            return null;
        }
        TreeNode root = new TreeNode(nums[low + (high - low)/2]);
        root.left = helper(nums, low, low+(high-low)/2 - 1);
        root.right = helper(nums, low+(high-low)/2 + 1, high);
        return root;
    }
}