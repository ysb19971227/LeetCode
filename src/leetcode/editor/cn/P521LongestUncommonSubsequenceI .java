//给你两个字符串，请你从这两个字符串中找出最长的特殊序列。 
//
// 「最长特殊序列」定义如下：该序列为某字符串独有的最长子序列（即不能是其他字符串的子序列）。 
//
// 子序列 可以通过删去字符串中的某些字符实现，但不能改变剩余字符的相对顺序。空序列为所有字符串的子序列，任何字符串为其自身的子序列。 
//
// 输入为两个字符串，输出最长特殊序列的长度。如果不存在，则返回 -1。 
//
// 
//
// 示例 1： 
//
// 输入: "aba", "cdc"
//输出: 3
//解释: 最长特殊序列可为 "aba" (或 "cdc")，两者均为自身的子序列且不是对方的子序列。 
//
// 示例 2： 
//
// 输入：a = "aaa", b = "bbb"
//输出：3
// 
//
// 示例 3： 
//
// 输入：a = "aaa", b = "aaa"
//输出：-1
// 
//
// 
//
// 提示： 
//
// 
// 两个字符串长度均处于区间 [1 - 100] 。 
// 字符串中的字符仅含有 'a'~'z' 。 
// 
// Related Topics 字符串 👍 110 👎 0

package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

//java:最长特殊序列 Ⅰ
public class P521LongestUncommonSubsequenceI{
    public static void main(String[] args){
        Solution solution = new P521LongestUncommonSubsequenceI().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findLUSlength(String a, String b) {
        if (a.equals(b)) {
            return -1;
        }
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < a.length(); i++) {
            for (int j = i; j <= a.length(); j++) {
                String tmp = a.substring(i,j);
                if (!b.contains(tmp)) {
                    integerList.add(tmp.length());
                }
            }
        }
        for (int i = 0; i < b.length(); i++) {
            for (int j = i; j <= b.length(); j++) {
                String tmp = b.substring(i,j);
                if (!a.contains(tmp)) {
                    integerList.add(tmp.length());
                }
            }
        }
        int index1 = 0;
        int[] arr1 = new int[integerList.size()];
        for (int x:integerList) {
            arr1[index1++] = x;
        }
        int max1 = arr1[0];
        for (int i = 1; i < arr1.length; i++) {
            if (arr1[i] > max1) {
                max1 = arr1[i];
            }
        }
        return max1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
