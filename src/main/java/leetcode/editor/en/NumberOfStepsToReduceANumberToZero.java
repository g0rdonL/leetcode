package leetcode.editor.en;

public class NumberOfStepsToReduceANumberToZero {
    public static void main(String[] args) {
        new NumberOfStepsToReduceANumberToZero().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        int numOfSteps = 0;

        public int numberOfSteps(int num) {
            if (num == 0) {
                return numOfSteps;
            }
            numOfSteps++;
            if (num % 2 == 0) {
                numberOfSteps(num / 2);
            } else if (num % 2 == 1) {
                numberOfSteps(num - 1);
            }
            return numOfSteps;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}