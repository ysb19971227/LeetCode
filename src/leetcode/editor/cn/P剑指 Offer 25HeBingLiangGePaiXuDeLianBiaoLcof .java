//输入两个递增排序的链表，合并这两个链表并使新链表中的节点仍然是递增排序的。 
//
// 示例1： 
//
// 输入：1->2->4, 1->3->4
//输出：1->1->2->3->4->4 
//
// 限制： 
//
// 0 <= 链表长度 <= 1000 
//
// 注意：本题与主站 21 题相同：https://leetcode-cn.com/problems/merge-two-sorted-lists/ 
// Related Topics 递归 链表 👍 186 👎 0

package leetcode.editor.cn;
//java:合并两个排序的链表
public class P剑指 Offer 25HeBingLiangGePaiXuDeLianBiaoLcof{
    public static void main(String[] args){
        Solution solution = new P剑指 Offer 25HeBingLiangGePaiXuDeLianBiaoLcof().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode newHead = new ListNode(-1);
        ListNode tmp = newHead;
        while (l1 != null && l2 != null){
            if (l1.val < l2.val) {
                tmp.next = l1;
                tmp = tmp.next;
                l1 = l1.next;
            }else {
                tmp.next = l2;
                tmp = tmp.next;
                l2 = l2.next;
            }
            if (l1 != null) {
                tmp.next = l1;
            }
            if (l2 != null) {
                tmp.next = l2;
            }
        }
        return newHead.next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
