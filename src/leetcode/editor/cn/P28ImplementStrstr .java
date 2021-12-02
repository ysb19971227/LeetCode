//实现 strStr() 函数。 
//
// 给你两个字符串 haystack 和 needle ，请你在 haystack 字符串中找出 needle 字符串出现的第一个位置（下标从 0 开始）。如
//果不存在，则返回 -1 。 
//
// 
//
// 说明： 
//
// 当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。 
//
// 对于本题而言，当 needle 是空字符串时我们应当返回 0 。这与 C 语言的 strstr() 以及 Java 的 indexOf() 定义相符。 
//
// 
//
// 示例 1： 
//
// 
//输入：haystack = "hello", needle = "ll"
//输出：2
// 
//
// 示例 2： 
//
// 
//输入：haystack = "aaaaa", needle = "bba"
//输出：-1
// 
//
// 示例 3： 
//
// 
//输入：haystack = "", needle = ""
//输出：0
// 
//
// 
//
// 提示： 
//
// 
// 0 <= haystack.length, needle.length <= 5 * 10⁴ 
// haystack 和 needle 仅由小写英文字符组成 
// 
// Related Topics 双指针 字符串 字符串匹配 👍 1136 👎 0

package leetcode.editor.cn;
//java:实现 strStr()
public class P28ImplementStrstr{
    public static void main(String[] args){
        Solution solution = new P28ImplementStrstr().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int strStr(String haystack, String needle) {
            int n = haystack.length(), m = needle.length();
            if (m == 0) {return 0;}
            int[] pi = new int[m];

            //第一部分是求 needle 部分的前缀函数，我们需要保留这部分的前缀函数值。
            for (int i = 1, j = 0; i < m; i++) {
                while (j > 0 && needle.charAt(i) != needle.charAt(j)) {
                    j = pi[j - 1];
                }
                if (needle.charAt(i) == needle.charAt(j)) {
                    j++;
                }
                pi[i] = j;
            }
            //第二部分是求 haystack 部分的前缀函数，我们无需保留这部分的前缀函数值，只需要用一个变量记录上一个位置的前缀函数值即可。
            //当某个位置的前缀函数值等于 m 时，说明我们就找到了一次字符串 needle 在字符串 haystack 中的出现
            //（因为此时真前缀恰为字符串 needle，真后缀为以当前位置为结束位置的字符串 haystack 的子串），我们计算出起始位置，将其返回即可。
            for (int i = 0, j = 0; i < n; i++) {
                while (j > 0 && haystack.charAt(i) != needle.charAt(j)) {
                    j = pi[j - 1];
                }
                if (haystack.charAt(i) == needle.charAt(j)) {
                    j++;
                }
                if (j == m) {
                    return i - m + 1;
                }
            }
            return -1;
        }
    }


//class Solution {
//    public int strStr(String haystack, String needle) {
//        //暴力字符串匹配，一个一个的匹配  这样的效率太低
//        int m = needle.length();int n = haystack.length();
//        for (int i = 0; i <= n - m; i++) {
//            boolean flg = true;
//            for (int j = 0; j < m; j++) {
//                if (haystack.charAt(i + j) != needle.charAt(j)) {
//                    flg = false;
//                    break;
//                }
//            }
//            if (flg) {return i;}
//        }
//        return -1;
//    }
//}
//leetcode submit region end(Prohibit modification and deletion)

}
