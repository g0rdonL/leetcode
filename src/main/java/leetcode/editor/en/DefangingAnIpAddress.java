package leetcode.editor.en;

public class DefangingAnIpAddress {
    public static void main(String[] args) {
        new DefangingAnIpAddress().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String defangIPaddr(String address) {
            return address.replaceAll("\\.", "[.]");
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}