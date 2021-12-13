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
    public int countBinarySubstrings(String s) {
/*        int res = 0;
        char[] chars = s.toCharArray();
        int a = 0;
        int b = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '0') {
                a++;
                if (i + 1 < s.length()) {
                    if (chars[i + 1] != '0') {
                        if (b != 0) {
                            int min = Math.min(a, b);
                            res += min;
                            b = 0;
                        }
                    }
                } else {
                    if (b != 0) {
                        int min = Math.min(a, b);
                        res += min;
                        b = 0;
                    }
                }
            } else {
                b++;
                if (i + 1 < s.length()) {
                    if (chars[i + 1] != '1') {
                        if (a != 0) {
                            int min = Math.min(a, b);
                            res += min;
                            a = 0;
                        }
                    }
                } else {
                    if (a != 0) {
                        int min = Math.min(a, b);
                        res += min;
                        a = 0;
                    }
                }
            }
        }
        return res;
    }*/
        //下面是我写的代码： 结果超时了！！
//        if (s.length() == 1) {
//            return 0;
//        }
//        int times = 0;
//        char[] chars = s.toCharArray();
//        for (int i = 0; i < s.length()-1; i++) {
//            int count0 = 0;
//            int count1 = 0;
//
//            char ch1 = chars[i];
//            if ("0".equals(ch1+"")) {
//                int j = i;
//                while ("0".equals(chars[j]+"")) {
//                    count0++;
//                    j++;
//                    if (j == s.length()) {
//                        return times;
//                    }
//                }
//                while ("1".equals(chars[j]+"")) {
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
//                while ("1".equals(chars[j]+"")) {
//                    count1++;
//                    j++;
//                    if (j == s.length()) {
//                        return times;
//                    }
//                }
//                while ("0".equals(chars[j]+"")) {
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
//        return times;
//    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
