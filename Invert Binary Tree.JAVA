class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root==null)
        {
            return root;
        }
        TreeNode r = root.right;
        root.right = root.left;
        root.left = r;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
