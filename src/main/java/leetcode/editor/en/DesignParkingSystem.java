package leetcode.editor.en;

import java.util.HashMap;
import java.util.Map;

public class DesignParkingSystem {
    public static void main(String[] args) {
//        new DesignParkingSystem().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class ParkingSystem {
        private final Map<Integer, Integer> parkingMap = new HashMap<>();

        public ParkingSystem(int big, int medium, int small) {
            parkingMap.put(1, big);
            parkingMap.put(2, medium);
            parkingMap.put(3, small);
        }

        public boolean addCar(int carType) {
            final int avail = parkingMap.get(carType);
            if (avail > 0) {
                parkingMap.put(carType, avail - 1);
                return true;
            }
            return false;
        }
    }

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */
//leetcode submit region end(Prohibit modification and deletion)

}