//给你单链表的头指针 head 和两个整数 left 和 right ，其中 left <= right 。请你反转从位置 left 到位置 right 的链
//表节点，返回 反转后的链表 。
// 
//
// 示例 1： 
//
// 
//输入：head = [1,2,3,4,5], left = 2, right = 4
//输出：[1,4,3,2,5]
// 
//
// 示例 2： 
//
// 
//输入：head = [5], left = 1, right = 1
//输出：[5]
// 
//
// 
//
// 提示： 
//
// 
// 链表中节点数目为 n 
// 1 <= n <= 500 
// -500 <= Node.val <= 500 
// 1 <= left <= right <= n 
// 
//
// 
//
// 进阶： 你可以使用一趟扫描完成反转吗？ 
// Related Topics 链表 👍 1090 👎 0

package leetcode.editor.cn;
//java:反转链表 II
public class P92ReverseLinkedListIi{
    public static void main(String[] args){
        Solution solution = new P92ReverseLinkedListIi().new Solution();
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
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode newHead = new ListNode(-1);
        newHead.next = head;
        ListNode slow = newHead;
        ListNode fast = newHead.next;


        for(int i = 0; i < m - 1; i++) {
            slow = slow.next;
            fast = fast.next;
        }
        //使用头插法
        for (int i = 0; i < n-m; i++) {
            ListNode remove = fast.next;
            fast.next = fast.next.next;

            remove.next = slow.next;
            slow.next = remove;
        }
        return newHead.next;
    }
}

//leetcode submit region end(Prohibit modification and deletion)

}
