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
    TreeNode prev = null, head = null;
    public TreeNode increasingBST(TreeNode root) {
        if(root == null) return null; //Always check if a node is null, if it is ignore everything
        increasingBST(root.left); //In Order traversal so it goes left, parent, right
        
        /* Main part of the recursion that I should work on */ 
        if(prev != null){ //On first pass, gets ignored since previous isn't set to anything yet
            root.left = null; //Removes the left node in second pass
            prev.right = root; //Takes the parent of the left node and makes the parents a right child
        }
        
        if(head == null) head = root; //(Traversing parent) Stores the head of the tree as the most left node in the original tree
        prev = root; //Makes the left child prepared to be the next parent in the recursed loop above
        
        increasingBST(root.right); //Traversing the right node in the in order traversal 
        return head;
    }
}
