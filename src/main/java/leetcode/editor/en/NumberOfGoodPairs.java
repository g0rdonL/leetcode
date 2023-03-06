package leetcode.editor.en;

public class NumberOfGoodPairs {
    public static void main(String[] args) {
        new NumberOfGoodPairs().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int numIdenticalPairs(int[] nums) {
            int ans = 0;
            for (int i = 0; i < nums.length; i++) {
                for (int j = i; j < nums.length; j++) {
                    if (i < j && nums[i] == nums[j]) {
                        ans += 1;
                    }
                }
            }
            return ans;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}