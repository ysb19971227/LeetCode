//我们定义，在以下情况时，单词的大写用法是正确的： 
//
// 
// 全部字母都是大写，比如 "USA" 。 
// 单词中所有字母都不是大写，比如 "leetcode" 。 
// 如果单词不只含有一个字母，只有首字母大写， 比如 "Google" 。 
// 
//
// 给你一个字符串 word 。如果大写用法正确，返回 true ；否则，返回 false 。 
//
// 
//
// 示例 1： 
//
// 
//输入：word = "USA"
//输出：true
// 
//
// 示例 2： 
//
// 
//输入：word = "FlaG"
//输出：false
// 
//
// 
//
// 提示： 
//
// 
// 1 <= word.length <= 100 
// word 由小写和大写英文字母组成 
// 
// Related Topics 字符串 👍 193 👎 0

package leetcode.editor.cn;
//java:检测大写字母
public class P520DetectCapital{
    public static void main(String[] args){
        Solution solution = new P520DetectCapital().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean detectCapitalUse(String word) {
        if (word.length() == 0 || word.length() == 1 ) {
            return true;
        }
        int flg = 0;
        if (65<= word.charAt(0) && word.charAt(0) <= 90) {
            flg = 1;
        }
        if (flg == 1) {
            if (65<= word.charAt(1) && word.charAt(1) <= 90) {
                for (int i = 2; i < word.length(); i++) {
                    if (!(65<= word.charAt(i) && word.charAt(i) <= 90)) {
                        return false;
                    }
                }
            }else {
                for (int i = 2; i < word.length(); i++) {
                    if (!(97<= word.charAt(i) && word.charAt(i) <=122)) {
                        return false;
                    }
                }
            }

        }else {
            for (int i = 0; i < word.length(); i++) {
                if (!(97<= word.charAt(i) && word.charAt(i) <=122)) {
                    return false;
                }
            }
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
