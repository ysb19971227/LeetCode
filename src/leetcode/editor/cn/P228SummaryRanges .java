//给定一个无重复元素的有序整数数组 nums 。 
//
// 返回 恰好覆盖数组中所有数字 的 最小有序 区间范围列表。也就是说，nums 的每个元素都恰好被某个区间范围所覆盖，并且不存在属于某个范围但不属于 
//nums 的数字 x 。 
//
// 列表中的每个区间范围 [a,b] 应该按如下格式输出： 
//
// 
// "a->b" ，如果 a != b 
// "a" ，如果 a == b 
// 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [0,1,2,4,5,7]
//输出：["0->2","4->5","7"]
//解释：区间范围是：
//[0,2] --> "0->2"
//[4,5] --> "4->5"
//[7,7] --> "7"
// 
//
// 示例 2： 
//
// 
//输入：nums = [0,2,3,4,6,8,9]
//输出：["0","2->4","6","8->9"]
//解释：区间范围是：
//[0,0] --> "0"
//[2,4] --> "2->4"
//[6,6] --> "6"
//[8,9] --> "8->9"
// 
//
// 示例 3： 
//
// 
//输入：nums = []
//输出：[]
// 
//
// 示例 4： 
//
// 
//输入：nums = [-1]
//输出：["-1"]
// 
//
// 示例 5： 
//
// 
//输入：nums = [0]
//输出：["0"]
// 
//
// 
//
// 提示： 
//
// 
// 0 <= nums.length <= 20 
// -2³¹ <= nums[i] <= 2³¹ - 1 
// nums 中的所有值都 互不相同 
// nums 按升序排列 
// 
// Related Topics 数组 👍 186 👎 0

package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

//java:汇总区间
class P228SummaryRanges{
    public static void main(String[] args){
        Solution solution = new P228SummaryRanges().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
/*class Solution {
    public List<String> summaryRanges(int[] nums) {
        if (nums.length == 0) {return new ArrayList<>();}
        if (nums.length == 1) {
            List<String> list1 = new ArrayList<>();
            list1.add(String.valueOf(nums[0]));
            return list1;
        }
        List<String> ret = new ArrayList<>();
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i+1]-1 != nums[i] ||( nums[i] != nums[i+1]-1 && nums[i] != (nums[i-1])+1)) {
                ret.add(String.valueOf(nums[i]));
                if (nums.length == 2) {
                    ret.add(String.valueOf(nums[i+1]));
                    return ret;
                }
                if (i == nums.length-2) {
                    ret.add(String.valueOf(nums[i+1]));
                    return ret;
                }
            }else {
                int j = i;
                while (nums[i+1]-1== nums[i]) {
                    i++;
                    if (i == nums.length-1) {
                        ret.add((nums[j])+ "->" +(nums[i]));
                        return ret;
                    }
                }
                ret.add((nums[j])+ "->" +(nums[i]));
                if (i == nums.length-2) {
                    ret.add(String.valueOf(nums[i+1]));
                    return ret;
                }
            }
        }
        return ret;
    }
}*/

class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ret = new ArrayList<>();
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (j+1 == nums.length || nums[j] != nums[j+1]-1) {
                StringBuilder sb = new StringBuilder();
                sb.append(nums[i]);
                if (i != j) {
                    sb.append("->").append(nums[j]);
                }
                i = j + 1;
                ret.add(sb.toString());
            }
        }
        return ret;
    }
}

//leetcode submit region end(Prohibit modification and deletion)

}
