class Solution {
    public int strStr(String s, String r) {
        if(r.length() <= s.length()){
        for(int i=0; i < s.length(); i++){
            if(s.charAt(i) == r.charAt(0)){
               if(check(i,r,s)){
                return i;
               }
            }
        }
        }
        return -1;
    }
        public boolean check(int n,String r,String s){
            
            for(int i=0;i<r.length();i++){
                if(n < s.length()){
                if(r.charAt(i)==s.charAt(n++)){
                    continue;
                }
                else{
                    return false;
                }
                }
                else {
                    return false;
                }
            }
            return true;
        }
    }
