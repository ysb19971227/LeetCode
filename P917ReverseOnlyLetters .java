//给定一个字符串 S，返回 “反转后的” 字符串，其中不是字母的字符都保留在原地，而所有字母的位置发生反转。 
//
// 
//
// 
// 
//
// 示例 1： 
//
// 输入："ab-cd"
//输出："dc-ba"
// 
//
// 示例 2： 
//
// 输入："a-bC-dEf-ghIj"
//输出："j-Ih-gfE-dCba"
// 
//
// 示例 3： 
//
// 输入："Test1ng-Leet=code-Q!"
//输出："Qedo1ct-eeLg=ntse-T!"
// 
//
// 
//
// 提示： 
//
// 
// S.length <= 100 
// 33 <= S[i].ASCIIcode <= 122 
// S 中不包含 \ or " 
// 
// Related Topics 双指针 字符串 👍 97 👎 0

package leetcode.editor.cn;
//java:仅仅反转字母
public class P917ReverseOnlyLetters{
    public static void main(String[] args){
        Solution solution = new P917ReverseOnlyLetters().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String reverseOnlyLetters(String s) {
            char[] chs = s.toCharArray();
            int l = 0,r = chs.length - 1;
            while(l <= r){
                if (Character.isLetter(chs[l]) && Character.isLetter(chs[r])){
                    char temp = chs[l];
                    chs[l] = chs[r];
                    chs[r] = temp;
                    l++;
                    r--;
                }else if (!Character.isLetter(chs[l])){
                    l++;
                }else if(!Character.isLetter(chs[r])){
                    r--;
                }
            }
            return new String(chs);
        }
    }

//leetcode submit region end(Prohibit modification and deletion)

}
