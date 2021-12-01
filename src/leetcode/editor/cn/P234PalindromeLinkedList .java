//给你一个单链表的头节点 head ，请你判断该链表是否为回文链表。如果是，返回 true ；否则，返回 false 。 
//
// 
//
// 示例 1： 
//
// 
//输入：head = [1,2,2,1]
//输出：true
// 
//
// 示例 2： 
//
// 
//输入：head = [1,2]
//输出：false
// 
//
// 
//
// 提示： 
//
// 
// 链表中节点数目在范围[1, 10⁵] 内 
// 0 <= Node.val <= 9 
// 
//
// 
//
// 进阶：你能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？ 
// Related Topics 栈 递归 链表 双指针 👍 1187 👎 0

package leetcode.editor.cn;
//java:回文链表
class P234PalindromeLinkedList{
    public static void main(String[] args){
        Solution solution = new P234PalindromeLinkedList().new Solution();
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
    //判断是否为回文结构
    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return true;
        }
        //第一步，定义快慢指针，找到中间节点
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        //此时slow的位置就是中间节点，然后将slow之后的链表反转
        ListNode cur = slow.next;
        ListNode curNext;
        while (cur != null) {
            curNext = cur.next;
            cur.next = slow;
            slow = cur;
            cur = curNext;
        }
        //此时slow的位置在最后一位，向中间遍历不相等返回false
        while (slow != head) {
            if (head.val != slow.val) {
                return false;
            }
            if (head.next == slow) {
                return true;
            }
            slow = slow.next;
            head = head.next;
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
