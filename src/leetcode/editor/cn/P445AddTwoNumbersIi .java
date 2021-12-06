//给你两个 非空 链表来代表两个非负整数。数字最高位位于链表开始位置。它们的每个节点只存储一位数字。将这两数相加会返回一个新的链表。 
//
// 你可以假设除了数字 0 之外，这两个数字都不会以零开头。 
//
// 
//
// 示例1： 
//
// 
//
// 
//输入：l1 = [7,2,4,3], l2 = [5,6,4]
//输出：[7,8,0,7]
// 
//
// 示例2： 
//
// 
//输入：l1 = [2,4,3], l2 = [5,6,4]
//输出：[8,0,7]
// 
//
// 示例3： 
//
// 
//输入：l1 = [0], l2 = [0]
//输出：[0]
// 
//
// 
//
// 提示： 
//
// 
// 链表的长度范围为 [1, 100] 
// 0 <= node.val <= 9 
// 输入数据保证链表代表的数字无前导 0 
// 
//
// 
//
// 进阶：如果输入链表不能翻转该如何解决？ 
// Related Topics 栈 链表 数学 👍 451 👎 0

package leetcode.editor.cn;
//java:两数相加 II
public class P445AddTwoNumbersIi{
    public static void main(String[] args){
        Solution solution = new P445AddTwoNumbersIi().new Solution();
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null ) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        //第一步：反转链表
        ListNode newHead = new ListNode();
        newHead.next = l1;
        ListNode prev1 = newHead;
        ListNode cur1 = newHead.next;
        ListNode curNext1;
        while (cur1 != null) {
            curNext1 = cur1.next;
            cur1.next = prev1;
            prev1 = cur1;
            cur1 = curNext1;
        }
        l1.next = null;
        l1 = prev1;

        ListNode newHead2 = new ListNode();
        newHead2.next = l2;
        ListNode prev2 = newHead2;
        ListNode cur2 = newHead2.next;
        ListNode curNext2;
        while (cur2 != null) {
            curNext2 = cur2.next;
            cur2.next = prev2;
            prev2 = cur2;
            cur2 = curNext2;
        }
        l2.next = null;
        l2 = prev2;

        ListNode newHead3 = new ListNode(-1);
        ListNode tmp = newHead3;
        int carry = 0;
        while (prev1 != null || prev2 != null) {
            int x = prev1 == null ? 0 : prev1.val;
            int y = prev2 == null ? 0 : prev2.val;
            int sum = x + y + carry;
            carry = sum / 10;
            tmp.next = new ListNode(sum % 10);
            tmp = tmp.next;

            if (prev1 != null) {prev1 = prev1.next;}
            if (prev2 != null) {prev2 = prev2.next;}
        }
        if (carry == 1) {
            tmp.next = new ListNode(carry);
        }

        ListNode prev3 = newHead3;
        ListNode cur3 = newHead3.next;
        ListNode curNext3;
        while (cur3 != null) {
            curNext3 = cur3.next;
            cur3.next = prev3;
            prev3 = cur3;
            cur3 = curNext3;
        }
        newHead3.next.next = null;
        return prev3;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
