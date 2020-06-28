package prog.arraystring;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FirstTwoSumInArray {

    public static void main(String[] args) {
        int [] nums =  {1, 3, 4, 7, 0, 2, 6};
        int target = 7;
        int [] result = twoSum(nums, target);
        System.out.println("Result : " + Arrays.toString(result));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

}
