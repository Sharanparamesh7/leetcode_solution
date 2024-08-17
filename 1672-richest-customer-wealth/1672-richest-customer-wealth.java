class Solution {
    public int maximumWealth(int[][] acc) {
        int n = acc.length;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<acc[i].length; j++){
                sum += acc[i][j];
            }
            max = Math.max(max,sum);
            sum = 0;
        }
        return max;
    }
}