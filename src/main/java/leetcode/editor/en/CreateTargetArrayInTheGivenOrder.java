package leetcode.editor.en;

import java.util.ArrayList;
import java.util.List;

public class CreateTargetArrayInTheGivenOrder {
    public static void main(String[] args) {
        new CreateTargetArrayInTheGivenOrder().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] createTargetArray(int[] nums, int[] index) {
            final int n = nums.length;
            final List<Integer> target = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                target.add(index[i], nums[i]);
            }
            return target.stream().mapToInt(Integer::intValue).toArray();
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}