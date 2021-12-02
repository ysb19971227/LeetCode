//给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。 
//
// 
//
// 示例 1： 
//
// 
//输入：head = [1,2,3,4,5], n = 2
//输出：[1,2,3,5]
// 
//
// 示例 2： 
//
// 
//输入：head = [1], n = 1
//输出：[]
// 
//
// 示例 3： 
//
// 
//输入：head = [1,2], n = 1
//输出：[1]
// 
//
// 
//
// 提示： 
//
// 
// 链表中结点的数目为 sz 
// 1 <= sz <= 30 
// 0 <= Node.val <= 100 
// 1 <= n <= sz 
// 
//
// 
//
// 进阶：你能尝试使用一趟扫描实现吗？ 
// Related Topics 链表 双指针 👍 1677 👎 0

package leetcode.editor.cn;
//java:删除链表的倒数第 N 个结点
public class P19RemoveNthNodeFromEndOfList{
    public static void main(String[] args){
        Solution solution = new P19RemoveNthNodeFromEndOfList().new Solution();
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {return null;}
        //首先用快慢指针定位倒数第n个节点
        ListNode fast = head;
        ListNode slow = head;
        int m = n;
        while (n != 0) {
            fast = fast.next;
            n--;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        if (m > 1) {
            slow.val = slow.next.val;
            slow.next = slow.next.next;
            return head;
        }else if (head.next == null){
            head = null;
        }else {
            ListNode cur = head;
            while (cur.next.next != null) {
                cur = cur.next;
            }
            cur.next = null;
        }
        return head;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
