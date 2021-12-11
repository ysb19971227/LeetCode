//给定一个非空字符串 s，最多删除一个字符。判断是否能成为回文字符串。 
//
// 
//
// 示例 1: 
//
// 
//输入: s = "aba"
//输出: true
// 
//
// 示例 2: 
//
// 
//输入: s = "abca"
//输出: true
//解释: 你可以删除c字符。
// 
//
// 示例 3: 
//
// 
//输入: s = "abc"
//输出: false 
//
// 
//
// 提示: 
//
// 
// 1 <= s.length <= 10⁵ 
// s 由小写英文字母组成 
// 
// Related Topics 贪心 双指针 字符串 👍 428 👎 0

package leetcode.editor.cn;
//java:验证回文字符串 Ⅱ
public class P680ValidPalindromeIi{
    public static void main(String[] args){
        Solution solution = new P680ValidPalindromeIi().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean validPalindrome(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0,j = s.length()-1; i < s.length();) {
            if (s.charAt(i) != s.charAt(j)) {
                int sum1 = 1;
                for (int left1 = i,right1 = j-1; left1 < right1;) {
                    if (s.charAt(left1) != s.charAt(right1)) {
                        sum1 = 0;
                        break;
                    }
                    left1++;
                    right1--;
                }
                int sum2 = 1;
                for (int left2 = i+1,right2 = j; left2 < right2;) {
                    if (s.charAt(left2) != s.charAt(right2)) {
                        sum2 = 0;
                        break;
                    }
                    left2++;
                    right2--;
                }
                if (sum1 == 1 || sum2 == 1) {
                    return true;
                }else {
                    return false;
                }
            }
            i++;
            j--;
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
