class Solution {
    public void solve(int[] nums,int start,int end,List<List<Integer>> res){
        List<Integer> list = new ArrayList<>();
        if(start == end){
            for(int i=0; i<=end; i++){
                list.add(nums[i]);
            }
            res.add(new ArrayList<>(list));
            return;
        }
        else{
            for(int i=start;i<=end; i++){
                int temp = nums[i];
                nums[i] = nums[start];
                nums[start] = temp;
                solve(nums,start+1,end,res);
                temp = nums[i];
                nums[i] = nums[start];
                nums[start] = temp;
            }
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        solve(nums,0,nums.length-1,res);
        Set<List<Integer>> uniqueSet = new HashSet<>(res);
        List<List<Integer>> uniqueList = new ArrayList<>(uniqueSet);
        return uniqueList;
    }
}