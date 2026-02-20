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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer> hash= new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            hash.put(inorder[i],i);
        }
       return  newtree(preorder,inorder,hash,0,0,inorder.length-1);
    }

        public TreeNode newtree(int[] preorder,int[] inorder,HashMap<Integer,Integer> hash,int index,int left,int right){
            TreeNode root=new TreeNode(preorder[index]);
            int mid=hash.get(preorder[index]);
            if(left<mid){
                root.left=newtree(preorder,inorder,hash,index+1,left,mid-1);

            }
            if(mid<right){
                root.right=newtree(preorder,inorder,hash,index+mid-left+1,mid+1,right) ;     }
            return root;
        }
        
    }
