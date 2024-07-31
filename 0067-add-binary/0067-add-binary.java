class Solution {
    public String addBinary(String a, String b) {
       while(a.length() != b.length()){
        if(a.length()<b.length()) a='0'+a;
        else b='0'+b;

    }
    int carry = 0;
    String sum = "";
    for(int i=a.length()-1; i>=0; i--){
        int p=carry+a.charAt(i)-'0' + b.charAt(i)-'0';
        if(p==2){
            carry=1;
            sum ="0"+sum;
        }
        else if(p==3) {
              carry=1;
            sum ="1"+sum;
        }
        else{
            carry=0;
            sum = p+""+sum;
        }
        
    }
    if(carry !=0) sum="1"+sum;
    
    return sum;
}
}