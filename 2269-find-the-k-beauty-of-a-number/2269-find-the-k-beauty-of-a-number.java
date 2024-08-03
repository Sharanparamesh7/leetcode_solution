class Solution {
    public int divisorSubstrings(int num, int k) {
        String s = num+"";
        String newstr = "";
        int count = 0;
     
        for(int i=0; i<=s.length()-k; i++){
        newstr = s.substring(i,k+i);
        int res = Integer.parseInt(newstr);
        if(res != 0 && (num % res) == 0){
            count ++;
            }
        } 
        return count;
    }
}