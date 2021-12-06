//给定一个包含大写字母和小写字母的字符串，找到通过这些字母构造成的最长的回文串。 
//
// 在构造过程中，请注意区分大小写。比如 "Aa" 不能当做一个回文字符串。 
//
// 注意: 
//假设字符串的长度不会超过 1010。 
//
// 示例 1: 
//
// 
//输入:
//"abccccdd"
//
//输出:
//7
//
//解释:
//我们可以构造的最长的回文串是"dccaccd", 它的长度是 7。
// 
// Related Topics 贪心 哈希表 字符串 👍 360 👎 0

package leetcode.editor.cn;

import org.omg.PortableInterceptor.INACTIVE;

//java:最长回文串
public class P409LongestPalindrome{
    public static void main(String[] args){
        Solution solution = new P409LongestPalindrome().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int longestPalindrome(String s) {
            char[] ch = s.toCharArray();
            int[] dict = new int[128];
            for (char c : ch) dict[c]++;
            int count = 0;int len = ch.length;

            for (int num:dict) {if (!(num % 2 == 0)){
                count++;
            }}
            return (count == 0) ? len : len-count+1;
        }
    }

//leetcode submit region end(Prohibit modification and deletion)

}
