
import java.util.HashMap;
import java.util.Map;

public class problem_three {

    static public boolean containsDuplicate(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length ; i++) {
            if (map.containsKey(nums[i])) {
                return true;
            }
            map.put(nums[i], i);
        }

        return false;
    }
}
