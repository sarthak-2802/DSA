// Answer to question no 2 
// 2) Given the root of a binary tree, return its maximum depth (i.e., the longest path from the root 
// down to a leaf node)
//  Input: [3,9,20,null,null,15,7]
//  Output: 3



class Sarthak {
    int val;
    Sarthak left;
    Sarthak right;

    TreeNode(int x) {
        val = x;
    }
}

public class Solution {
    public int maxDepth(Sarthak root) {
        if (root == null) {
            return 0;
        }
        
        int leftDepth = maxDepth(root.left);   
        int rightDepth = maxDepth(root.right);
        
        return Math.max(leftDepth, rightDepth) + 1;
    }
}
