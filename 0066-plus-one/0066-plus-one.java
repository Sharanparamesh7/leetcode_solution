class Solution {
    public int[] plusOne(int[] digits) {
        if(digits.length > 1){
        digits[digits.length-1] ++;
        
        }
        else if(digits[0] == 9){
            int count = 1;
           for(int i =0 ;i<2 ; i++){
            digits[i] = count;
            count =0;
           }
        }
        return digits;
    }
}