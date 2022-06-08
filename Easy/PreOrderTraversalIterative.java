class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> helper = new ArrayList();
        if(root == null){
            return helper;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();
        //helper.add(root.val);
        stack.push(root);
        
        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            helper.add(node.val);
            if(node.right != null){
                stack.add(node.right);
            }
            if(node.left != null){
                stack.add(node.left);
            }
        }
        return helper;
        
        
    }
    
    
}