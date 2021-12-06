//给定两个字符串形式的非负整数 num1 和num2 ，计算它们的和并同样以字符串形式返回。 
//
// 你不能使用任何內建的用于处理大整数的库（比如 BigInteger）， 也不能直接将输入的字符串转换为整数形式。 
//
// 
//
// 示例 1： 
//
// 
//输入：num1 = "11", num2 = "123"
//输出："134"
// 
//
// 示例 2： 
//
// 
//输入：num1 = "456", num2 = "77"
//输出："533"
// 
//
// 示例 3： 
//
// 
//输入：num1 = "0", num2 = "0"
//输出："0"
// 
//
// 
//
// 
//
// 提示： 
//
// 
// 1 <= num1.length, num2.length <= 10⁴ 
// num1 和num2 都只包含数字 0-9 
// num1 和num2 都不包含任何前导零 
// 
// Related Topics 数学 字符串 模拟 👍 478 👎 0

package leetcode.editor.cn;
//java:字符串相加
public class P415AddStrings{
    public static void main(String[] args){
        Solution solution = new P415AddStrings().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String addStrings(String num1, String num2) {
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        int p1 = num1.length()-1;int p2 = num2.length()-1;
        while (p1 >= 0 || p2 >= 0 || carry != 0) {
            int x = p1 >=0 ? num1.charAt(p1)-'0': 0;
            int y = p2 >=0 ? num2.charAt(p2)-'0': 0;
            int sum = x + y + carry;
            carry = sum >= 10 ? 1 : 0;
            sum = sum >= 10 ? sum - 10 : sum;
            sb.append(sum);
            p1--;
            p2--;
        }
        return sb.reverse().toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
