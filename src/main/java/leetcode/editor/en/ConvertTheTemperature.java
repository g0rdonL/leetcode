package leetcode.editor.en;

public class ConvertTheTemperature {
    public static void main(String[] args) {
        new ConvertTheTemperature().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public double[] convertTemperature(double celsius) {
            return new double[]{
                    celsius + 273.15d,
                    celsius * 1.80d + 32.00d
            };
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}