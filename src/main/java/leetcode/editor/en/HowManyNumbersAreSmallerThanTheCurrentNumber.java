package leetcode.editor.en;

public class HowManyNumbersAreSmallerThanTheCurrentNumber {
    public static void main(String[] args) {
        new HowManyNumbersAreSmallerThanTheCurrentNumber().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] smallerNumbersThanCurrent(int[] nums) {
            final int[] ans = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                ans[i] = 0;
                for (int j = 0; j < nums.length; j++) {
                    if (i == j) {
                        continue;
                    }
                    if (nums[i] > nums[j]) {
                        ans[i]++;
                    }
                }
            }
            return ans;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}