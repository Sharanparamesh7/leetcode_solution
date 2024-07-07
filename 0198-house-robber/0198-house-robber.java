class Solution {
    public int rob(int[] nums) {
               if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }

        int prev2 = 0; // max money that can be robbed from houses up to i-2
        int prev1 = 0; // max money that can be robbed from houses up to i-1

        for (int num : nums) {
            int current = Math.max(prev1, prev2 + num); // either rob current house or skip it
            prev2 = prev1; // update prev2 to prev1
            prev1 = current; // update prev1 to current
        }

        return prev1; 
    }
}