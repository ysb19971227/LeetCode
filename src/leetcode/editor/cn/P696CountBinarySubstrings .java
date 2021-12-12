//给定一个字符串 s，统计并返回具有相同数量 0 和 1 的非空（连续）子字符串的数量，并且这些子字符串中的所有 0 和所有 1 都是成组连续的。 
//
// 重复出现（不同位置）的子串也要统计它们出现的次数。 
// 
//
// 示例 1： 
//
// 
//输入：s = "00110011"
//输出：6
//解释：6 个子串满足具有相同数量的连续 1 和 0 ："0011"、"01"、"1100"、"10"、"0011" 和 "01" 。
//注意，一些重复出现的子串（不同位置）要统计它们出现的次数。
//另外，"00110011" 不是有效的子串，因为所有的 0（还有 1 ）没有组合在一起。 
//
// 示例 2： 
//
// 
//输入：s = "10101"
//输出：4
//解释：有 4 个子串："10"、"01"、"10"、"01" ，具有相同数量的连续 1 和 0 。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 10⁵ 
// s[i] 为 '0' 或 '1' 
// 
// Related Topics 双指针 字符串 👍 420 👎 0

package leetcode.editor.cn;
//java:计数二进制子串
class P696CountBinarySubstrings{
    public static void main(String[] args){
        Solution solution = new P696CountBinarySubstrings().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
//    public int countBinarySubstrings(String s) {
//        if (s.length() == 1) {
//            return 0;
//        }
//        int times = 0;
//        for (int i = 0; i < s.length()-2; i++) {
//            int count0 = 0;
//            int count1 = 0;
//            char ch1 = s.charAt(i);
//            if ("0".equals(ch1+"")) {
//                int j = i;
//                while ("0".equals(s.charAt(j)+"")) {
//                    count0++;
//                    j++;
//                    if (j == s.length()) {
//                        break;
//                    }
//                }
//                while ("1".equals(s.charAt(j)+"")) {
//                    count1++;
//                    if (count0 == count1) {
//                        times++;
//                        break;
//                    }
//                    j++;
//                    if (j == s.length()) {
//                        break;
//                    }
//                }
//            }else {
//                int j = i;
//                while ("1".equals(s.charAt(j)+"")) {
//                    count1++;
//                    j++;
//                    if (j == s.length()) {
//                        break;
//                    }
//                }
//                while ("0".equals(s.charAt(j)+"")) {
//                    count0++;
//                    if (count0 == count1) {
//                        times++;
//                        break;
//                    }
//                    j++;
//                    if (j == s.length()) {
//                        break;
//                    }
//                }
//            }
//        }
//        if (!(s.charAt(s.length()-2)+"").equals(s.charAt(s.length()-1)+"")) {
//            times++;
//        }
//
//        return times;
//    }
//}
//leetcode submit region end(Prohibit modification and deletion)

}
