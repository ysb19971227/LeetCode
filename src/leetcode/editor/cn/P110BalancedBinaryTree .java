//给定一个二叉树，判断它是否是高度平衡的二叉树。 
//
// 本题中，一棵高度平衡二叉树定义为： 
//
// 
// 一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1 。 
// 
//
// 
//
// 示例 1： 
//
// 
//输入：root = [3,9,20,null,null,15,7]
//输出：true
// 
//
// 示例 2： 
//
// 
//输入：root = [1,2,2,3,3,null,null,4,4]
//输出：false
// 
//
// 示例 3： 
//
// 
//输入：root = []
//输出：true
// 
//
// 
//
// 提示： 
//
// 
// 树中的节点数在范围 [0, 5000] 内 
// -10⁴ <= Node.val <= 10⁴ 
// 
// Related Topics 树 深度优先搜索 二叉树 👍 879 👎 0

package leetcode.editor.cn;
//java:平衡二叉树
public class P110BalancedBinaryTree{
    public static void main(String[] args){
        Solution solution = new P110BalancedBinaryTree().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
//    //时间复杂度o(n^2)
//    private int height(TreeNode root) {
//        if(root == null) return 0;
//        int leftHeight = height(root.left);
//        int rightHeight = height(root.right);
//        return leftHeight > rightHeight ? leftHeight+1 : rightHeight+1;
//    }
//    public boolean isBalanced(TreeNode root) {
//        if (root == null) {
//            return true;
//        }
//        int left = height(root.left);
//        int right = height(root.right);
//
//        return Math.abs(left-right) <= 1 && isBalanced(root.left) && isBalanced(root.right);
//    }

    //时间复杂度o(n)
    private int height(TreeNode root) {
        if(root == null) return 0;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        if (leftHeight >= 0 && rightHeight >= 0 && Math.abs(leftHeight-rightHeight) <= 1) {
            return Math.max(leftHeight,rightHeight)+1;
        }else {
            return -1;
        }
    }

    public boolean isBalanced(TreeNode root) {
    if (root == null){
        return true;
    }
    return height(root) >= 0;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
