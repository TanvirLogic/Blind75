
import com.sun.source.tree.Tree;


public class problem_three_bruitForce {

    static public boolean containsDuplicate(int[] nums) {

        // Bruit Force // It fails the test cases of time issue 

        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; i < nums.length; j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }

        return false;
    }
}
