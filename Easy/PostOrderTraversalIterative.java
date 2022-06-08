class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> helper = new ArrayList();
        if(root == null){
            return helper;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();
        //helper.add(root.val);
        stack.add(root);
        
        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            helper.add(node.val);
            if(node.left != null){
                stack.add(node.left);
            }
            if(node.right != null){
                stack.add(node.right);
            }
        }
        Collections.reverse(helper);
        return helper;
    }
}