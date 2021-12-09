//给定一个字符串 s 和一个整数 k，从字符串开头算起，每计数至 2k 个字符，就反转这 2k 字符中的前 k 个字符。 
//
// 
// 如果剩余字符少于 k 个，则将剩余字符全部反转。 
// 如果剩余字符小于 2k 但大于或等于 k 个，则反转前 k 个字符，其余字符保持原样。 
// 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "abcdefg", k = 2
//输出："bacdfeg"
// 
//
// 示例 2： 
//
// 
//输入：s = "abcd", k = 2
//输出："bacd"
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 10⁴ 
// s 仅由小写英文组成 
// 1 <= k <= 10⁴ 
// 
// Related Topics 双指针 字符串 👍 216 👎 0

package leetcode.editor.cn;
//java:反转字符串 II
public class P541ReverseStringIi{
    public static void main(String[] args){
        Solution solution = new P541ReverseStringIi().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)

class Solution {
    public String reverseStr(String s, int k) {
        int length = s.length();
        char[] charLength = s.toCharArray();

        int r = 0;
        for (int l = 0; l < length; ) {
            r = l + k - 1;
            swapTotal(charLength, l, Math.min(r, length - 1));
            l = l + 2 * k;
        }
        return String.valueOf(charLength);
    }

    public static void swapTotal(char[] s, int left, int right) {
        while (left < right) {
            char tmp = s[left];
            s[left] = s[right];
            s[right] = tmp;
            left++;
            right--;
        }
    }
}


//class Solution {
//    public String reverseStr(String s, int k) {
//        int quo = s.length() /(2*k);
//        int rem = s.length() %(2*k);
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < quo*2*k; i++) {
//            int j = i+k-1;
//            for (; j >= i; j--) {
//                sb.append(s.charAt(j));
//            }
//            String tmp = s.substring(i+k,i+2*k);
//            sb.append(tmp);
//            i = i +2*k-1;
//        }
//        int len = s.length();
//        int len2 = rem % k;
//        if (rem > k) {
//            for (int i = quo*2*k+k-1; i >= quo*2*k; i--) {
//                sb.append(s.charAt(i));
//            }
//            String tmp = s.substring(s.length()-len2,s.length());
//            sb.append(tmp);
//        }else {
//            for (int i = 0; i < rem; i++) {
//                sb.append(s.charAt(len-1));
//                len--;
//            }
//        }
//        return sb.toString();
//    }
//}
//leetcode submit region end(Prohibit modification and deletion)

}
