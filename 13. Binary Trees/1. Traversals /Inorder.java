/**
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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>(); 
        inorder(result, root);
        return result; 
    }
    public void inorder(List<Integer> result, TreeNode root){
        if(root==null){
            return; 
        }
        inorder(result,root.left);
        result.add(root.val);
        inorder(result,root.right);
    }
}