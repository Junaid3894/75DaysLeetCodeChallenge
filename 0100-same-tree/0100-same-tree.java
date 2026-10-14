
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {

        // Step 1: If both nodes are null
        if (p == null && q == null) {
            return true;
        }

        // Step 2: If only one node is null
        if (p == null || q == null) {
            return false;
        }

        // Step 3: If values are different
        if (p.val != q.val) {
            return false;
        }

        // Step 4: Compare left and right subtrees
        return isSameTree(p.left, q.left)
                && isSameTree(p.right, q.right);
    }
}
