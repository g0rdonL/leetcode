package leetcode.editor.en;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        new RichestCustomerWealth().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int maximumWealth(int[][] accounts) {
            int max = 0;
            for (int[] customer : accounts) {
                int wealth = 0;
                for (int account : customer) {
                    wealth += account;
                }
                if (wealth > max) {
                    max = wealth;
                }
            }
            return max;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}