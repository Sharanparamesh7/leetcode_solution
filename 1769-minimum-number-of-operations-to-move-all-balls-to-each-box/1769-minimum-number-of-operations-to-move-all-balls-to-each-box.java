class Solution {
    public int[] minOperations(String boxes) {
        int sum = 0;
        int val = 0;
        int arr[] = new int[boxes.length()];
        if(boxes.length() > 1){
            for(int i=0; i<boxes.length(); i++){
                for(int j=0; j<boxes.length(); j++){
                    if(boxes.charAt(j) == '1'){
                        val = Math.abs(j-i);
                        sum += val;

                    }
                }
                arr[i] = sum;
               sum = 0;
        }
        
     
    }
     return arr;
}
}