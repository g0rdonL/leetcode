package leetcode.editor.en;

public class RunningSumOf1dArray {
    public static void main(String[] args) {
        new RunningSumOf1dArray().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] runningSum(int[] nums) {
            final int n = nums.length;
            final int[] ans = new int[n];
            for (int i = 0; i < n; i++) {
                ans[i] = nums[0];
                for (int j = i; j > 0; j--) {
                    ans[i] += nums[j];
                }
            }
            return ans;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}