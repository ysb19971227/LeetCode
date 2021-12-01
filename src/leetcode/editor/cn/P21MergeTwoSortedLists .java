//将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
//
// 
//
// 示例 1： 
//
// 
//输入：l1 = [1,2,4], l2 = [1,3,4]
//输出：[1,1,2,3,4,4]
// 
//
// 示例 2： 
//
// 
//输入：l1 = [], l2 = []
//输出：[]
// 
//
// 示例 3： 
//
// 
//输入：l1 = [], l2 = [0]
//输出：[0]
// 
//
// 
//
// 提示： 
//
// 
// 两个链表的节点数目范围是 [0, 50] 
// -100 <= Node.val <= 100 
// l1 和 l2 均按 非递减顺序 排列 
// 
// Related Topics 递归 链表 👍 2064 👎 0

package leetcode.editor.cn;
//java:合并两个有序链表

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

public static class P21MergeTwoSortedLists {
    public static void main(String[] args) {
        Solution solution = new P21MergeTwoSortedLists().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)

// Definition for singly-linked list.


    class Solution {
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            ListNode newHead = new ListNode(-1);
            ListNode tmp = newHead;
            while (list1 != null && list2 != null) {
                if (list1.val < list2.val) {
                    tmp.next = list1;
                    tmp = tmp.next;
                    list1 = list1.next;
                } else {
                    tmp.next = list2;
                    tmp = tmp.next;
                    list2 = list2.next;
                }
            }
            if (list1 != null) {
                tmp.next = list1;
            }
            if (list2 != null) {
                tmp.next = list2;
            }
            return newHead.next;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)
}
}

