/*
57 / 57 test cases passed.
Status: Accepted
Runtime: 5 ms
Beats other java submission by 94.31%
*/


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null || q==null){
            if(p==q)
                return true;
            else
                return false;
        }
        
        if(p.val==q.val){
            return (isSameTree(p.left,q.left)&& isSameTree(p.right,q.right));
            
        }
        else
            return false;
        
    }
}