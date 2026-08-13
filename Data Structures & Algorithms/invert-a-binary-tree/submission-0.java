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
    public TreeNode invertTree(TreeNode root) {

        if(root == null){
            return null;
        }

        //idea: recursion 反轉每一個node right left 直到是null
        //不要想得太複雜！！：Ｄ You can do it!!
        invertNode(root);

        invertTree(root.left);
        invertTree(root.right);
        
        return root;
    }

    //反轉
    public TreeNode invertNode(TreeNode node){
        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;
        return node;
    }

}
