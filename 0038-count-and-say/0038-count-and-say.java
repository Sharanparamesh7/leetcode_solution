class Solution {
    public String countAndSay(int n) {
      String s ="1";
      for(int i = 1; i < n; i++){
        s = check(s,n);
      }
      return s;
    }

public String check(String s, int n){
   
    String str="";
    int count = 1;
    int i;
       for( i=0; i<s.length()-1; i++){
        if(s.charAt(i) == s.charAt(i+1)){
            count ++;
        }
        else{
          str += count+""+s.charAt(i);
          count = 1;
        }
       }
        str += count+""+s.charAt(i);
        
       return str;
}
}