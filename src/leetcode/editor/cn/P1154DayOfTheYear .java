//给你一个字符串 date ，按 YYYY-MM-DD 格式表示一个 现行公元纪年法 日期。请你计算并返回该日期是当年的第几天。 
//
// 通常情况下，我们认为 1 月 1 日是每年的第 1 天，1 月 2 日是每年的第 2 天，依此类推。每个月的天数与现行公元纪年法（格里高利历）一致。 
//
// 
//
// 示例 1： 
//
// 
//输入：date = "2019-01-09"
//输出：9
// 
//
// 示例 2： 
//
// 
//输入：date = "2019-02-10"
//输出：41
// 
//
// 示例 3： 
//
// 
//输入：date = "2003-03-01"
//输出：60
// 
//
// 示例 4： 
//
// 
//输入：date = "2004-03-01"
//输出：61 
//
// 
//
// 提示： 
//
// 
// date.length == 10 
// date[4] == date[7] == '-'，其他的 date[i] 都是数字 
// date 表示的范围从 1900 年 1 月 1 日至 2019 年 12 月 31 日 
// 
// Related Topics 数学 字符串 👍 93 👎 0

package leetcode.editor.cn;
//java:一年中的第几天
public class P1154DayOfTheYear{
    public static void main(String[] args){
        Solution solution = new P1154DayOfTheYear().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {

        public int dayOfYear(String date) {
            String[] arr = date.split("-");
            int year = Integer.parseInt(arr[0]);
            int month = Integer.parseInt(arr[1]);
            int day = Integer.parseInt(arr[2]);

            int ans = 0;
            for (int i = 1; i < month; i++) {
                ans += days(year, i);
            }

            return ans + day;
        }

        private int days(int year, int month) {
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                return 31;
            }
            if (month == 2) {
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    return 29;
                }
                return 28;
            }
            return 30;
        }
    }

//leetcode submit region end(Prohibit modification and deletion)

}
