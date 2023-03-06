package leetcode.editor.en;

public class FinalValueOfVariableAfterPerformingOperations {
    public static void main(String[] args) {
        new FinalValueOfVariableAfterPerformingOperations().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int finalValueAfterOperations(String[] operations) {
            int ans = 0;
            for (String op : operations) {
                if (op.contains("--")) {
                    ans -= 1;
                } else if (op.contains("++")) {
                    ans += 1;
                }
            }
            return ans;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}