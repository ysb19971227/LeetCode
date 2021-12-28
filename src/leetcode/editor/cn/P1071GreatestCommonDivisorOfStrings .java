//对于字符串 S 和 T，只有在 S = T + ... + T（T 自身连接 1 次或多次）时，我们才认定 “T 能除尽 S”。 
//
// 返回最长字符串 X，要求满足 X 能除尽 str1 且 X 能除尽 str2。 
//
// 
//
// 示例 1： 
//
// 
//输入：str1 = "ABCABC", str2 = "ABC"
//输出："ABC"
// 
//
// 示例 2： 
//
// 
//输入：str1 = "ABABAB", str2 = "ABAB"
//输出："AB"
// 
//
// 示例 3： 
//
// 
//输入：str1 = "LEET", str2 = "CODE"
//输出：""
// 
//
// 
//
// 提示： 
//
// 
// 1 <= str1.length <= 1000 
// 1 <= str2.length <= 1000 
// str1[i] 和 str2[i] 为大写英文字母 
// 
// Related Topics 数学 字符串 👍 218 👎 0

package leetcode.editor.cn;
//java:字符串的最大公因子
public class P1071GreatestCommonDivisorOfStrings{
    public static void main(String[] args){
        Solution solution = new P1071GreatestCommonDivisorOfStrings().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String gcdOfStrings(String str1, String str2) {
            int len1 = str1.length(), len2 = str2.length();
            for (int i = Math.min(len1, len2); i >= 1; --i) { // 从长度大的开始枚举
                if (len1 % i == 0 && len2 % i == 0) {
                    String X = str1.substring(0, i);
                    if (check(X, str1) && check(X, str2)) {
                        return X;
                    }
                }
            }
            return "";
        }

        public boolean check(String t, String s) {
            int lenx = s.length() / t.length();
            StringBuffer ans = new StringBuffer();
            for (int i = 1; i <= lenx; ++i) {
                ans.append(t);
            }
            return ans.toString().equals(s);
        }
    }

//leetcode submit region end(Prohibit modification and deletion)

}
