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
    public TreeNode bstFromPreorder(int[] preorder) {
        return help(preorder,0,preorder.length-1);
        
    }
    public TreeNode help(int[] preorder,int st,int end){
        if(st>end){
            return null;
        }
        TreeNode root= new TreeNode(preorder[st]);
        int i;
        for( i=st;i<=end;i++){
            if(preorder[i]>root.val){
                break;
            }
        }
        root.left=help(preorder,st+1,i-1);
        root.right=help(preorder,i,end);
        return root;
    }
}
