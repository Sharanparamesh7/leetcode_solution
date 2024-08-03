class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        double max = 0;
        for(int i=0; i<k; i++){
            sum += nums[i];
        }
        max = (double)sum / k;
        
        for(int i=k; i<nums.length; i++){
            int add = nums[i];
            int remove = nums[i - k];
            sum = sum - remove + add;
            max = Math.max((double)sum / k , max);
        }
        return max;
    }
}