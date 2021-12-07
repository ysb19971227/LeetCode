//给你链表的头节点 head 和一个整数 k 。 
//
// 交换 链表正数第 k 个节点和倒数第 k 个节点的值后，返回链表的头节点（链表 从 1 开始索引）。 
//
// 
//
// 示例 1： 
//
// 
//输入：head = [1,2,3,4,5], k = 2
//输出：[1,4,3,2,5]
// 
//
// 示例 2： 
//
// 
//输入：head = [7,9,6,6,7,8,3,0,9,5], k = 5
//输出：[7,9,6,6,8,7,3,0,9,5]
// 
//
// 示例 3： 
//
// 
//输入：head = [1], k = 1
//输出：[1]
// 
//
// 示例 4： 
//
// 
//输入：head = [1,2], k = 1
//输出：[2,1]
// 
//
// 示例 5： 
//
// 
//输入：head = [1,2,3], k = 2
//输出：[1,2,3]
// 
//
// 
//
// 提示： 
//
// 
// 链表中节点的数目是 n 
// 1 <= k <= n <= 10⁵ 
// 0 <= Node.val <= 100 
// 
// Related Topics 链表 双指针 👍 40 👎 0

package leetcode.editor.cn;
//java:交换链表中的节点
public class P1721SwappingNodesInALinkedList{
    public static void main(String[] args){
        Solution solution = new P1721SwappingNodesInALinkedList().new Solution();
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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode left = head;// 第k个节点
        ListNode right = head;// 倒数第k个节点
        for(int i = 1; i < k; i++){
            left = left.next;
        }
        ListNode cur = left;
        
        while(cur.next != null){
            right = right.next;
            cur = cur.next;
        }
        // 交换左右两个节点的值
        int m = right.val;
        right.val = left.val;
        left.val = m;
        return head;
    }
}

//leetcode submit region end(Prohibit modification and deletion)

}
