package leetcode.editor.en;

public class SubtractTheProductAndSumOfDigitsOfAnInteger {
    public static void main(String[] args) {
        new SubtractTheProductAndSumOfDigitsOfAnInteger().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int subtractProductAndSum(int n) {
            int sum = 0;
            int product = 1;
            while (n > 0) {
                int digit = n % 10;
                sum += digit;
                product *= digit;
                n = n / 10;
            }
            return product - sum;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}