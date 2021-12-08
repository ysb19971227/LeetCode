//给你一个字符串数组 words ，只返回可以使用在 美式键盘 同一行的字母打印出来的单词。键盘如下图所示。 
//
// 美式键盘 中： 
//
// 
// 第一行由字符 "qwertyuiop" 组成。 
// 第二行由字符 "asdfghjkl" 组成。 
// 第三行由字符 "zxcvbnm" 组成。 
// 
//
// 
//
// 
//
// 示例 1： 
//
// 
//输入：words = ["Hello","Alaska","Dad","Peace"]
//输出：["Alaska","Dad"]
// 
//
// 示例 2： 
//
// 
//输入：words = ["omk"]
//输出：[]
// 
//
// 示例 3： 
//
// 
//输入：words = ["adsdf","sfd"]
//输出：["adsdf","sfd"]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= words.length <= 20 
// 1 <= words[i].length <= 100 
// words[i] 由英文字母（小写和大写字母）组成 
// 
// Related Topics 数组 哈希表 字符串 👍 192 👎 0

package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

//java:键盘行
public class P500KeyboardRow{
    public static void main(String[] args){
        Solution solution = new P500KeyboardRow().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String[] findWords(String[] words) {
        String s1 = "qwertyuiop";
        String s2 = "asdfghjkl";
        String s3 = "zxcvbnm";
        String tmp = s1;
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                if (words[i].length() == 1) {
                    integerList.add(i);
                }
                String str = words[i].toLowerCase();
                char ch = str.charAt(j);
                if (j == 0) {
                    int tmp2 = s1.indexOf(ch+"");
                    if (tmp2 != -1) {
                        tmp = s1;
                    }
                    int tmp3 = s2.indexOf(ch+"");
                    if (tmp3 != -1) {
                        tmp = s2;
                    }
                    int tmp4 = s3.indexOf(ch+"");
                    if (tmp4 != -1) {
                        tmp = s3;
                    }
                    continue;
                }
                int num = tmp.indexOf(ch);
                if (num == -1) {
                    break;
                }
                if (j == words[i].length()-1){
                    integerList.add(i);
                }
            }
        }
        int length = 0;
        for (int ignored :integerList) {
            length++;
        }
        String[] strings = new String[length];
        for (int i = 0; i < length; i++) {
            strings[i] = words[integerList.get(i)];
        }
        return strings;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
