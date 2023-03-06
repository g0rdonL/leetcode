package leetcode.editor.en;

public class CountOfMatchesInTournament {
    public static void main(String[] args) {
        new CountOfMatchesInTournament().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        int matches = 0;

        public int numberOfMatches(int n) {
            if (n == 1) {
                return matches;
            }
            if (n % 2 == 0) {
                matches += n / 2;
                numberOfMatches(n / 2);
            } else {
                matches += (n - 1) / 2;
                numberOfMatches((n - 1) / 2 + 1);
            }
            return matches;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}