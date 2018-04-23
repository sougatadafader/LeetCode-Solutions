
/*193 / 193 test cases passed.
Status: Accepted
Runtime: 13 ms
Beats other java submissions: 100%
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
class SymmetricTree {
    public static boolean isSymmetric(TreeNode root)
	{
        return symmetricHelper(root, root);
	}
	public static boolean symmetricHelper(TreeNode r1,TreeNode r2)
	{
		if(r1==null || r2==null)
		{
			if(r1 ==r2)
				return true;
			else
				return false;
		}
		if(r1.val==r2.val)
			return (symmetricHelper(r1.left, r2.right)&& symmetricHelper(r1.right, r2.left));
		else
			return false;
	}
}