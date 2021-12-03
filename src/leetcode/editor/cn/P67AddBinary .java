//给你两个二进制字符串，返回它们的和（用二进制表示）。 
//
// 输入为 非空 字符串且只包含数字 1 和 0。 
//
// 
//
// 示例 1: 
//
// 输入: a = "11", b = "1"
//输出: "100" 
//
// 示例 2: 
//
// 输入: a = "1010", b = "1011"
//输出: "10101" 
//
// 
//
// 提示： 
//
// 
// 每个字符串仅由字符 '0' 或 '1' 组成。 
// 1 <= a.length, b.length <= 10^4 
// 字符串如果不是 "0" ，就都不含前导零。 
// 
// Related Topics 位运算 数学 字符串 模拟 👍 709 👎 0

package leetcode.editor.cn;
//java:二进制求和
class P67AddBinary{
    public static void main(String[] args){
        Solution solution = new P67AddBinary().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)

class Solution {
    public String addBinary(String a, String b) {
        //字符串类似于数组。
        StringBuilder stringBuilder = new StringBuilder();
        int aa = a.length() - 1;
        int bb = b.length() - 1;
        int carry = 0;
        while (aa >= 0 || bb >= 0 || carry != 0){
            int x = aa >= 0 ? a.charAt(aa)-'0' : 0;
            int y = bb >= 0 ? b.charAt(bb)-'0' : 0;
            int sum = x + y + carry;
            carry = sum >= 2 ? 1 : 0;
            sum = sum >= 2 ? sum - 2 : sum;
            stringBuilder.append(sum);
            aa--;
            bb--;
        }
        return stringBuilder.reverse().toString();
    }
}

//leetcode submit region end(Prohibit modification and deletion)

}
