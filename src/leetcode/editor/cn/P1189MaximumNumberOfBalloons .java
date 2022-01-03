//给你一个字符串 text，你需要使用 text 中的字母来拼凑尽可能多的单词 "balloon"（气球）。 
//
// 字符串 text 中的每个字母最多只能被使用一次。请你返回最多可以拼凑出多少个单词 "balloon"。 
//
// 
//
// 示例 1： 
//
// 
//
// 输入：text = "nlaebolko"
//输出：1
// 
//
// 示例 2： 
//
// 
//
// 输入：text = "loonbalxballpoon"
//输出：2
// 
//
// 示例 3： 
//
// 输入：text = "leetcode"
//输出：0
// 
//
// 
//
// 提示： 
//
// 
// 1 <= text.length <= 10^4 
// text 全部由小写英文字母组成 
// 
// Related Topics 哈希表 字符串 计数 👍 55 👎 0

package leetcode.editor.cn;
//java:“气球” 的最大数量
public class P1189MaximumNumberOfBalloons{
    public static void main(String[] args){
        Solution solution = new P1189MaximumNumberOfBalloons().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int maxNumberOfBalloons(String text) {
            int[] ans = new int[26];
            char[] arr = text.toCharArray();
            //记录每个字母出现的次数
            for(int i = 0;i < arr.length;i++){
                ans[arr[i] - 'a']++;
            }
            //然后找出字母出现的次数的最小值
            String s = "balon";
            int res = ans[s.charAt(0) - 'a'];
            for(int i = 0;i < s.length();i++){
                if(s.charAt(i) == 'l' || s.charAt(i) == 'o'){
                    res = Math.min((ans[s.charAt(i) - 'a']) / 2,res);
                }else{
                    res = Math.min(ans[s.charAt(i) - 'a'],res);
                }
            }
            return res;
        }
    }

//leetcode submit region end(Prohibit modification and deletion)

}
