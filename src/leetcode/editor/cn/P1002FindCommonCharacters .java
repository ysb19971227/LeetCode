//给你一个字符串数组 words ，请你找出所有在 words 的每个字符串中都出现的共用字符（ 包括重复字符），并以数组形式返回。你可以按 任意顺序 返回答
//案。
// 
//
// 示例 1： 
//
// 
//输入：words = ["bella","label","roller"]
//输出：["e","l","l"]
// 
//
// 示例 2： 
//
// 
//输入：words = ["cool","lock","cook"]
//输出：["c","o"]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= words.length <= 100 
// 1 <= words[i].length <= 100 
// words[i] 由小写英文字母组成 
// 
// Related Topics 数组 哈希表 字符串 👍 248 👎 0

package leetcode.editor.cn;
//java:查找共用字符
public class P1002FindCommonCharacters{
    public static void main(String[] args){
        Solution solution = new P1002FindCommonCharacters().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<String> commonChars(String[] words) {
            //存放结果
            List<String> result = new ArrayList<>();
            //拦截非法情况
            if(words.length==0)
                return result;

            int[] hash = new int[26];   //用于统计所有字符串里字符出现的最小频率

            //用第一个字符串给hash初始化
            for(int i=0;i<words[0].length();i++){//遍历第一个字符串
                hash[words[0].charAt(i)-'a']++;//取出每一个字符，在hash数组中++
            }

            //统计除了第一个字符串外字符出现的频率
            for(int i=1;i<words.length;i++){//从字符串数组的第二个字符串开始遍历
                int[] hashOtherStr = new int[26];
                //假设i=1，则为遍历第二个字符串的每一个字符，统计在hashOtherStr中
                for(int j=0;j<words[i].length();j++){
                    hashOtherStr[words[i].charAt(j)-'a']++;
                }
                //更新hash，保证hash中统计的26个字符在所有的字符串里出现的最小次数
                for(int k=0;k<26;k++){
                    hash[k] = Math.min(hash[k],hashOtherStr[k]);
                }
            }

            //将hash中统计好的玩意儿，转换成输出形式、
            for(int i=0;i<26;i++){
                while(hash[i]!=0){//当hash统计数组不为0时
                    //取出字符
                    char c = (char)(i+'a');
                    result.add(String.valueOf(c));//添加到数组中
                    hash[i]--;
                }
            }
            return result;

        }
    }

//leetcode submit region end(Prohibit modification and deletion)

}
