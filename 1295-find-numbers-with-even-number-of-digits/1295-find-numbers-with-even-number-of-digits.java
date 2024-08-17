class Solution {
    public int findNumbers(int[] nums) {
        int n = nums.length;
        String s[] = new String[n];
        int count = 0;
        for(int i=0; i<n; i++){
            s[i] = nums[i] + "";
        }
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = s[i].length();
        }
     for(int i=0; i<n; i++){
        if(arr[i] % 2 == 0){
            count++;
        }
     }
     return count;
    }
}