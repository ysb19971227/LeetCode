//给定两个字符串, A 和 B。 
//
// A 的旋转操作就是将 A 最左边的字符移动到最右边。 例如, 若 A = 'abcde'，在移动一次之后结果就是'bcdea' 。如果在若干次旋转操作之后
//，A 能变成B，那么返回True。 
//
// 
//示例 1:
//输入: A = 'abcde', B = 'cdeab'
//输出: true
//
//示例 2:
//输入: A = 'abcde', B = 'abced'
//输出: false 
//
// 注意： 
//
// 
// A 和 B 长度不超过 100。 
// 
// Related Topics 字符串 字符串匹配 👍 156 👎 0

package leetcode.editor.cn;
//java:旋转字符串
public class P796RotateString{
    public static void main(String[] args){
        Solution solution = new P796RotateString().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.equals(goal)) return true;
        if (s.length() != goal.length()) return false;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length()-1;i++) {
            if (i == 0) {
                char ch = s.charAt(0);
                StringBuilder sb2 = new StringBuilder();
                sb = sb2.append(s.substring(1)).append(ch);
                if (sb.toString().equals(goal)) return true;
            }else {
                char ch = sb.charAt(0);
                StringBuilder sb2 = new StringBuilder();
                StringBuilder tmp = sb2.append(sb.substring(1)).append(ch);
                sb.insert(0,tmp);
                sb.delete(s.length(),sb.length());
                if (sb.toString().equals(goal)) return true;
            }
        }
        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
