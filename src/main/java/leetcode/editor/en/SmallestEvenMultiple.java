package leetcode.editor.en;

public class SmallestEvenMultiple {
    public static void main(String[] args) {
        new SmallestEvenMultiple().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int smallestEvenMultiple(int n) {
            if (n % 2 == 0) {
                return n;
            }
            return n * 2;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}