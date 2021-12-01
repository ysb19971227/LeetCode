//定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。 
//
// 
//
// 示例: 
//
// 输入: 1->2->3->4->5->NULL
//输出: 5->4->3->2->1->NULL 
//
// 
//
// 限制： 
//
// 0 <= 节点个数 <= 5000 
//
// 
//
// 注意：本题与主站 206 题相同：https://leetcode-cn.com/problems/reverse-linked-list/ 
// Related Topics 递归 链表 👍 336 👎 0

package leetcode.editor.cn;
//java:反转链表
public class P剑指 Offer 24FanZhuanLianBiaoLcof{
    public static void main(String[] args){
        Solution solution = new P剑指 Offer 24FanZhuanLianBiaoLcof().new Solution();
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
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode prev = head;
        ListNode cur = head.next;
        ListNode curNext;
        while (cur != null) {
            curNext = cur.next;
            cur.next = prev;
            prev = cur;
            cur = curNext;
        }
        head.next = null;
        head = prev;
        return head;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
