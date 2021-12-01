//输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。 
//
// 
//
// 示例 1： 
//
// 输入：head = [1,3,2]
//输出：[2,3,1] 
//
// 
//
// 限制： 
//
// 0 <= 链表长度 <= 10000 
// Related Topics 栈 递归 链表 双指针 👍 209 👎 0

package leetcode.editor.cn;
//java:从尾到头打印链表
public class P剑指 Offer 06CongWeiDaoTouDaYinLianBiaoLcof{
    public static void main(String[] args){
        Solution solution = new P剑指 Offer 06CongWeiDaoTouDaYinLianBiaoLcof().new Solution();
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
    public int[] reversePrint(ListNode head) {
        ListNode cur = head;
        int length = 0;
        while (cur != null) {
            cur = cur.next;
            length++;
        }
        cur = head;
        int[] arr = new int[length];
        int k = 0;
        while (cur != null) {
            arr[length-1] = cur.val;
            length--;
            cur = cur.next;
        }
        return arr;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
