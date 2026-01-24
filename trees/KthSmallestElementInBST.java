// Approach 1: Inorder traversal using list (O(n) space)
class Solution {
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        inorder(root, list);

        for (int i = 0; i < list.size(); i++) {
            if (k == 1) {
                return list.get(i);
            }
            k--;
        }
        return -1;
    }

    private void inorder(TreeNode root, List<Integer> list) {
        if (root == null) return;

        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }
}


// Approach 2: Optimized inorder traversal (O(1) extra space)
class SolutionOptimized {
    int count = 0;
    int result = 0;

    public int kthSmallest(TreeNode root, int k) {
        inorder(root, k);
        return result;
    }

    private void inorder(TreeNode root, int k) {
        if (root == null) return;

        inorder(root.left, k);
        count++;
        if (count == k) {
            result = root.val;
            return;
        }
        inorder(root.right, k);
    }
}
