//给定一个单链表 L 的头节点 head ，单链表 L 表示为： 
//
// 
//L0 → L1 → … → Ln - 1 → Ln
// 
//
// 请将其重新排列后变为： 
//
// 
//L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → … 
//
// 不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。 
//
// 
//
// 示例 1： 
//
// 
//
// 
//输入：head = [1,2,3,4]
//输出：[1,4,2,3] 
//
// 示例 2： 
//
// 
//
// 
//输入：head = [1,2,3,4,5]
//输出：[1,5,2,4,3] 
//
// 
//
// 提示： 
//
// 
// 链表的长度范围为 [1, 5 * 10⁴] 
// 1 <= node.val <= 1000 
// 
// Related Topics 栈 递归 链表 双指针 👍 719 👎 0

package leetcode.editor.cn;

import java.util.HashMap;

//java:重排链表
public class P143ReorderList{
    public static void main(String[] args){
        Solution solution = new P143ReorderList().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return;
        }
        //第一步找到中间节点
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        //第二步，此时slow的位置就是中间节点，然后反转链表
        ListNode cur = slow.next;
        ListNode curNext;
        while (cur != null) {
            curNext = cur.next;
            cur.next = slow;
            slow = cur;
            cur = curNext;
        }
        fast = slow;
        slow = head;
        //第三步，进行链表的衔接
        ListNode slowNext;
        ListNode fastNext;
        while (slow != fast ) {
            slowNext = slow.next;
            slow.next = fast;
            slow = slowNext;
            fastNext = fast.next;
            fast.next = slow;
            fast = fastNext;
            if (slow.next == fast) {
                fast.next = null;
                return;
            }
        }
        //最后将最后一个节点置为null
        slow.next = null;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
