package leetcode.editor.en;

public class JewelsAndStones {
    public static void main(String[] args) {
        new JewelsAndStones().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int numJewelsInStones(String jewels, String stones) {
            int ans = 0;
            for (char jewel : jewels.toCharArray()) {
                for (char stone : stones.toCharArray()) {
                    if (jewel == stone) {
                        ans += 1;
                    }
                }

            }
            return ans;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}