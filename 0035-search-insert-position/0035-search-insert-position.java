class Solution {
    public int searchInsert(int[] nums, int k) {
       int start =0;
       int mid=0;
       int end = nums.length-1;
       while(start <= end){
        mid = (start + end)/2;
        if(nums[mid] == k){
            return mid;
        }
        if(nums[mid] < k){
            start = mid + 1;
        }
        else{
            end = mid - 1;
        }
       }
       return start;
    }
}