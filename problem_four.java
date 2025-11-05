public class problem_four {

    // Correct implementation of Product Except Self (O(N) time complexity)
    static public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        // Initialize the result array to the correct size
        int[] ans = new int[n];
        
        // 1. Calculate the product of all elements to the LEFT of index i
        int prefixProduct = 1;
        for (int i = 0; i < n; i++) {
            ans[i] = prefixProduct; // ans[i] now holds Product(nums[0]...nums[i-1])
            prefixProduct *= nums[i]; // Update prefixProduct for the next iteration
        }
        // Example: nums = [1, 2, 3, 4]
        // ans after this loop: [1, 1, 2, 6] (Left products)

        // 2. Calculate the product of all elements to the RIGHT of index i
        // and multiply it with the existing Left product in ans[i]
        int suffixProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            ans[i] = ans[i] * suffixProduct; // ans[i] = (Left Product) * (Right Product)
            suffixProduct *= nums[i]; // Update suffixProduct for the next iteration
        }
        // Example: suffixProduct iterates as 1 -> 4 -> 12 -> 24
        // ans after this loop: [24, 12, 8, 6] (Final result)

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] result = productExceptSelf(nums);
        
        System.out.print("[");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i < result.length - 1 ? ", " : ""));
        }
        System.out.println("]"); // Output: [24, 12, 8, 6]
    }
}
