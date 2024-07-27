class Solution {
    public int mostWordsFound(String[] sen) {
       
        int tot = 0;
        for(int i=0; i<sen.length; i++){
            String str[] = sen[i].split(" ");
            tot = Math.max(tot , str.length);

        }
        return tot;
               
    }
}