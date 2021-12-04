//给你一个字符串 s ，仅反转字符串中的所有元音字母，并返回结果字符串。 
//
// 元音字母包括 'a'、'e'、'i'、'o'、'u'，且可能以大小写两种形式出现。 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "hello"
//输出："holle"
// 
//
// 示例 2： 
//
// 
//输入：s = "leetcode"
//输出："leotcede" 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 3 * 10⁵ 
// s 由 可打印的 ASCII 字符组成 
// 
// Related Topics 双指针 字符串 👍 230 👎 0

package leetcode.editor.cn;
//java:反转字符串中的元音字母
public class P345ReverseVowelsOfAString{
    public static void main(String[] args){
        Solution solution = new P345ReverseVowelsOfAString().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String reverseVowels(String s) {
        int n = s.length();
        if (n <= 1) {return s;}
        char[] arr = s.toCharArray();
        int p1 = 0;int p2 = n-1;

        while (p1 < p2) {
            if (isVowel(arr[p1]) && isVowel(arr[p2])) {
                char tmp = arr[p2];
                arr[p2] = arr[p1];
                arr[p1] = tmp;
                p2--;
                p1++;
            }else if (isVowel(arr[p1]) && !isVowel(arr[p2])) {
                p2--;
            }else if (!isVowel(arr[p1]) && isVowel(arr[p2])){
             p1++;
            }else {
                p1++;
                p2--;
            }
        }
       return String.valueOf(arr);
    }
    public boolean isVowel(char c) {
        return c == 'a' || c == 'A'
                || c == 'e' || c == 'E'
                || c == 'i' || c == 'I'
                || c == 'o' || c == 'O'
                || c == 'u' || c == 'U';
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
