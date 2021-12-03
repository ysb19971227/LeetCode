//给定一个非负索引 rowIndex，返回「杨辉三角」的第 rowIndex 行。 
//
// 在「杨辉三角」中，每个数是它左上方和右上方的数的和。 
//
// 
//
// 
//
// 示例 1: 
//
// 
//输入: rowIndex = 3
//输出: [1,3,3,1]
// 
//
// 示例 2: 
//
// 
//输入: rowIndex = 0
//输出: [1]
// 
//
// 示例 3: 
//
// 
//输入: rowIndex = 1
//输出: [1,1]
// 
//
// 
//
// 提示: 
//
// 
// 0 <= rowIndex <= 33 
// 
//
// 
//
// 进阶： 
//
// 你可以优化你的算法到 O(rowIndex) 空间复杂度吗？ 
// Related Topics 数组 动态规划 👍 340 👎 0

package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

//java:杨辉三角 II
public class P119PascalsTriangleIi{
    public static void main(String[] args){
        Solution solution = new P119PascalsTriangleIi().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        lists.add(list1);
        for (int i = 1; i < rowIndex+1; i++) {
            List<Integer> prev = lists.get(i-1);
            List<Integer> tmp = new ArrayList<>();
            tmp.add(1);
            for (int j = 1; j < i; j++) {
                tmp.add(prev.get(j) + prev.get(j-1));
            }
            tmp.add(1);
            lists.add(tmp);
        }
        return lists.get(rowIndex);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
