/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    ArrayList<Integer> leaf1 = new ArrayList<>();
    int index = 0;
    
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        traverse(root1,leaf1);
        return testLeaf(root2,leaf1);
    }
    
    public void traverse(TreeNode root, ArrayList<Integer> list)
    {
        if(root == null) return;
        if(root.left == null && root.right == null) list.add(root.val);
        traverse(root.left, list);
        traverse(root.right, list);
    }
    
    public boolean testLeaf(TreeNode root, ArrayList<Integer> list)
    {
        if(root == null) return true;
        if(root.left == null && root.right == null)
        {
            if(list.get(index) != root.val) return false;
            index++;
            return true;
        }
        return testLeaf(root.left, list) && testLeaf(root.right,list);
    }
}
