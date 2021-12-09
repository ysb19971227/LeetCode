//给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。 
//
// 
//
// 示例： 
//
// 输入："Let's take LeetCode contest"
//输出："s'teL ekat edoCteeL tsetnoc"
// 
//
// 
//
// 提示： 
//
// 
// 在字符串中，每个单词由单个空格分隔，并且字符串中不会有任何额外的空格。 
// 
// Related Topics 双指针 字符串 👍 377 👎 0

package leetcode.editor.cn;
//java:反转字符串中的单词 III
public class P557ReverseWordsInAStringIii{
    public static void main(String[] args){
        Solution solution = new P557ReverseWordsInAStringIii().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)



//    class Solution {
//        public String reverseWords(String s) {
//            //利用split函数轻松将字符串的单词分割出来
//            String[] strings = s.split(" ");
//            StringBuffer ansString = new StringBuffer();
//            for (String string : strings) {
//                int length = string.length();
//                for(int i = length;i > 0;i--){
//                    //将单个单词反转
//                    ansString.append(string.charAt(i-1));
//                }
//                ansString.append(' ');
//            }
//            //最后返回去除掉末尾的空格' '
//            return ansString.substring(0,ansString.length()-1);
//        }
//    }

class Solution {
    public String reverseWords(String s) {
        String[] str = s.split(" ");
        StringBuffer ans = new StringBuffer();
        for (int i = 0; i < str.length; i++) {
            ans.append(" " + new StringBuffer(str[i]).reverse());
        }
        ans.delete(0, 1);
        return ans.toString();
    }
}

//class Solution {
//    public String reverseWords(String s) {
//        char[] arr = s.toCharArray();
//        for (int i = 0; i < s.length();) {
//            int j = i;
//            while (!(s.charAt(j)+"").equals(" ") && j < s.length()-1) {
//                j++;
//            }
//            if (j == s.length()-1) {
//                swap(arr,i,j);
//                break;
//            }else {
//                swap(arr, i, j - 1);
//                i = j + 1;
//            }
//        }
//        return String.valueOf(arr);
//    }
//    public static void swap(char[] chars,int left,int right) {
//        while (left < right) {
//            char tmp = chars[left];
//            chars[left] = chars[right];
//            chars[right] = tmp;
//            right--;
//            left++;
//        }
//    }
//}
//leetcode submit region end(Prohibit modification and deletion)

}
