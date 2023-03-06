package leetcode.editor.en;

public class BuildArrayFromPermutation {
    public static void main(String[] args) {
        new BuildArrayFromPermutation().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] buildArray(int[] nums) {
            final int[] arr = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                arr[i] = nums[nums[i]];
            }
            return arr;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}