package leetcode.editor.en;

public class ShuffleTheArray {
    public static void main(String[] args) {
        new ShuffleTheArray().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] shuffle(int[] nums, int n) {
            final int[] ans = new int[n * 2];
            for (int i = 0; i < n; i++) {
                ans[i * 2] = nums[i];
                ans[i * 2 + 1] = nums[n + i];
            }
            return ans;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}