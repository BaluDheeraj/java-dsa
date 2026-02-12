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
    public void view(TreeNode curr, List<Integer> result,int depth){
        if(curr==null){
            return;
        }
        if(depth==result.size()){
            result.add(curr.val);

        }
        view(curr.right,result,depth+1);
        view(curr.left,result,depth+1);
    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result=new LinkedList<>();
        view(root,result,0);
        return result;
        
    }
}
