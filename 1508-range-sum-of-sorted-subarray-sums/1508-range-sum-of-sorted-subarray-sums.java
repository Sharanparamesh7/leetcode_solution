class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
      int size = (n * (n + 1))/2;
      int a[] = new int[size];
    for(int i=0; i<n; i++){
         int sum = 0;
        for(int j=i; j<n; j++){
            sum += nums[j];
            a[--size] = sum;
        }
      }
      Arrays.sort(a);
    long sum1 = 0;
      for(int i=left - 1; i<right;i++){
        sum1 += a[i];
      }
      return (int)(sum1 % 1000000007);
    }
}